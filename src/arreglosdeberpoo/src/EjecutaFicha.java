package TrabajoExtraClase;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class EjecutaFicha {
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       String nombre[]=new String[5];
       int edad[]=new int[5];
       String universidad[]=new String[5];
       int celular[]=new int[5];

       Ficha ficha=new Ficha();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Ingrese su nombre");
            nombre[i]=teclado.nextLine();
            System.out.println("Ingrese su edad");
            edad[i]=teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese Universidad");
            universidad[i]=teclado.nextLine();
            System.out.println("Ingrese celular");
            celular[i]=teclado.nextInt();
            teclado.nextLine();
        }
        ficha.setNombre(nombre);
        ficha.setEdad(edad);
        ficha.setUniversidad(universidad);
        ficha.setCelular(celular);

        for (int i = 0; i <5 ; i++) {
            System.out.println("__________________FICHA DE EMPLEADO__________________");
            System.out.println("-Nombre      : "+nombre[i]);
            System.out.println("-Edad        : "+edad[i]);
            System.out.println("-Universdiad : "+universidad[i]);
            System.out.println("-Celular     : "+celular[i]);
        }
    }


}
