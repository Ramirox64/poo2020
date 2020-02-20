package ArreglosPoo;
import java.util.Scanner;
/**
 * Ramiro Quezada; Ian Ortega; Anthonny Espinosa
 */

public class EjecutaArray {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int [] vA = new int [10];
        int [] vB = new int [10];

        Array array=new Array();
        for (int i = 0; i <10 ; i++) {
            System.out.println("Ingrese el numero del vector A");
            vA[i] = teclado.nextInt();
            System.out.println("Ingrese el numero del vector B");
            vB[i] = teclado.nextInt();

        }
        array.setVectorA(vA);
        array.setVectorB(vB);
        array.obtenerSumatoriaProductos();
        System.out.println(array.getVectorA());
        System.out.println(array.getVectorB());
        System.out.println(array.getSumatoria_producto());

    }
}
