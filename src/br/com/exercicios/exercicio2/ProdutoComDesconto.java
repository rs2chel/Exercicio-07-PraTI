package br.com.exercicios.exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProdutoComDesconto extends Produto {

    public ProdutoComDesconto(String nome, BigDecimal preco, int quantidadeEmEstoque) {
        super(nome, preco, quantidadeEmEstoque);
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Porcentagem de desconto deve ser entre 0 e 50.");
        }

        BigDecimal desconto = getPreco().multiply(BigDecimal.valueOf(porcentagem).divide(BigDecimal.valueOf(100)));
        BigDecimal novoPreco = getPreco().subtract(desconto).setScale(2, RoundingMode.HALF_UP);
        setPreco(novoPreco);
    }

    public String getPreco() {
    }
}