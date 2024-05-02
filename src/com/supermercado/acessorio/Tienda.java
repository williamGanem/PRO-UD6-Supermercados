package com.supermercado.acessorio;

public class Tienda {

    private String[] listaCompra;
    
    public Tienda(String[] listaCompra) {
        this.listaCompra = listaCompra;
    }

    public String[] getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(String[] listaCompra) {
        this.listaCompra = listaCompra;
    }

    public static String[] getProductos() {
        return productos;
    }

    public static void setProductos(String[] productos) {
        Tienda.productos = productos;
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
        final int NUMERO_PRODUCTO = (int) (Math.random() * 12);

        for (int i = 0; i <= NUMERO_PRODUCTO; i++) {
            ListaCompra[i] = productos[(int) (Math.random() * 12)];

        }
    }
}