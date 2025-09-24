package br.com.exercicios.exercicio4;

public class Carro implements IMeioTransporte {
    private int velocidade = 0;
    private final int VELOCIDADE_MAXIMA = 200;

    @Override
    public void acelerar(int velocidadeAumento) {
        if (velocidadeAumento <= 0) {
            throw new IllegalArgumentException("O aumento de velocidade deve ser positivo.");
        }
        this.velocidade += velocidadeAumento;
        if (this.velocidade > VELOCIDADE_MAXIMA) {
            this.velocidade = VELOCIDADE_MAXIMA;
            System.out.println("Velocidade máxima atingida.");
        }
        System.out.println("Carro acelerando. Velocidade atual: " + velocidade + " km/h.");
    }

    @Override
    public void frear(int velocidadeDiminuicao) {
        if (velocidadeDiminuicao <= 0) {
            throw new IllegalArgumentException("A diminuição de velocidade deve ser positiva.");
        }
        this.velocidade -= velocidadeDiminuicao;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
        System.out.println("Carro freando. Velocidade atual: " + velocidade + " km/h.");
    }

    @Override
    public int getVelocidadeAtual() {
        return velocidade;
    }
}