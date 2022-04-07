package ar.edu.unlp.info.oo2.practica_3.ejercicio_1;

import java.time.Duration;

public class Finished implements State {

    public void start(ToDoItem t){

    }

    public void togglePause(ToDoItem t){
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    public void finish(ToDoItem t){

    }

    public Duration workedTime(ToDoItem t){
        return Duration.between(t.getInicio(), t.getFin());
    }

    public String getEstado(){
        return "finished";
    }
    
}
