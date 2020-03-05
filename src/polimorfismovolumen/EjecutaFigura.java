package polimorfismovolumen;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        boolean bandera=true;
        while(bandera==true){
            int opcion;
            System.out.println("\tMenu de calculo");
            System.out.println("1.Calcular area del Cubo");
            System.out.println("2.Calcular area del Cilindro");
            System.out.println("3.Calcular area del Cono");
            System.out.println("4.Calcular area de la Esfera");
            System.out.println("");
            System.out.println("Selecciones una opcion del 1-4");
            opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                    Cubo cubo=new Cubo();
                    System.out.println("\tArea del Cubo");
                    System.out.println("Ingrese el lado del cubo");
                    cubo.setLadoCua(teclado.nextDouble());
                    cubo.calcularArea();
                    System.out.println("El area del Cubo es: "+cubo.getArea());
                    System.out.println("--------------------------------------");
                    bandera=false;
                    break;
                case 2:
                    Cilindro cilindro=new Cilindro();
                    System.out.println("\tArea del Cilindro");
                    System.out.println("Ingrese el radio del Cilindro");
                    cilindro.setRadioCil(teclado.nextDouble());
                    System.out.println("Ingrese la altura del Cilindro");
                    cilindro.setAltCil(teclado.nextDouble());
                    cilindro.calcularArea();
                    System.out.println("El area del Cilindro es: "+cilindro.getArea());
                    System.out.println("--------------------------------------");
                    bandera=false;
                    break;
                case 3:

                    Cono cono= new Cono();
                    System.out.println("\tArea del Cono");
                    System.out.println("Ingrese radio del Cono");
                    cono.setRadioCon(teclado.nextDouble());
                    System.out.println("Ingrese altura del Cono");
                    cono.setAltCon(teclado.nextDouble());
                    cono.calcularArea();
                    System.out.println("El area del Cono es: "+cono.getArea());
                    bandera=false;
                    break;
                case 4:
                    Esfera esfera=new Esfera();
                    System.out.println("\tArea de la Esfera");
                    System.out.println("Ingrese radio de la Esfera");
                    esfera.setRadioEsf(teclado.nextDouble());
                    esfera.calcularArea();
                    System.out.println("El area de la esfera es: "+esfera.getArea());
                    bandera=false;
                    break;


            }

        }












    }
}
