package br.com.exercicios.exercicio6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Objetos de valor
        Produto tv = new Produto("TV 55 Polegadas", new BigDecimal("3500.00"));
        Produto fone = new Produto("Fone Bluetooth", new BigDecimal("250.00"));

        // Criação e modificação do carrinho (sempre criando novas instâncias)
        Carrinho c1 = new Carrinho();
        System.out.println("Carrinho inicial: " + c1);

        Carrinho c2 = c1.adicionarItem(new ItemCarrinho(tv, 1));
        System.out.println("Carrinho 1: " + c1.getTotal()); // c1 permanece inalterado
        System.out.println("Carrinho 2 após adicionar TV: " + c2.getTotal());

        Carrinho c3 = c2.adicionarItem(new ItemCarrinho(fone, 2));
        System.out.println("Carrinho 2: " + c2.getTotal()); // c2 permanece inalterado
        System.out.println("Carrinho 3 após adicionar Fone: " + c3.getTotal());

        Carrinho c4 = c3.aplicarCupom(new BigDecimal("10"));
        System.out.println("Total do carrinho 3 (sem cupom): " + c3.getTotal());
        System.out.println("Total do carrinho 4 (com 10% de cupom): " + c4.getTotal());
    }
}