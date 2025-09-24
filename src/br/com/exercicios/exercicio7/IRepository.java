package br.com.exercicios.exercicio7;

import java.util.Optional;
import java.util.List;

public interface IRepository<T extends Identificavel<ID>, ID> {
    T salvar(T entidade);
    Optional<T> buscarPorId(ID id);
    List<T> listarTodos();
    void remover(ID id);

    class EntidadeNaoEncontradaException extends RuntimeException {
        public EntidadeNaoEncontradaException(String message) {
            super(message);
        }
    }
}