package ar.edu.unlp.info.oo2.practica_2.ejercicio_3;

import java.util.ArrayList;
import java.time.LocalDate;

public class FileSystem {
    
    private ArrayList<ArchivoComponent> archivos;

    public FileSystem(){
        this.archivos = new ArrayList<>();
    }

    public Directorio agregarArchivo(String nombre,LocalDate fecha){
        Directorio d = new Directorio(nombre,fecha);
        archivos.add(d);
        return d;
    }

    public ArchivoComponent agregarArchivo(String nombre,LocalDate fecha,int tamaño){
        ArchivoComponent a = new Archivo(nombre,fecha,tamaño);
        archivos.add(a);
        return a;
    }

}
