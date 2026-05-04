package com.luis.practica;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Luis", "luis.lizarraga@outlook.com");
        cliente.mostrarCliente();

        System.out.println();

        Cliente clienteDos = new Cliente("Juan", "Juan4433@gmail.com");
        clienteDos.mostrarCliente();

        System.out.println();
        
        Producto producto = new Producto("Arroz", 1000, 40);
        producto.mostrarInformacion();

        System.out.println();

        Producto productoDos = new Producto("Harina", 5000, 10);
        productoDos.mostrarInformacion();
    }
}