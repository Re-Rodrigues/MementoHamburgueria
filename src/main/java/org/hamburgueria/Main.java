package org.hamburgueria;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        Historico historico = new Historico();

        pedido.setDescricao("Hamburguer simples");
        historico.salvar(pedido.salvar());

        pedido.setDescricao("Hamburguer com bacon");
        historico.salvar(pedido.salvar());

        pedido.setDescricao("Hamburguer com bacon e queijo");

        System.out.println("Atual: " + pedido.getDescricao());

        // voltar para estado anterior
        pedido.restaurar(historico.getEstado(0));

        System.out.println("Restaurado: " + pedido.getDescricao());
    }
}