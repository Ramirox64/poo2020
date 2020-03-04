package polimorfismo_poo;

public  class EmpleadoAsalariado extends Empleado12 {
    private double sueldo_mensual;

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definida en la clas epadre
     */
    @Override
    public void calcularSueldoQna(){
        sueldo=sueldo_mensual/2;

    }
}
