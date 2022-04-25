package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_2;

// Bad smell: envidia de atributos, clase de datos
// Refactoring usando: Move method
public class Juego {
    
    private Jugador jugador;

    public Juego(Jugador j){
        this.jugador = j;
    }

    public void incrementarPuntuacion(){
        this.jugador.incrementarPuntuacion();
    }

    public void decrementarPuntuacion(){
        this.jugador.decrementarPuntuacion();
    }

}

