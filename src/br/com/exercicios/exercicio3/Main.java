package br.com.exercicios.exercicio3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Ana Souza", new BigDecimal("8000.00")));
        funcionarios.add(new Desenvolvedor("Carlos Silva", new BigDecimal("5000.00")));
        funcionarios.add(new Gerente("Fernanda Costa", new BigDecimal("9500.00")));

        System.out.println("--- Cálculo de Bônus ---");
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome());
            System.out.println("Salário: R$" + f.getSalario());
            System.out.println("Bônus: R$" + f.calcularBonus());
            System.out.println("------------------------");
        }
    }
}