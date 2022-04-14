package ar.edu.unlp.info.oo2.practica_4.ejercicio_2;

public class DecoratorCreacion extends FileDecorator {

    public DecoratorCreacion(File component) {
        super(component);
    }

    public String prettyPrint(){
        return super.prettyPrint(this.component.getCreacion().toString());
    }
    
}
