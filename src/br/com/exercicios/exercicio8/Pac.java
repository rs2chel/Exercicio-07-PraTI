package br.com.exercicios.exercicio8;
import java.math.BigDecimal;

public class Pac implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        if (pedido.getCepDestino().length() != 8) {
            throw new IllegalArgumentException("CEP inválido para PAC.");
        }
        return new BigDecimal("15.00");
    }
}