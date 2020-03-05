package polimorfismoautomotriz;

public class Vendedor extends Empleado{
    private double salario;
    private double valor;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void calcularQuincena(){
        quincena=salario+(valor*0.02);
    }
}
