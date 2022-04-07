package ar.edu.unlp.info.oo2.practica_3.ejercicio_1;
import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<ToDoItem> items;

    public Sistema(){
        this.items = new ArrayList<>();
    }

    public ToDoItem agregarItem(String nombre){
        ToDoItem t = new ToDoItem(nombre);
        this.items.add(t);
        return t;
    }

}
