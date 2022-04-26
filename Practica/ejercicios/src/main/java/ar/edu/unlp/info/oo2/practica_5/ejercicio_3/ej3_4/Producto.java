package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_4;

// Bad smell: Envidia de atributo
// Refactoring usando: Move method
public class Producto {
    
    private String nombre;
    private double precio;

    public double getPrecio(){
        return this.precio;
    }

    public String getNombre(){
        return this.nombre;
    }
}
