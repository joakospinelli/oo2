package ar.edu.unlp.info.oo2.practica_3;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending implements State {
    
    public void start(ToDoItem t) {
        t.setEstado(new InProgress());
        t.setInicio(LocalDateTime.now());
    }

    public void togglePause(ToDoItem t){
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    public void finish(ToDoItem t){
        throw new RuntimeException("El objeto ToDoItem no se inició");
    }

    public Duration workedTime(ToDoItem t){
        throw new RuntimeException("El objeto ToDoItem no se inició");
    }

    public String getEstado(){
        return "pending";
    }
}
