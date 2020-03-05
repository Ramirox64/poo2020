package polimorfismovolumen;

public class Cubo extends Figura {
     private double ladoCua;

    public double getLadoCua() {
        return ladoCua;
    }

    public void setLadoCua(double ladoCua) {
        this.ladoCua = ladoCua;
    }
    @Override
    public  void calcularArea(){
        area=Math.pow(ladoCua,3);
    }
}
