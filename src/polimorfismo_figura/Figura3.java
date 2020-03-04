package polimorfismo_figura;

public abstract class Figura3 {
    protected String nomFigura;
    protected double area;

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public double getArea() {
        return area;
    }

    public abstract void calcularArea();




}
