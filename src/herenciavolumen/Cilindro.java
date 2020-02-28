package herenciavolumen;

public class Cilindro {
    private double alturaCilindro;
    private double radioCilindro;
    private double volumenCilindro;

    public double getAlturaCilindro() {
        return alturaCilindro;
    }

    public void setAlturaCilindro(double alturaCilindro) {
        this.alturaCilindro = alturaCilindro;
    }

    public double getRadioCilindro() {
        return radioCilindro;
    }

    public void setRadioCilindro(double radioCilindro) {
        this.radioCilindro = radioCilindro;
    }

    public double getVolumenCilindro() {
        return volumenCilindro;
    }

    public void calcularVolumenCilindro() {
        volumenCilindro=Math.PI*Math.pow(radioCilindro,2)*alturaCilindro;
    }
}
