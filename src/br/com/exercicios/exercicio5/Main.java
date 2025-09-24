package br.com.exercicios.exercicio5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("150.75");

        FormaPagamento cartao = new CartaoCredito("1234567890123456", "Maria");
        FormaPagamento boleto = new Boleto("98765432109876543210");
        FormaPagamento pix = new Pix("usuario@email.com");

        try {
            System.out.println("--- Pagamento com Cartão ---");
            cartao.validarPagamento();
            cartao.processarPagamento(valor);

            System.out.println("\n--- Pagamento com Boleto ---");
            boleto.validarPagamento();
            boleto.processarPagamento(valor);

            System.out.println("\n--- Pagamento com Pix ---");
            pix.validarPagamento();
            pix.processarPagamento(valor);
        } catch (FormaPagamento.PagamentoInvalidoException e) {
            System.err.println("Erro de validação: " + e.getMessage());
        }

        // Tentativa de pagamento inválido
        System.out.println("\n--- Tentativa de Pagamento Inválido ---");
        try {
            FormaPagamento cartaoInvalido = new CartaoCredito("123", "João");
            cartaoInvalido.validarPagamento();
        } catch (FormaPagamento.PagamentoInvalidoException e) {
            System.err.println("Erro de validação: " + e.getMessage());
        }
    }
}