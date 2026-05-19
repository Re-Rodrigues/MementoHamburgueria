package org.hamburgueria;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<PedidoMemento> estados = new ArrayList<>();

    public void salvar(PedidoMemento memento) {
        estados.add(memento);
    }

    public PedidoMemento getEstado(int index) {
        return estados.get(index);
    }
}