package br.com.exercicios.exercicio8;

import java.math.BigDecimal;

public class RetiradaNaLoja implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return BigDecimal.ZERO;
    }
}