package br.com.exercicios.exercicio1;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        // Uso válido
        Produto p1 = new Produto("Smartphone", new BigDecimal("1500.00"), 10);
        System.out.println("Produto criado: " + p1);

        // Alteração válida
        p1.setPreco(new BigDecimal("1450.00"));
        System.out.println("Preço alterado: " + p1.getPreco());

        // Tentativa de atribuições inválidas
        try {
            p1.setNome("");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao tentar definir nome vazio: " + e.getMessage());
        }

        try {
            p1.setPreco(new BigDecimal("-100"));
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao tentar definir preço negativo: " + e.getMessage());
        }

        try {
            p1.setQuantidadeEmEstoque(-5);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao tentar definir quantidade negativa: " + e.getMessage());
        }
    }
}