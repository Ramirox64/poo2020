package polimorfismo_figura;

public class Circulo3 extends Figura3{
    private double radioCirc;

    public double getRadioCirc() {
        return radioCirc;
    }

    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }
    public void calcularArea(){
        area=Math.PI*(Math.pow(radioCirc,2));
    }
}
