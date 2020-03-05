package polimorfismoautomotriz;

public class Administrativo extends Empleado {
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public void calcularQuincena(){
        quincena=sueldo/2;

    }

}
