package polimorfismovolumen;

public class Cono extends Figura{
    private double radioCon;
    private double altCon;

    public double getRadioCon() {
        return radioCon;
    }

    public void setRadioCon(double radioCon) {
        this.radioCon = radioCon;
    }

    public double getAltCon() {
        return altCon;
    }

    public void setAltCon(double altCon) {
        this.altCon = altCon;
    }
    @Override
    public void calcularArea(){
        area=(Math.PI*Math.pow(radioCon,2)*altCon)/3;
    }
}
