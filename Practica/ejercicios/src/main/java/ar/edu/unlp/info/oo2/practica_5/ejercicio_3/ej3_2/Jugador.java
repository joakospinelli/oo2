package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_2;

// Bad smell: envidia de atributos, clase de datos
// Refactoring usando: Move method
public class Jugador {
    
    private String nombre;
    private String apellido;
    private int puntuacion;

    public Jugador(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntuacion = 0;
    }

    public void incrementarPuntuacion(){
        this.puntuacion += 100;
    }

    public void decrementarPuntuacion(){
        this.puntuacion -= 50;
    }

    public int getPuntuacion(){
        return this.puntuacion;
    }

    public String toString(){
        return this.nombre + " " + this.apellido;
    }

}
