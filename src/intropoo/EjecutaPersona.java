/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intropoo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjecutaPersona {
     public static void main(String[] args) {
        // Crear el scanner para la entrada de datos por teclado
        Scanner teclado = new Scanner(System.in);

        // Pedir al usuario que ingrese la informacion solicitada
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la materia que desea saber el promedio:");
        String materia = teclado.nextLine();
        System.out.println("Ingrese la nota duel primer bimestre:");
        Double nota1 = teclado.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre:");
        Double nota2 = teclado.nextDouble();


        // Llamar a la clase estudiante para crear el objeto e imprimir en pantalla
        Persona estudiante = new Estudiante(nota1, nota2, nombre, materia);
        String mensaje = estudiante.imprimir();
        System.out.println("\n"+mensaje);

    }
}
