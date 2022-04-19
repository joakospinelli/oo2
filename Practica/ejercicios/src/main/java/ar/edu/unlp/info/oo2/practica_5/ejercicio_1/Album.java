package ar.edu.unlp.info.oo2.practica_5.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Album {
    
    private String nombre;
    private List<Cancion> canciones;

    public Album(String nombre){
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public String getNombre(){
        return this.nombre.toUpperCase();
    }

    public void agregarCancion(Cancion c){
        this.canciones.add(c);
    }

    public List<Cancion> getCanciones(){
        return this.canciones;
    }

}
