package com.supermercado.acessorio;

import java.util.LinkedList;
import java.util.Queue;

import com.supermercado.cliente.Cliente;

public class Cajero {

    private Queue<Object> colaClientes = new LinkedList<>();

    private int numeroCaja;

    private Cliente cliente;

    public Cajero(Queue<Object> colaClientes, int numeroCaja, Cliente cliente) {
        this.colaClientes = colaClientes;
        this.numeroCaja = numeroCaja;
        this.cliente = cliente;
    }

    public Object filaCliente() {
        colaClientes.add(cliente);
        return colaClientes;
    }

    @Override
    public String toString() {
        return "===================================\n * Número de caja: <Número de caja>: \n* Total de clientes: <Número de clientes> \n* Clientes en la fila: <Nombre cliente 1> <Nombre cliente 2>\n ===================================";
    }

}
