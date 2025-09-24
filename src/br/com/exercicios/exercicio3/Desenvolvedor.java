package br.com.exercicios.exercicio3;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario {

    private static final BigDecimal BONUS_PERCENTUAL = new BigDecimal("0.10");

    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        return salario.multiply(BONUS_PERCENTUAL);
    }
}