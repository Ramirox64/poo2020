package herenciavolumen;

public class Esfera {
    private double radioEsfera;
    private double volEsfera;

    public double getRadioEsfera() {
        return radioEsfera;
    }

    public void setRadioEsfera(double radioEsfera) {
        this.radioEsfera = radioEsfera;
    }

    public double getVolEsfera() {
        return volEsfera;
    }

    public void calcularVolEsfera() {
        volEsfera=4/3*(Math.PI* Math.pow(radioEsfera,3));
    }

}
