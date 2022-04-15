package ar.edu.unlp.info.oo2.practica_3.ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private String titulo;
    private int estreno;
    private double puntaje;
    private List<Pelicula> similares;

    public Pelicula(String titulo, int estreno, double puntaje){
        this.titulo = titulo;
        this.estreno = estreno;
        this.puntaje = puntaje;
        this.similares = new ArrayList<>();
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getEstreno(){
        return this.estreno;
    }

    public double getPuntaje(){
        return this.puntaje;
    }

    public List<Pelicula> getSimilares(){
        return this.similares;
    }

    public void agregarSimilar(Pelicula p){
        if (!this.similares.contains(p)){
            this.similares.add(p);
            p.agregarSimilar(this);
        }
    }

}
