package br.com.exercicios.exercicio8;

import java.math.BigDecimal;

public class Sedex implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        if (pedido.getCepDestino().length() != 8) {
            throw new IllegalArgumentException("CEP inválido para Sedex.");
        }
        return new BigDecimal("25.50");
    }
}