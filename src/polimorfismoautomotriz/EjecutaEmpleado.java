package polimorfismoautomotriz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        String op;
        String rfc;
        String nombre;
        String departamento;
        String puesto;
        double sueldoMensual;
        double valorTrabajo = 0;
        double valorVenta = 0;
        int num;
        int totalEmp = 0;
        double totalQuin = 0;
        String cadena = "RFC\tNOMBRE\tDEPTO.\tPUESTO\tSUELDO QUINCENA\n";
        while (bandera == true) {
            int opcion;
            System.out.println("\tSUELDO EMPLEADO");
            System.out.println("Ingrese el tipo de empleado:\n1. Administrativo\n2. Mecanico\n3. Vendedor\n4. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\t Empleado Administrativo");
                    System.out.println("Ingrese el RFC: ");
                    rfc = teclado.nextLine();
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el departamento: ");
                    departamento = teclado.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el sueldo mensual: ");
                    sueldoMensual = teclado.nextDouble();
                    teclado.nextLine();

                    Administrativo empAdmvo = new Administrativo();
                    empAdmvo.setSueldo(sueldoMensual);
                    empAdmvo.setDepartamento(departamento);
                    empAdmvo.setRfc(rfc);
                    empAdmvo.setSueldo(sueldoMensual);
                    empAdmvo.setPuesto(puesto);

                    System.out.println("El rfc es: " + rfc);
                    System.out.println("El nombre es: " + nombre);
                    System.out.println("El departamento es: " + departamento);
                    System.out.println("El puesto: " + puesto);
                    System.out.println("El sueldo mensual es: " + sueldoMensual);
                    totalEmp = totalEmp + 1;
                    empAdmvo.calcularQuincena();
                    System.out.println("El sueldo Quincenal es: " + empAdmvo.getQuincena());
                    System.out.println("Desea ingresar otro empleado si/no");
                    op = teclado.nextLine().toLowerCase();
                    if (op.equals("no")) {
                        bandera = false;
                        System.out.println(totalEmp);
                    }
                case 2:
                    Mecanico mecanico = new Mecanico();
                    System.out.println("\t Empleado Administrativo");
                    System.out.println("Ingrese el RFC: ");
                    rfc = teclado.nextLine();
                    mecanico.setRfc(rfc);
                    System.out.println("Ingrese el nombre: ");
                    nombre = teclado.nextLine();
                    mecanico.setNombre(nombre);
                    System.out.println("Ingrese el departamento: ");
                    departamento = teclado.nextLine();
                    mecanico.setDepartamento(departamento);
                    System.out.println("Ingrese el puesto: ");
                    puesto = teclado.nextLine();
                    mecanico.setPuesto(puesto);
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    num = teclado.nextInt();
                    mecanico.setNum(num);
                    System.out.println("Ingrese el costo de cada trabajo: ");
                    for (int i = 0; i < num; i++) {
                        valorTrabajo = teclado.nextDouble();
                        valorTrabajo += valorTrabajo;
                    }
                    System.out.println("El rfc es: " + mecanico.getRfc());
                    System.out.println("El nombre es: " + mecanico.getNombre());
                    System.out.println("El departamento es: " + mecanico.getDepartamento());
                    System.out.println("El puesto: " + mecanico.getPuesto());
                    System.out.println("El sueldo numero de trabajos es: " + mecanico.getNum());
                    System.out.println("El costo de cada trabajo es:" +num);
                    mecanico.calcularQuincena();
                    System.out.println("E sueldo Quincenal es: " + mecanico.getQuincena());
                    System.out.println("Desea ingresar otro empleado si/no");
                    op = teclado.nextLine().toLowerCase();
                    totalEmp = totalEmp + 1;
                    if (op.equals("no")) {
                        bandera = false;
                        System.out.println(totalEmp);
                    }
                case 3:
                    System.out.println("\t Empleado Vendedor");
                    Vendedor vendedor = new Vendedor();
                    System.out.println("Ingrese el RFC: ");
                    rfc = teclado.nextLine();
                    vendedor.setRfc(rfc);
                    System.out.println("Ingrese el nombre: ");
                    nombre = teclado.nextLine();
                    vendedor.setNombre(nombre);
                    System.out.println("Ingrese el departamento: ");
                    departamento = teclado.nextLine();
                    vendedor.setDepartamento(departamento);
                    System.out.println("Ingrese el puesto: ");
                    puesto = teclado.nextLine();
                    vendedor.setPuesto(puesto);
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    num = teclado.nextInt();
                    vendedor.setValor(num);
                    teclado.nextLine();
                    System.out.println("Ingrese el costo de cada trabajo: ");
                    for (int i = 0; i < num; i++) {
                        valorVenta = teclado.nextDouble();
                        valorVenta += valorVenta;

                    }
                    System.out.println("El rfc es: " + vendedor.getRfc());
                    System.out.println("El nombre es: " + vendedor.getNombre());
                    System.out.println("El departamento es: " + vendedor.getDepartamento());
                    System.out.println("El puesto: " + vendedor.getPuesto());
                    System.out.println("El sueldo numero de trabajos es: " + vendedor.getValor());
                    System.out.println("El costo de cada trabajo es:" +num);
                    vendedor.calcularQuincena();
                    System.out.println("E sueldo Quincenal es: " + vendedor.getQuincena());
                    System.out.println("Desea ingresar otro empleado si/no");
                    op = teclado.nextLine().toLowerCase();
                    totalEmp = totalEmp + 1;
                    if (op.equals("no")) {
                        bandera = false;
                        System.out.println(totalEmp);
                    }

            }
        }
    }
}
