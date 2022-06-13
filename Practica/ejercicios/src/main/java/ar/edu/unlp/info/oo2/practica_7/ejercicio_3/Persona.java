package ar.edu.unlp.info.oo2.practica_7.ejercicio_3;

import java.util.ArrayList;

public class Persona {
    
    private String nombre;
    private ArrayList<Proyecto> proyectos;

    public Persona(String nombre){
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public Proyecto crearProyecto(String titulo,double meta){
        Proyecto p = new Proyecto(titulo,meta,this);
        this.proyectos.add(p);
        return p;
    }

    public void invertir(Proyecto p,double monto){
        p.invertir(monto);
    }

    public void cancelar(Proyecto p){
        if (proyectos.contains(p)){
            p.cancelar();
        } else throw new RuntimeException("No sos el responsable de este proyecto");
    }
}
