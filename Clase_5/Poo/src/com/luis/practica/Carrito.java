package com.luis.practica;

import java.util.ArrayList;

public class Carrito {

    ArrayList<Producto> productos;


    public Carrito(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public double calcularTotal(){
        double total = 0;
        for(Producto p : productos){
            total += p.getPrecio() * p.getStock();
        }
        return total;
    }

}
