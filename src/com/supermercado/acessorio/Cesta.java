package com.supermercado.acessorio;
import java.util.Stack;

public class Cesta {
    private Stack<String> pilaProductos;

    public Cesta() {
        this.pilaProductos = new Stack<>();

    }

    public Stack<String> getPilaProductos() {
        return pilaProductos;
    }

    public void setPilaProductos(Stack<String> pilaProductos) {
        this.pilaProductos = pilaProductos;
    }

    // añadir lista de compra a la cesta
    public void añadirListaCompra([]listaCompra){
        for (int i = 0; i < listaCompra.length; i++) {
            this.pilaProductos.push(listaCompra[i]);
        }
    }



    public Cesta(Stack<String> pilaProductos) {
        this.pilaProductos = pilaProductos;
    }
}
