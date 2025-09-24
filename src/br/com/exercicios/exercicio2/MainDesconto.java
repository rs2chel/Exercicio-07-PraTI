package br.com.exercicios.exercicio2;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        ProdutoComDesconto p2 = new ProdutoComDesconto("Mouse Gamer", new BigDecimal("250.00"), 50);
        System.out.println("Preço original: R$" + p2.getPreco());

        // Aplicação de desconto válida
        p2.aplicarDesconto(10);
        System.out.println("Preço após 10% de desconto: R$" + p2.getPreco());

        // Tentativa de desconto inválido
        try {
            p2.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao aplicar desconto inválido: " + e.getMessage());
        }
    }
}