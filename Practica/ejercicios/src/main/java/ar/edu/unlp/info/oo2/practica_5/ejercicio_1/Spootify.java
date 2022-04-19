package ar.edu.unlp.info.oo2.practica_5.ejercicio_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Spootify {
    
    List<Usuario> usuarios;
    List<Autor> autores;

    public Spootify(){
        this.usuarios = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u){
        this.usuarios.add(u);
    }

    public void agregarAutor(Autor a){
        this.autores.add(a);
    }

    // Podría reemplazarse con un Strategy ???
    public List<Cancion> buscarPorTitulo(String s){
        String buscar = s.toUpperCase();
        List<Cancion> canciones = new ArrayList<>();

        this.autores.stream()
                    .forEach(i -> canciones.addAll(i.getCanciones()));
        
        return canciones.stream()
                            .filter(i -> i.getNombre().contains(buscar))
                            .collect(Collectors.toList());
    }

    // Capaz podría delegar el filter al Autor 🤨
    public List<Cancion> buscarPorAutor(String s){
        String buscar = s.toUpperCase();
        List<Cancion> canciones = new ArrayList<>();

        this.autores.stream()
                    .filter(i -> i.getNombre().contains(buscar))
                    .forEach(i -> canciones.addAll(i.getCanciones()));
        
        return canciones;
    }

    public List<Cancion> buscarPorAlbum(String s){
        String buscar = s.toUpperCase();

        List<Album> coincidencias = new ArrayList<>();
        List<Cancion> canciones = new ArrayList<>();

        this.autores.stream()
                    .forEach(i -> coincidencias.addAll(i.getAlbums()));

        coincidencias.stream()
                     .filter(i -> i.getNombre().contains(buscar))
                     .forEach(i -> canciones.addAll(i.getCanciones()));

        return canciones;
    }

}
