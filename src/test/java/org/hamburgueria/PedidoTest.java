package org.hamburgueria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveSalvarEstado() {
        Pedido pedido = new Pedido();

        pedido.setDescricao("Hamburguer simples");

        PedidoMemento memento = pedido.salvar();

        assertEquals("Hamburguer simples", memento.getEstado());
    }

    @Test
    void deveRestaurarEstado() {
        Pedido pedido = new Pedido();

        pedido.setDescricao("Hamburguer simples");
        PedidoMemento memento = pedido.salvar();

        pedido.setDescricao("Hamburguer com bacon");

        pedido.restaurar(memento);

        assertEquals("Hamburguer simples", pedido.getDescricao());
    }

    @Test
    void deveGerenciarHistorico() {
        Pedido pedido = new Pedido();
        Historico historico = new Historico();

        pedido.setDescricao("A");
        historico.salvar(pedido.salvar());

        pedido.setDescricao("B");
        historico.salvar(pedido.salvar());

        pedido.setDescricao("C");

        pedido.restaurar(historico.getEstado(1));

        assertEquals("B", pedido.getDescricao());
    }
}