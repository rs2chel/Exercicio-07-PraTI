package br.com.exercicios.exercicio5;

import java.math.BigDecimal;

public abstract class FormaPagamento {

    public abstract void validarPagamento() throws PagamentoInvalidoException;
    public abstract void processarPagamento(BigDecimal valor);

    public static class PagamentoInvalidoException extends RuntimeException {
        public PagamentoInvalidoException(String message) {
            super(message);
        }
    }
}