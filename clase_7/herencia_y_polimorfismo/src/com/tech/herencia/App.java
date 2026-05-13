package com.tech.herencia;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Producto> producto = new ArrayList<>();

        producto.add(new Te("Té verde", 2500, true));
        producto.add(new Te("Té negro", 2700, true));
        producto.add(new Te("Té matcha", 2900, false));
        producto.add(new Cafe("Espresso", 3000, "Arábica"));
        producto.add(new Cafe("Latte", 3200, "Arábica"));
        producto.add(new Cafe("Americano", 2900, "Arábica"));

        for (Producto p : producto) {
            if (p instanceof Cafe) {
                ((Cafe)p).aplicarDescuento(5);
            } else if (p instanceof Te) {
                ((Te)p).aplicarDescuento(8);
            }
            System.out.println(p.mostrarInformacion());
            System.out.println();
        }
    }
}
