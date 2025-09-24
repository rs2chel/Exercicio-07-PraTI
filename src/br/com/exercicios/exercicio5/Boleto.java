package br.com.exercicios.exercicio5;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {

    private String codigoDeBarras;

    public Boleto(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (codigoDeBarras == null || codigoDeBarras.length() < 20) {
            throw new PagamentoInvalidoException("Código de barras do boleto inválido.");
        }
        System.out.println("Boleto validado com sucesso.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Gerando boleto no valor de R$" + valor + ".");
        // Simulação de processamento
    }
}