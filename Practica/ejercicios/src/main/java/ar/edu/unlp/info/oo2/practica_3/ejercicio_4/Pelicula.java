package ar.edu.unlp.info.oo2.practica_3.ejercicio_4;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private int estreno;
    private double puntaje;
    private ArrayList<Pelicula> similares;

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

    public void agregarSimilar(Pelicula p){
        this.similares.add(p);
    }

}
