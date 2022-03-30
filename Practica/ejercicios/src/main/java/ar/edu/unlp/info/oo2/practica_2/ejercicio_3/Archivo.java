package ar.edu.unlp.info.oo2.practica_2.ejercicio_3;

import java.time.LocalDate;

public class Archivo extends ArchivoComponent {
    
    public Archivo(String nombre,LocalDate fecha,int tamaño){
        super(nombre,fecha,tamaño);
    }

    public ArchivoComponent archivoMasGrande(){
        return this;
    }

    public ArchivoComponent archivoMasNuevo(){
        return this;
    }

    public int getTamaño(){
        return this.tamaño;
    }

}
