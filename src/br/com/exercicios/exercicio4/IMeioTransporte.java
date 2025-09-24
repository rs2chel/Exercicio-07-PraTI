package br.com.exercicios.exercicio4;

public interface IMeioTransporte {
    void acelerar(int velocidadeAumento);
    void frear(int velocidadeDiminuicao);
    int getVelocidadeAtual();
}