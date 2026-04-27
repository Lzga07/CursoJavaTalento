package com.luis.arrays;

public class Arrays {
    public static void main(String[] args) {
        
        String[] productos = new String[5];

        productos[0] = "Café Molido";
        productos[1] = "Té Verde";
        productos[2] = "Té Orgánico";
        productos[3] = "Café Espresso";
        productos[4] = "Café Árabe";

        for(int i = 0; i < productos.length; i++){
            System.out.println("Producto: " + productos[i]);
        }

    }
}
