package polimorfismoautomotriz;

public class Mecanico extends Empleado{
    private int num;
    private double costo;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    @Override
    public void calcularQuincena(){
        quincena=(num*costo)*0.04;
    }
}
