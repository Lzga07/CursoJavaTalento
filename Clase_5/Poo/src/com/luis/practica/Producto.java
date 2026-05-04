package com.luis.practica;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    private static int productosCreados = 0;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        productosCreados++;
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


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }


    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public static int getContadorProductos(){
        return productosCreados;
    }
}