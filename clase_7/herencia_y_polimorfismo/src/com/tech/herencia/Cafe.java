package com.tech.herencia;

public class Cafe extends Producto implements Descontable{
    
    private String tipoGrano;

    public Cafe(String nombre, double precio, String tipoGrano){
        super(nombre, precio);
        this.tipoGrano = tipoGrano;
    }

    @Override
    public double calcularPrecioFinal(){
        return getPrecio() * 0.90;
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + " Tipo de grano: " + tipoGrano;
    }

    @Override
    public void aplicarDescuento(double porcentaje){
        setPrecio(getPrecio() * (1 - porcentaje / 100));
    }

    public String getTipoGrano(){
        return tipoGrano;
    }

    public void setTipoGrano(String tipoGrano){
        this.tipoGrano = tipoGrano;
    }
}