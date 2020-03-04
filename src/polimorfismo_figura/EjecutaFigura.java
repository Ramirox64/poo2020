package polimorfismo_figura;
import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Triangulo3 triangulo = new Triangulo3();
        System.out.println("Calcular el area del triangulo:");
        System.out.println("Ingrese la base del triangulo:");
        triangulo.setBaseTrias(teclado.nextDouble());
        System.out.println("Ingrese la altura del triangulo:");
        triangulo.setAlturaTria(teclado.nextDouble());
        triangulo.calcularArea();
        System.out.println("El area del triangulo es: "+triangulo.getArea());
        Cuadrado3 cuadrado = new Cuadrado3();
        System.out.println("\nCalcular el area del cuadrado");
        System.out.println("Ingrese el lado del cuadrado:");
        cuadrado.setLadoCuadrado(teclado.nextDouble());
        cuadrado.calcularArea();
        System.out.println("El area del cuadrado es: "+cuadrado.getArea());
        Rectangulo3 rectangulo = new Rectangulo3();
        System.out.println("Calcular el area del rectangulo");
        System.out.println("Ingrese la base del rectangulo:");
        rectangulo.setBaseRect(teclado.nextDouble());
        System.out.println("Ingrese la altura del rectangulo:");
        rectangulo.setAltRect(teclado.nextDouble());
        rectangulo.calcularArea();
        System.out.println("El area del rectangulo es: "+rectangulo.getArea());
        Circulo3 circulo = new Circulo3();
        System.out.println("Calcular el area del circulo");
        System.out.println("Ingrese el valor del radio del circulo:");
        circulo.setRadioCirc(teclado.nextDouble());
        circulo.calcularArea();
        System.out.println("El area del circulo es: "+circulo.getArea());
    }
}

