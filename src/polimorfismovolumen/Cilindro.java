package polimorfismovolumen;

public class Cilindro extends Figura{
    private double radioCil;
    private double altCil;

    public double getRadioCil() {
        return radioCil;
    }

    public void setRadioCil(double radioCil) {
        this.radioCil = radioCil;
    }

    public double getAltCil() {
        return altCil;
    }

    public void setAltCil(double altCil) {
        this.altCil = altCil;
    }
    @Override
    public void calcularArea(){
        area=Math.PI*Math.pow(radioCil,2)*Math.pow(altCil,2);
    }
}
