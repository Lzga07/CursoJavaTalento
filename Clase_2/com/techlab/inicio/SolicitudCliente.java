package com.techlab.inicio;

import java.util.Scanner;

public class SolicitudCliente {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int precioProducto = 25;

        System.out.print("Ingrese su nombre: ");
        String nombreCliente = entrada.nextLine();

        System.out.print("Ingrese cantidad de productos que va a comprar: ");
        int cantidadCliente = entrada.nextInt();

        System.out.println("¡Hola " + nombreCliente + "!. El costo total del pedido es: " + precioProducto * cantidadCliente);

        if (cantidadCliente > 100) {
            System.out.println("Se aplica descuento especial.");
        }

        System.out.println("Cuantos productos desea revisar?: ");
        int revisarCantidad = entrada.nextInt();

        for(int i = 1; i <= revisarCantidad; i++){
            System.out.println("Revisando producto numero: " + i);
        }

        entrada.close();
    }
}
