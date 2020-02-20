package ArreglosPoo;
import java.util.Scanner;
/**
 * Ramiro Quezada; Ian Ortega; Anthonny Espinosa
 */

public class EjecutaDesviacionMedia {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero1[]=new int[15];
        int numero2[]=new int[15];
        double desv[]=new double[15];
        int i;
        int desviacion;

        DesviacionMedia objNumeros=new DesviacionMedia();
        System.out.println("Escriba 15 numeros para calcular la media");
        for ( i = 0; i <=14 ; i++) {

            numero1[i]=teclado.nextInt();

        }
        objNumeros.setNumero(numero1);
        objNumeros.calcular_media();
        objNumeros.calcular_desviacion();

        numero2=objNumeros.getNumero();
        desv=objNumeros.getDesviacion();


        for ( i = 0; i <14 ; i++) {

            System.out.println("La desviacion del numero: "+numero2[i]+" es: " +desv[i]);
            
        }
        System.out.println("La media es: "+objNumeros.getMedia());

    }
}
