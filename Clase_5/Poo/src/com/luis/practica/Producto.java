package com.luis.practica;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + "$");
        System.out.println("Precio con descuento: " + calcularDescuento() + "$");
        System.out.println("Stock: " + stock);
    }

    public double calcularDescuento(){
        return precio * 0.90;
    }
}