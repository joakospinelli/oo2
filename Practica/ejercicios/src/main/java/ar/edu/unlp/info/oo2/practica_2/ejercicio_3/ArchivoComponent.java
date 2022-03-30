package ar.edu.unlp.info.oo2.practica_2.ejercicio_3;

import java.time.LocalDate;

public abstract class ArchivoComponent {
    
    protected String nombre;
    protected LocalDate fecha;
    protected int tamaño;

    public ArchivoComponent(String nombre,LocalDate fecha,int tamaño){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tamaño = tamaño;
    }

    public abstract int getTamaño();

    public abstract ArchivoComponent archivoMasGrande();

    public abstract ArchivoComponent archivoMasNuevo();

    public LocalDate getFecha(){
        return this.fecha;
    }

    public String getNombre(){
        return this.nombre;
    }

}
