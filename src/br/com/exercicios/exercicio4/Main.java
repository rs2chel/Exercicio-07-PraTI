package br.com.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IMeioTransporte> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Bicicleta());
        veiculos.add(new Trem());

        for (IMeioTransporte veiculo : veiculos) {
            System.out.println("\n--- Operando " + veiculo.getClass().getSimpleName() + " ---");
            veiculo.acelerar(10);
            veiculo.acelerar(30);
            veiculo.frear(5);
        }

        // Tratamento de exceção
        try {
            veiculos.get(0).acelerar(-5);
        } catch (IllegalArgumentException e) {
            System.err.println("\nErro ao acelerar: " + e.getMessage());
        }
    }
}