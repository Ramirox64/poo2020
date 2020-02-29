package herenciaautomotriz;

public class Mecanico extends Empleado {
    private int num;
    private double costo;
    private double quincena;

    public Mecanico(String rfc, String nombre, String departamento, String puesto, int num, double costo){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.num = num;
        this.costo = costo;
    }
    public int getNum() {
        return num;
    }

    public double getCosto() {
        return costo;
    }

    public double calcularQuincena(){
        quincena = (num * costo) * 0.04;
        return quincena;
    }
}

