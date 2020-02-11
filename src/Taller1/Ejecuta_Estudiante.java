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
public class Ejecuta_Estudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("Anthonny");
        estudiante.actualizar_apellido("Espinosa");
        estudiante.actualizar_edad(18);
        estudiante.actualizar_genero("M");
        estudiante.actualizar_identificacion(1105649204);
        estudiante.actualizar_nacionalidad("Ecuatoriano");
        String mostrar_estudiante = estudiante.obtener_estudiante();
        System.out.println(mostrar_estudiante);
    }
    
    
}
