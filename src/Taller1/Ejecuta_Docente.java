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
public class Ejecuta_Docente {
    public static void main(String[] args) {
        Docente docente = new Docente();
        docente.actualizar_nacionalidad("Ecuatoriano");
        docente.actualizar_identificacion(1105649204);
        docente.actualizar_genero("Masculino");
        docente.actualizar_apellido("Espinosa");
        docente.actualizar_nombre("Anthonny");
        docente.actualizar_edad(35);
        String mostrar_docente = docente.obtener_docente();
        System.out.println(mostrar_docente);
    }
    
}
