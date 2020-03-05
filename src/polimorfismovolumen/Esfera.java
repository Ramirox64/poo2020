package polimorfismovolumen;

public class Esfera extends Figura{
    private double radioEsf;

    public double getRadioEsf() {
        return radioEsf;
    }

    public void setRadioEsf(double radioEsf) {
        this.radioEsf = radioEsf;
    }
    @Override
    public void calcularArea(){
        area=4/3*(Math.PI*Math.pow(radioEsf,3));
    }
}
