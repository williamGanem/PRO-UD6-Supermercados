package com.supermercado.acessorio;

import java.util.Stack;

public class Cesta {
    private Stack<String> pilaProductos = new Stack<>();
    private int numeroProductoAleatorios;

    public Cesta(Stack<String> pilaProductos, int numeroProducto) {
        this.pilaProductos = añadirListaCompra();
        this.numeroProductoAleatorios = getNumeroProductoAleatorios();
    }

    public Stack<String> getPilaProductos() {
        return pilaProductos;
    }

    public void setPilaProductos(Stack<String> pilaProductos) {
        this.pilaProductos = pilaProductos;
    }

    public int numeroProductoAleatoriosCliente() {
        numeroProductoAleatorios = (int) (Math.random() * 10) + 1;

        return numeroProductoAleatorios;

    }

    // añadir lista de compra a la cesta
    public Stack<String> añadirListaCompra() {
        for (int i = 0; i < numeroProductoAleatoriosCliente(); i++) {
            this.pilaProductos.add(Tienda.productosAleatorios());
        }
        return this.pilaProductos;
    }

    public int getNumeroProductoAleatorios() {
        return numeroProductoAleatorios;
    }

    @Override
    public String toString() {
        String mensaje = "Pila de Productos es: ";
        for (String pila : pilaProductos) {
            mensaje += pila + ",";
        }
        return mensaje;
    }

}
