package br.com.exercicios.exercicio8;

import java.math.BigDecimal;

public class Pedido {
    private String cepDestino;
    private BigDecimal valorTotal;
    private CalculadoraFrete calculadoraFrete;

    public Pedido(String cepDestino, BigDecimal valorTotal, CalculadoraFrete calculadoraFrete) {
        this.cepDestino = cepDestino;
        this.valorTotal = valorTotal;
        this.calculadoraFrete = calculadoraFrete;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setCalculadoraFrete(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public BigDecimal getValorFrete() {
        return calculadoraFrete.calcular(this);
    }
}