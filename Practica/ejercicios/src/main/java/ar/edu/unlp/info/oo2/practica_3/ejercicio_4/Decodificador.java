package ar.edu.unlp.info.oo2.practica_3.ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

    private List<Pelicula> conocidas;
    private List<Pelicula> grilla;
    private Sugerencia sugerencia;

    public Decodificador(List<Pelicula> grilla){
        this.conocidas = new ArrayList<>();
        this.grilla = grilla;
    }

    public void setSugerencia(Sugerencia s){
        this.sugerencia = s;
    }

    public void comprarPelicula(Pelicula p){
        this.conocidas.add(p);
    }

    public List<Pelicula> sugerirPeliculas(){
        List<Pelicula> peliculas = this.sugerencia.sugerir(grilla);
        return peliculas;
    }

    public List<Pelicula> getPeliculas(){
        return this.grilla;
    }
    
}
