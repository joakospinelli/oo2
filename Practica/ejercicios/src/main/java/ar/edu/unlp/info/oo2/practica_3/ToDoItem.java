package ar.edu.unlp.info.oo2.practica_3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoItem {
    
    private ArrayList<String> comentarios;
    private State estado;
    LocalDateTime inicio;
    LocalDateTime fin;
    private String nombre;

    public ToDoItem(String nombre){
        this.nombre = nombre;
        this.estado = new Pending();
        this.comentarios = new ArrayList<>();
    }

    public void setEstado(State s){
        this.estado = s;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setInicio(LocalDateTime inicio){
        this.inicio = inicio;
    }

    public void setFin(LocalDateTime fin){
        this.fin = fin;
    }

    public String getEstado(){
        return this.estado.getEstado();
    }

    public LocalDateTime getInicio(){
        return this.inicio;
    }

    public LocalDateTime getFin(){
        return this.fin;
    }

    public void start(){
        estado.start(this);
    }

    public void togglePause(){
        estado.togglePause(this);
    }

    public void finish(){
        estado.finish(this);
    }

    public Duration workedTime(){
        return this.estado.workedTime(this);
    }

    public void addComment(String comment){
        if (!this.getEstado().equals("finished")){
            this.comentarios.add(comment);
        }
    }

}
