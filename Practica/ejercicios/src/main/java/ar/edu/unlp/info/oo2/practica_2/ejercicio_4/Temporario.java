package ar.edu.unlp.info.oo2.practica_2.ejercicio_4;

public class Temporario extends Empleado {
    
    private int horas;
    private int hijos;
    private boolean casado;

    public Temporario(int horas, int hijos, boolean casado){
        this.horas = horas;
        this.hijos = hijos;
        this.casado = casado;
    }

    public int getBasico(){
        return 20000 + (300 * horas);
    }

    public int getAdicional(){
        if (this.casado)
            return 5000 + (2000 * hijos);
        return (2000 * hijos);
    }
}
