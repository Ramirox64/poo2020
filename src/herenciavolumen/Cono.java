package herenciavolumen;

public class Cono extends Figura {
    private double alturaCono;
    private double radioCono;
    private double volCono;

    public double getAlturaCono() {
        return alturaCono;
    }

    public void setAlturaCono(double alturaCono) {
        this.alturaCono = alturaCono;
    }

    public double getRadioCono() {
        return radioCono;
    }

    public void setRadioCono(double radioCono) {
        this.radioCono = radioCono;
    }

    public double getVolCono() {
        return volCono;
    }

    public void calculartVolCono() {
        volCono=(Math.pow(radioCono,2)*Math.PI)/3;

    }
}
