/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String genero;
    private int identificacion;
    private int edad;

    public String obtener_estudiante(){
        String estudiante = nombre+"\n"+apellido+"\n"+nacionalidad+"\n"+genero+"\n"+identificacion+"\n"+edad;
        return estudiante;
    }

    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_apellido(){
        return apellido;
    }
    public String obtener_nacionalidad(){
        return nacionalidad;
    }
    public String obtener_genero(){
        return nombre;
    }
    public int obtener_identificacion(){
        return identificacion;
    }
    public int obtener_edad(){
        return edad;
    }


    //ACTUALIZAR

    public void actualizar_nombre(String nombre){
        this.nombre= nombre;
    }
    public void actualizar_apellido(String apellido){
        this.apellido= apellido;
    }
    public void actualizar_nacionalidad(String nacionalidad){
        this.nacionalidad= nacionalidad;
    }
    public void actualizar_genero(String genero){
        this.genero= genero;
    }
    public void actualizar_edad(int edad){
        this.edad= edad;
    }
    public void actualizar_identificacion(int identificacion){
        this.identificacion= identificacion;
    }
    
}
