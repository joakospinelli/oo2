package ar.edu.unlp.info.oo2.practica_5.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nombre;
    private List<Cancion> myMusic;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.myMusic = new ArrayList<>();
    }

    public void agregarCancion(Cancion c){
        if (!this.myMusic.contains(c))
            this.myMusic.add(c);
    }

    public void eliminarCancion(Cancion c){
        if (this.myMusic.contains(c))
            this.myMusic.remove(c);
    }

    public List<Cancion> getMyMusic(){
        return this.myMusic;
    }

    public String getNombre(){
        return this.nombre.toUpperCase();
    }

}
