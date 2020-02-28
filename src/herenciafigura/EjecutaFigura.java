package herenciafigura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nombre;
        double altTrian;
        double baseTrian;
        double baseRect;
        double altRect;
        double ladoCuadrado;
        double radio;
        boolean bandera=true;
        while(bandera==true){
            System.out.println("Escriba la figura para calcular su area");
            System.out.println("1.Triangulo");
            System.out.println("2.Rectangulo");
            System.out.println("3.Cuadrado");
            System.out.println("4.Circulo");
            System.out.println("Ingrese la opcion:");
            int opcion=teclado.nextInt();
            switch(opcion){
                case 1:

                    Triangulo triangulo=new Triangulo();
                    System.out.println("Ingrese altura triangulo: ");
                    altTrian=teclado.nextDouble();
                    triangulo.setAlturaTrian(altTrian);
                    System.out.println("Ingrese base triangulo");
                    baseTrian=teclado.nextDouble();
                    triangulo.setBaseTrian(baseTrian);

                    triangulo.CalcularAreaTrian();
                    System.out.println(triangulo.getAreaTrian());
                    break;
                case 2 :
                    Rectangulo rectangulo=new Rectangulo();
                    System.out.println("Ingrese la base del rectangulo");
                    baseRect=teclado.nextDouble();
                    rectangulo.setBaseRecta(baseRect);
                    System.out.println("Ingrese la altura del rectangulo");
                    altRect=teclado.nextDouble();
                    rectangulo.setAltRecta(altRect);
                    rectangulo.calcularAreaRecta();
                    System.out.println(rectangulo.getAreaRecta());
                    break;
                case 3:
                    Cuadrado cuadrado=new Cuadrado();
                    System.out.println("Ingrese el lado del cuadrado:");
                    ladoCuadrado=teclado.nextDouble();
                    cuadrado.setLadoCuadrado(ladoCuadrado);
                    cuadrado.calcularAreaCuadrado();
                    System.out.println(cuadrado.getAreaCuadrado());
                case 4:
                    Circulo circulo=new Circulo();
                    System.out.println("Ingrese el radio del circulo");
                    radio=teclado.nextDouble();
                    circulo.setReadioCircu(radio);
                    circulo.calcularAreaCircu();
                    System.out.println(circulo.getAreaCircu());
                case 5:
                    if (opcion>4)
                    bandera=false;




            }
            System.out.println("Fin de proceso");
        }






    }


}
