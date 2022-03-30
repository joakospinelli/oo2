package ar.edu.unlp.info.oo2.practica_2.ejercicio_4;

public class Planta extends Empleado {
    
    private int antiguedad;
    private int hijos;
    private boolean casado;

    public Planta(int antiguedad, int hijos, boolean casado){
        this.antiguedad = antiguedad;
        this.hijos = hijos;
        this.casado = casado;
    }

    public int getBasico(){
        return 50000;
    }

    public int getAdicional(){
        if (this.casado)
            return 5000 + (2000 * hijos) + (2000 * antiguedad);
        return (2000 * hijos) + (2000 * antiguedad);
    }
}
