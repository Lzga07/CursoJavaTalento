package com.luis.ejercicio;

import java.util.ArrayList;

public class ListasCadenas {
    public static void main(String[] args) {
        
        // Creamos el ArrayList con los productos mal escritos
        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add(" cAfE mOlIdO ");
        listaProductos.add("tE vErDe ");
        listaProductos.add(" aCeItE dE oLiVa ");
        listaProductos.add("pAn InTeGrAl");
        listaProductos.add("jAbOn LiQuIdO ");
        listaProductos.add(" aRroZ bLaNcO");

        // Recorre el ArrayList, y cada producto es formateado con la funcion
        for (String producto : listaProductos) {
            
            System.out.println("Producto: " + formatearNombreProducto(producto));

        }

    }

    // Funcion que recibe una cadena String, en este caso nombre de productos, y devuelve un String mostrando el nombre escrito bien.
    public static String formatearNombreProducto(String nombre){

        // A la variable nombre se le sacan los espacios de delante y detras con trim(), y se transforma a minusculas con toLowerCase()
        nombre = nombre.trim().toLowerCase();

        // Separamos las palabras con split, y las guardamos en el array
        String [] palabras = nombre.split(" ");

        // Creamos el objeto StringBuilder
        StringBuilder sb = new StringBuilder();

        // Recorremos el array palabras, donde esta ya el nombre del producto separado.
        for(int i = 0; i < palabras.length; i++){

            if (!palabras[i].isEmpty()) {
                
                // Toma la primer letra de la palabra y la transforma en mayúscula
                String primeraLetra = palabras[i].substring(0, 1).toUpperCase();

                // Toma el resto de la palabra y lo guarda en la variable resto
                String resto = palabras[i].substring(1);

                // Junta la primer letra en mayuscula (primerLetra), con resto
                sb.append(primeraLetra).append(resto);

                // Evita agregar espacio al final del texto
                if (i < palabras.length - 1) {
                    
                    sb.append(" ");

                }

            }

        }

        // Devuelve el texto armado correctamente
        return sb.toString();
    }
}
