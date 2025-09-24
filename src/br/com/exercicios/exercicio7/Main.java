package br.com.exercicios.exercicio7;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Produto, Long> produtoRepository = new InMemoryRepository<>();

        // Salvar entidades
        produtoRepository.salvar(new Produto(1L, "Laptop"));
        produtoRepository.salvar(new Produto(2L, "Monitor"));
        System.out.println("Entidades salvas.");

        // Buscar por ID
        produtoRepository.buscarPorId(1L).ifPresent(p -> System.out.println("Produto encontrado: " + p.getNome()));
        System.out.println("Produto com ID 3 existe? " + produtoRepository.buscarPorId(3L).isPresent());

        // Listar todos
        List<Produto> todos = produtoRepository.listarTodos();
        System.out.println("Todos os produtos: " + todos.size());

        // Remover
        try {
            produtoRepository.remover(2L);
            System.out.println("Produto com ID 2 removido.");
            System.out.println("Total de produtos agora: " + produtoRepository.listarTodos().size());

            // Tentar remover ID inexistente
            produtoRepository.remover(3L);
        } catch (IRepository.EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao remover: " + e.getMessage());
        }
    }
}