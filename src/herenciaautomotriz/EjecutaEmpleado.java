package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rfc;
        String nombre;
        String departamento;
        String puesto;
        double sueldoMensual;
        int num;
        double valorTrabajo = 0;
        double valorVenta = 0;
        double salario = 400;
        boolean bandera = true;
        int tipo;
        int totalEmp = 0;
        double totalQuin = 0;
        String opcion;
        String cadena = "RFC\tNOMBRE\tDEPTO.\tPUESTO\tSUELDO QUINCENA\n";

        while(bandera){
            System.out.println("Ingrese el tipo de empleado:\n1. Administrativo\n2. Mecanico\n3. Vendedor\n4. Salir");
            tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo){
                case 1:
                    System.out.println("Ingrese el RFC: ");
                    rfc = scanner.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el departamento: ");
                    departamento = scanner.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = scanner.nextLine();
                    System.out.println("Ingrese el sueldo mensual: ");
                    sueldoMensual = scanner.nextDouble();
                    scanner.nextLine();

                    Administrativo empAdmvo = new Administrativo(rfc, nombre, departamento, puesto, sueldoMensual);

                    cadena = String.format("%s%s\t%s\t%s\t%s\t%.2f", cadena, empAdmvo.getRfc(), empAdmvo.getNombre(),
                            empAdmvo.getDepartamento(), empAdmvo.getPuesto(), empAdmvo.calcularQuincena());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empAdmvo.calcularQuincena();
                    System.out.println("¿Desea ingresar otro empleado? Si/No");
                    opcion = scanner.nextLine().toLowerCase();
                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el RFC: ");
                    rfc = scanner.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el departamento: ");
                    departamento = scanner.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = scanner.nextLine();
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    num = scanner.nextInt();
                    System.out.println("Ingrese el costo de cada trabajo: ");
                    for(int i = 0; i < num; i++){
                        valorTrabajo = scanner.nextDouble();
                        valorTrabajo += valorTrabajo;
                    }

                   Mecanico empMecanico = new Mecanico(rfc, nombre, departamento, puesto, num, valorTrabajo);

                    cadena = String.format("%s%s\t%s\t%s\t%s\t%.2f", cadena, empMecanico.getRfc(),
                            empMecanico.getNombre(), empMecanico.getDepartamento(), empMecanico.getPuesto(),
                            empMecanico.calcularQuincena());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empMecanico.calcularQuincena();
                    System.out.println("¿Desea ingresar otro empleado? Si/No");
                    opcion = scanner.nextLine().toLowerCase();
                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el RFC: ");
                    rfc = scanner.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el departamento: ");
                    departamento = scanner.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = scanner.nextLine();
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    num = scanner.nextInt();
                    System.out.println("Ingrese el costo de cada trabajo: ");
                    for(int i = 0; i < num; i++){
                        valorVenta = scanner.nextDouble();
                        valorVenta += valorVenta;
                    }

                    Vendedor empVendedor = new Vendedor(rfc, nombre, departamento, puesto, salario, valorVenta);

                    cadena = String.format("%s%s\t%s\t%s\t%s\t%.2f", cadena, empVendedor.getRfc(),
                            empVendedor.getNombre(), empVendedor.getDepartamento(), empVendedor.getPuesto(),
                            empVendedor.calcularQuincena());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empVendedor.calcularQuincena();
                    System.out.println("¿Desea ingresar otro empleado? Si/No");
                    opcion = scanner.nextLine().toLowerCase();
                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}