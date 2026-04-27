package com.luis.cadenas;

public class Cadenas {
    public static void main (String[] args){

        String producto = " té CHAi ";

        System.out.println("Nombre original: " + producto);
        System.out.println("Nombre Formateado: " + formatearNombreProducto(producto));
 
        System.out.println("Longitud palabra: " + formatearNombreProducto(producto).length());
        System.out.println("La primera letra es: " + formatearNombreProducto(producto).substring(0, 1));

        String contiene = "Chai";

        if (formatearNombreProducto(producto).indexOf(contiene) != -1) {
            System.out.println("La palabra fue encontrada");
        }
    }



    public static String formatearNombreProducto(String nombre){

        nombre = nombre.trim().toLowerCase();

        String [] palabras = nombre.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < palabras.length; i++){

            if (!palabras[i].isEmpty()) {
                
                String primeraLetra = palabras[i].substring(0, 1).toUpperCase();

                String resto = palabras[i].substring(1);

                sb.append(primeraLetra).append(resto);

                if (i < palabras.length - 1) {
                    
                    sb.append(" ");

                }

            }

        }

        return sb.toString();
    }
}
