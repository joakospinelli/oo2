package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_5;

// Bad smell: Clase de datos, envidia de atributos
// Refactoring usando: Move method
public class Cliente {
    
    private Direccion direccion;

    public String getDireccionFormateada(){
        return this.direccion.getDireccionFormateada();
    }
}
