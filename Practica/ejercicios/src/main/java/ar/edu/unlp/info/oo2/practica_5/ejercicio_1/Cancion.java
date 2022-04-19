package ar.edu.unlp.info.oo2.practica_5.ejercicio_1;

public class Cancion {
    
    private String nombre;

    public Cancion(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre.toUpperCase();
    }

    
}
