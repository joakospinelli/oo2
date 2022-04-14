package ar.edu.unlp.info.oo2.practica_4.ejercicio_2;

import java.time.LocalDate;

public abstract class FileDecorator implements File {

    protected File component;

    public FileDecorator(File component){
        this.component = component;
    }

    // Template Method
    public String prettyPrint(String print){
        return print + " - " + this.component.prettyPrint();
    }

    public String getNombre(){
        return this.component.getNombre();
    }

    public String getExtension(){
        return this.component.getExtension();
    }

    public String getPermisos(){
        return this.component.getPermisos();
    }

    public double getTamaño(){
        return this.component.getTamaño();
    }

    public LocalDate getCreacion(){
        return this.component.getCreacion();
    }

    public LocalDate getModificacion(){
        return this.component.getModificacion();
    }

}
