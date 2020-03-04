package polimorfismo_figura;

public class Triangulo3 extends Figura3 {
    private double baseTrias;
    private double alturaTria;

    public double getBaseTrias() {
        return baseTrias;
    }

    public void setBaseTrias(double baseTrias) {
        this.baseTrias = baseTrias;
    }

    public double getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

public void calcularArea(){
        area=(baseTrias*alturaTria);

    }
}
