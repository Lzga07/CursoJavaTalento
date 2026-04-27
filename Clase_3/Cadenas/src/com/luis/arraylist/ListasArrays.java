package com.luis.arraylist;

import java.util.ArrayList;

public class ListasArrays {
    public static void main(String[] args) {
        
        ArrayList<String> listaProductos = new ArrayList<>();

        listaProductos.add("Café Molido");
        listaProductos.add("Té Orgánico");
        listaProductos.add("Té Verde");
        listaProductos.add("Café Espresso");
        listaProductos.add("Café Árabe");

        //Agregamos un nuevo producto
        listaProductos.add("Chocolate Amargo");

        //Eliminamos producto
        listaProductos.remove("Café Árabe");

        //Verificamos si existe "Té Verde"
        if (listaProductos.contains("Té Verde")) {
            System.out.println("El catálogo contiene Té Verde.");
        } else {
            System.out.println("No se encuentra el producto.");
        }

        for (String producto : listaProductos) {
            System.out.println("Producto: " + producto);
        }

    }
}
