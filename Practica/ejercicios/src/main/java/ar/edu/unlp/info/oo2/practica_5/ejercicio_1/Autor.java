package ar.edu.unlp.info.oo2.practica_5.ejercicio_1;

import java.util.List;
import java.util.ArrayList;

public class Autor {
    
    private String nombre;
    private List<Album> albums;

    public Autor(String nombre){
        this.nombre = nombre;
        this.albums = new ArrayList<Album>();
    }

    public void agregarAlbum(Album a){
        this.albums.add(a);
    }

    public List<Cancion> getCanciones(){
        List<Cancion> canciones = new ArrayList<>();
        this.albums.stream()
                    .forEach(i -> canciones.addAll(i.getCanciones()));
        return canciones;
    }

    public List<Album> getAlbums(){
        return this.albums;
    }

    public String getNombre(){
        return this.nombre.toUpperCase();
    }

}
