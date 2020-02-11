/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2020;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("nombre de la cerveza es: ");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese costo: ");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese las unidades vendidas: ");
        int unidades = teclado.nextInt();
        Cerveza cerveza = new Cerveza(precio,unidades);
        System.out.println("el valor total de ventas es: "+cerveza.calcular_ventas());

    }
}
    

