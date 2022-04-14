package ar.edu.unlp.info.oo2.practica_4.ejercicio_2;

public class DecoratorTamaño extends FileDecorator {

    public DecoratorTamaño(File component) {
        super(component);
    }

    public String prettyPrint(){
        return super.prettyPrint(Double.toString(this.component.getTamaño()));
    }
    
}
