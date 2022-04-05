package ar.edu.unlp.info.oo2.practica_3;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress implements State {

    public void start(ToDoItem t){

    }

    public void togglePause(ToDoItem t){
        t.setEstado(new Paused());
    }

    public void finish(ToDoItem t){
        t.setEstado(new Finished());
        t.setFin(LocalDateTime.now());
    }

    public Duration workedTime(ToDoItem t){
        return Duration.between(t.getInicio(), LocalDateTime.now());
    }
    
    public String getEstado(){
        return "in progress";
    }
}
