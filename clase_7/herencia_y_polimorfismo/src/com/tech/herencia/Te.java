package com.tech.herencia;

public class Te extends Producto implements Descontable{

    private boolean caliente;

    public Te(String nombre, double precio, boolean caliente){
        super(nombre, precio);
        this.caliente = caliente;
    }

    @Override
    public double calcularPrecioFinal(){
        return getPrecio() * 0.95;
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + " Caliente: " + caliente;
    }

    @Override
    public void aplicarDescuento(double porcentaje){
        setPrecio(getPrecio() * (1 - porcentaje / 100));
    }

    public boolean getCaliente(){
        return caliente;
    }

    public void setCaliente(boolean caliente){
        this.caliente = caliente;
    }

}
