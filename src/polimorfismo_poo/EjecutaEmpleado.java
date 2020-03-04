package polimorfismo_poo;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        double horas;
        double cuota;
        //Obtener el sueldo quincenal de un empleado por horas
        EmpleadosPorHora2 empHoras = new EmpleadosPorHora2();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo sueldo quincenal empleado por horas");
        System.out.println("Ingrese horas trabajadas");
        empHoras.setHoras_trabajadas(teclado.nextDouble());
        System.out.println("Ingrese la cuota por hora");
        empHoras.setCuota_por_hora(teclado.nextDouble());
        empHoras.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: " + empHoras.getSueldo());


        EmpleadoAsalariado empAs= new EmpleadoAsalariado();
        System.out.println("Calculo de sueldo quincenal de empleado asalariado");
        System.out.println("Ingrese la cuota por hora");
        empAs.setSueldo_mensual(teclado.nextDouble());
        empAs.calcularSueldoQna();
        System.out.println("Sueldo quincenal es: "+empAs.getSueldo());

    }


}


