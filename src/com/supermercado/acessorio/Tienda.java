package com.supermercado.acessorio;

public class Tienda {
    private static String[] listaCompra;

    public String[] getListaCompra() {
        return listaCompra;
    }

    private static String[] productos = { "harinaPan", "papa", "arroz", "queso", "leche", "Pan", "Huevos", "manzana",
            "lechuga", "Lentejas", "Pasta", "Carne" };

    // crear array
    // hacer un for con un numero ramdom del 0 al 12 para añador de manera aleatoria
    // items a la cesta aqui creamos los items luegos los añadimos a la lista
    // para el cliente el tamaño de la cesta entre 1-12 y luego hacer ramdom cada
    // item interno
    public static void productosAleatorios() {
        // crear numeroaleatorio de productos que se introduciran a la lista
        final int numeroProducto = (int) (Math.random() * 12);

        for (int i = 0; i <= numeroProducto; i++) {
            listaCompra[i] = productos[(int) (Math.random() * 12)];

        }
    }

}
