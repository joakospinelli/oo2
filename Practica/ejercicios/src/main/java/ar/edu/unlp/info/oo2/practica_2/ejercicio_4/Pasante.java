package ar.edu.unlp.info.oo2.practica_2.ejercicio_4;

public class Pasante extends Empleado {

    private int examenes;

    public Pasante(int examenes){
        this.examenes = examenes;
    }

    public int getBasico(){
        return 20000;
    }

    public int getAdicional(){
        return  2000 * examenes;

    }

}
