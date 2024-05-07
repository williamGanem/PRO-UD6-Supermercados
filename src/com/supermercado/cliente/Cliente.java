package com.supermercado.cliente;
import com.supermercado.acessorio.Cesta;
import java.util.Random;

public class Cliente {

private static String[] nombres ={"Juan","Maria","Carlos","Ana","Pedro","Laura","Luis","Marta","David","Elena","Andres","Sofia","Diego","Carmen","Raquel","Javier","Isabel","Sergio","Paula"};
private String nombre ;
private String primerArticulo;
private Cesta cesta ;

public Cliente(String nombre, Cesta cesta) {
    this.nombre = nombreAleatorio();
    this.cesta = cesta;
}
public String primerProducto (){

    return primerArticulo;
}


public static String nombreAleatorio() {    
        Random productoAleatorio = new Random();  
        int nombreAleatorio = productoAleatorio.nextInt(nombres.length);
        return nombres[nombreAleatorio]  ;
    }




    @Override
    public String toString() {
        String mensaje = " ===================================\n*Nombre: "+this.nombre+" \n"+"\n* Total de productos: "+ cesta.getNumeroProductoAleatorios() + "\n* Lista de artículos en la cesta: " + this.cesta+" "+this.cesta+"\n =================================== ";
        return mensaje;
    }
}
