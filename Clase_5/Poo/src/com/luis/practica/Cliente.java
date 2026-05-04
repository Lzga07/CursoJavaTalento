package com.luis.practica;

public class Cliente {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email){

        this.nombre = nombre;
        this.email = email;

    }

    public void mostrarCliente(){
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Email del cliente: " + email);
    }
}
