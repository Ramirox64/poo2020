package polimorfismo_figura;

public class Rectangulo3 extends Figura3 {
    private double baseRect;
    private double altRect;

    public double getBaseRect() {
        return baseRect;
    }

    public void setBaseRect(double baseRect) {
        this.baseRect = baseRect;
    }

    public double getAltRect() {
        return altRect;
    }

    public void setAltRect(double altRect) {
        this.altRect = altRect;
    }
    public void calcularArea(){
        area=baseRect*altRect;

    }
}
