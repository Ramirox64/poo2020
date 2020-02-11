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
public class Ejecuta_Universidad {
     public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.actualizar_area("tecnica");
        universidad.actualizar_carreras("Computacion");
        universidad.actualizar_infraestructura("cemento");
        universidad.actualizar_nombre("UTPL");
        universidad.actualizar_tipo("Privada");
        universidad.actualizar_ubicacion("loja");
        String mostrar_u = universidad.obtener_universidad();
        System.out.println(mostrar_u);
    }
    
}
