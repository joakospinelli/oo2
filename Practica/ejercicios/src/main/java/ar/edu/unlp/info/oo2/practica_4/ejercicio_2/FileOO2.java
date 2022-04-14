package ar.edu.unlp.info.oo2.practica_4.ejercicio_2;

import java.time.LocalDate;

public class FileOO2 implements File {
    
    private String nombre;
    private String extension;
    private String permisos;
    private double tamaño;
    private LocalDate creacion;
    private LocalDate modificacion;

    public FileOO2(String nombre,String extension,double tamaño,String permisos){
        this.nombre = nombre;
        this.extension = extension;
        this.tamaño = tamaño;
        this.permisos = permisos;
        this.creacion = LocalDate.now();
        this.modificacion = LocalDate.now();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getExtension(){
        return this.extension;
    }

    public String getPermisos(){
        return this.permisos;
    }

    public double getTamaño(){
        return this.tamaño;
    }

    public LocalDate getCreacion(){
        return this.creacion;
    }

    public LocalDate getModificacion(){
        return this.modificacion;
    }

    @Override
    public String prettyPrint() {
        return "";
    }

}
