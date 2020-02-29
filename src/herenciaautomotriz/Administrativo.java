package herenciaautomotriz;

public class Administrativo extends Empleado{
    private double sueldo;
    private double quincena;

    public  Administrativo(String rfc, String nombre, String departamento, String puesto, double sueldo){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double calcularQuincena(){
        quincena = sueldo / 2;
        return quincena;
    }
}