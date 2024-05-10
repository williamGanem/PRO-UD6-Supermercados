package com.supermercado.acessorio;

import java.util.Random;

public class Tienda {

    private static String[] productos = { "harinaPan", "papa", "arroz", "queso", "leche", "Pan", "Huevos", "manzana",
            "lechuga", "Lentejas", "Pasta", "Carne" };

    public static String productosAleatorios() {
        Random productoAleatorio = new Random();
        int numeroProducto = productoAleatorio.nextInt(productos.length);
        return productos[numeroProducto];
    }

}