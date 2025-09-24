package br.com.exercicios.exercicio5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (chavePix == null || chavePix.length() < 5) {
            throw new PagamentoInvalidoException("Chave Pix inválida.");
        }
        System.out.println("Chave Pix validada com sucesso.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Processando pagamento de R$" + valor + " com Pix.");
        // Simulação de processamento
    }
}