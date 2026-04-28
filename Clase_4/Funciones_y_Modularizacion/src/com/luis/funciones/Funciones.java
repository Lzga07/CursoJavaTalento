package com.luis.funciones;

public class Funciones {
    public static void main(String[] args) {
        
        // Ejercicio 1
        System.out.println("Ejemplo 1: " + calcularImpuesto(500, 10));
        System.out.println("Ejemplo 2: " + calcularImpuesto(1000, 21));
        
        System.out.println();

        // Ejercicio 2
        System.out.println("Precio con descuento: " + calcularPrecioFinal(1000, 50, 50));

        System.out.println();

        // Ejercicio 3
        int[] stockProductos = new int[3];
        stockProductos[0] = 45;
        stockProductos[1] = 30;
        stockProductos[2] = 10;

        //Recorre array base
        System.out.println("Stock base.");
        for(int i = 0; i < stockProductos.length; i++){
            System.out.println("Stock producto " + (i + 1) + ": " + stockProductos[i]);
        }

        System.out.println();

        reponerStock(stockProductos, 1, 40);

        //Recorre array post metodo de agregar stock
        System.out.println("Nuevo stock");
        for(int i = 0; i < stockProductos.length; i++){
            System.out.println("Stock producto " + (i + 1) + ": " + stockProductos[i]);
        }

        System.out.println();

        //Ejercicio 4
        boolean esNuevo = false;

        if (esNuevo) {
            mostrarMensaje("¡Bienvenido!");
        } else{
            mostrarMensaje("¡Gracias por volver!. Compras realizadas: ", 6);
        }
    }


    public static double calcularImpuesto(double precio, double porcentaje){

        double precioFinal = precio * (1 + (porcentaje / 100)) ;

        return precioFinal;
    }


    public static double calcularPrecioFinal(double precioBase, double descuento, int cantidad){
        
        if (cantidad > 50) {
            
            descuento += 5;

        }
        double descuentoFinal = precioBase * (descuento / 100.0);

        return precioBase - descuentoFinal;
    }

    public static void reponerStock(int[] stockProductos, int indiceProducto, int stockAgregado){

        stockProductos [indiceProducto] += stockAgregado;

    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static void mostrarMensaje(String mensaje, int numero){
        System.out.println(mensaje + numero);
    }
}