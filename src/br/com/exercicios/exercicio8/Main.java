package br.com.exercicios.exercicio8;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("12345678", new BigDecimal("150.00"), new Sedex());

        System.out.println("Frete inicial (Sedex): " + pedido.getValorFrete());

        // Troca de estratégia em tempo de execução
        pedido.setCalculadoraFrete(new Pac());
        System.out.println("Frete alterado para PAC: " + pedido.getValorFrete());

        // Estratégia promocional via lambda
        CalculadoraFrete fretePromocional = p -> {
            if (p.getValorTotal().compareTo(new BigDecimal("100.00")) > 0) {
                return ZERO;
            } else {
                return new BigDecimal("10.00");
            }
        };

        pedido.setCalculadoraFrete(fretePromocional);
        System.out.println("Frete promocional: " + pedido.getValorFrete());

        // Tentativa com CEP inválido
        try {
            Pedido pedidoInvalido = new Pedido("123", new BigDecimal("50.00"), new Sedex());
            pedidoInvalido.getValorFrete();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao calcular frete: " + e.getMessage());
        }
    }
}