package herenciavolumen;

public class Cubo {
    private double aristaCubo;
    private double volCubo;

    public double getArista() {
        return aristaCubo;
    }

    public void setArista(double arista) {
       aristaCubo = arista;
    }

    public double getVolCubo() {
        return volCubo;
    }

    public void calcularVolCubo() {
        volCubo=Math.pow(aristaCubo,3);
    }
}
