/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intropoo;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String genero;
    private String religion;
    private int edad;
    private String nombre;

    /**
     * Metodo constructor de la clase Persona
     * @param genero
     * @param religion
     * @param edad
     * @param nombre
     */

    public Persona(String genero,String religion,int edad,String nombre){
        this.genero=genero;
        this.edad=edad;
        this.nombre=nombre;
        this.religion=religion;
    }
    public Persona(String genero,String religion,int edad){
        this.genero=genero;
        this.edad=edad;
        this.nombre=nombre;
        this.religion=religion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
