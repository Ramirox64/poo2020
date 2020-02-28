package herenciavolumen;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;



public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double altCil;
        double radioCil;
        double altCon;
        double radioCon;
        double aristaCubo;
        double radioEsf;
        boolean bandera=true;
        String figura;
        while(bandera==true){
            System.out.println("Ingrese el nombre de la figura para calcular su area(cilindro, esfera, cono, cubo)");
            System.out.println("Escriba salir para no realizar ninguna operacion");

            figura=teclado.nextLine();
            switch (figura){
                case "cilindro":
                    Cilindro cilindro=new Cilindro();
                    System.out.println("Ingrese altura del cilindro:");
                    altCil=teclado.nextDouble();
                    cilindro.setAlturaCilindro(altCil);
                    System.out.println("Ingrese radio del cilindro");
                    radioCil=teclado.nextDouble();
                    cilindro.setRadioCilindro(radioCil);
                    System.out.println("El volumen es: "+cilindro.getVolumenCilindro());
                    break;
                case "esfera":
                    Esfera esfera=new Esfera();
                    System.out.println("Ingrese radio de esfera");
                    radioEsf=teclado.nextDouble();
                    esfera.setRadioEsfera(radioEsf);
                    esfera.calcularVolEsfera();
                    System.out.println("El volumen es: "+esfera.getVolEsfera());
                    break;
                case "cono":
                    Cono cono=new Cono();
                    System.out.println("Ingrese altura cono");
                    altCon = teclado.nextDouble();
                    cono.setAlturaCono(altCon);
                    System.out.println("Ingrese base cono");
                    radioCon=teclado.nextDouble();
                    cono.setRadioCono(radioCon);
                    cono.calculartVolCono();
                    System.out.println("El volumen es: "+cono.getVolCono());
                    break;
                case "cubo":
                    Cubo cubo= new Cubo();
                    System.out.println("Ingrese tama;o de arista");
                    aristaCubo=teclado.nextDouble();
                    cubo.setArista(aristaCubo);
                    cubo.calcularVolCubo();
                    System.out.println("El volumen es: "+cubo.getVolCubo());
                    break;
                case "salir":
                    bandera=false;




            }


        }

    }
}
