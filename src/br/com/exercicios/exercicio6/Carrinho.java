package br.com.exercicios.exercicio6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Carrinho {
    private final List<ItemCarrinho> itens;

    public Carrinho() {
        this.itens = Collections.emptyList();
    }

    private Carrinho(List<ItemCarrinho> itens) {
        this.itens = Collections.unmodifiableList(new ArrayList<>(itens));
    }

    public Carrinho adicionarItem(ItemCarrinho novoItem) {
        if (novoItem == null) {
            throw new IllegalArgumentException("Item a ser adicionado não pode ser nulo.");
        }
        List<ItemCarrinho> novaLista = new ArrayList<>(this.itens);
        novaLista.add(novoItem);
        return new Carrinho(novaLista);
    }

    public Carrinho removerItem(Produto produtoParaRemover) {
        List<ItemCarrinho> novaLista = new ArrayList<>(this.itens);
        novaLista.removeIf(item -> item.getProduto().equals(produtoParaRemover));
        return new Carrinho(novaLista);
    }

    public Carrinho aplicarCupom(BigDecimal porcentagem) {
        if (porcentagem == null || porcentagem.compareTo(BigDecimal.ZERO) < 0 || porcentagem.compareTo(new BigDecimal("30")) > 0) {
            throw new IllegalArgumentException("Cupom deve ser entre 0 e 30%.");
        }
        List<ItemCarrinho> novaLista = new ArrayList<>();
        BigDecimal fatorDesconto = BigDecimal.ONE.subtract(porcentagem.divide(new BigDecimal("100")));
        for (ItemCarrinho item : this.itens) {
            BigDecimal novoPreco = item.getProduto().getPreco().multiply(fatorDesconto).setScale(2, RoundingMode.HALF_UP);
            novaLista.add(new ItemCarrinho(new Produto(item.getProduto().getNome(), novoPreco), item.getQuantidade()));
        }
        return new Carrinho(novaLista);
    }

    public BigDecimal getTotal() {
        return this.itens.stream()
                .map(ItemCarrinho::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "total=" + getTotal() +
                ", itens=" + itens.size() +
                '}';
    }
}