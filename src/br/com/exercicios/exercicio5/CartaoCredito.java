package br.com.exercicios.exercicio5;

import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;
    private String nomeTitular;

    public CartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (numeroCartao == null || numeroCartao.length() != 16 || !numeroCartao.matches("\\d+")) {
            throw new PagamentoInvalidoException("Número do cartão de crédito inválido.");
        }
        if (nomeTitular == null || nomeTitular.trim().isEmpty()) {
            throw new PagamentoInvalidoException("Nome do titular não pode ser vazio.");
        }
        System.out.println("Cartão de crédito validado com sucesso.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Processando pagamento de R$" + valor + " com Cartão de Crédito.");
        // Simulação de processamento
    }
}