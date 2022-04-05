package ar.edu.unlp.info.oo2.practica_3;

import java.time.Duration;

public interface State {
    
    public void start(ToDoItem t);
    public void togglePause(ToDoItem t);
    public void finish(ToDoItem t);
    public Duration workedTime(ToDoItem t);
    public String getEstado();

}
