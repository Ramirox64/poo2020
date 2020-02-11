/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2020;

/**
 *
 * @author Usuario
 */
public class Cerveza {
    private String nombre;
    private String tipo;
    private double precio;
    private int unidades_vendidas;
    public Cerveza (double precio,int unidades_vendidas){
        this.precio=precio;
        this.unidades_vendidas=unidades_vendidas;

    }
    public double calcular_ventas(){
        double total = precio*unidades_vendidas;
        return total;
    }
    /*
    public String salida (){
        String salida =
    }
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }
}
    

