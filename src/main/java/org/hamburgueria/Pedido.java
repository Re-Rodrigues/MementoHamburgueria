package org.hamburgueria;

public class Pedido {

    private String descricao;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public PedidoMemento salvar() {
        return new PedidoMemento(descricao);
    }

    public void restaurar(PedidoMemento memento) {
        this.descricao = memento.getEstado();
    }
}