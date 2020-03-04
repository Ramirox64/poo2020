package polimorfismo_figura;

public class Cuadrado3 extends Figura3 {
    private double ladoCuadrado;

    public double getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }


    public void calcularArea() {
        area=Math.pow(ladoCuadrado,2);
    }
}
