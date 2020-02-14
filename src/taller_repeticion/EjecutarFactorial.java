package taller_repeticion;
import java.util.Scanner;
/**
 * Integrantes: Ian Ortega, Anthonny Espinosa, Ramiro Quezada
 */
public class EjecutarFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea calcular su factorial:");
        int numero = teclado.nextInt();
        Factorial factorial = new Factorial(numero);
        factorial.calcularFactorial();
        System.out.printf("El factorial de %d es %d",numero,factorial.getResultado());
    }
}
