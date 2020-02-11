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
public class EjecutaTiempo {
    public static void main(String[] args) {
        //creacion de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(51);
        tiempo.actualizar_segundo(35);
        String mostrar_tiempo=tiempo.obtener_tiempo();
        System.out.println(mostrar_tiempo);
    }

}

