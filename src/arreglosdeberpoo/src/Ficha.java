package TrabajoExtraClase;

public class Ficha {
    private String[] Nombre=new String[5];
    private int[] Edad= new int[5];
    private String[] Universidad= new String[5];
    private int[] celular= new int [5];

    public String[] getNombre() {
        return Nombre;
    }

    public void setNombre(String[] nombre) {
        Nombre = nombre;
    }

    public int[] getEdad() {
        return Edad;
    }

    public void setEdad(int[] edad) {
        Edad = edad;
    }

    public String[] getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String[] universidad) {
        Universidad = universidad;
    }

    public int[] getCelular() {
        return celular;
    }

    public void setCelular(int[] celular) {
        this.celular = celular;
    }
}
