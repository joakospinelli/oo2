package ar.edu.unlp.info.oo2.practica_4.ejercicio_2;

public class DecoratorNombre extends FileDecorator {

    public DecoratorNombre(File component) {
        super(component);
    }

    public String prettyPrint(){
        return super.prettyPrint(this.component.getNombre());
    }
    
}
