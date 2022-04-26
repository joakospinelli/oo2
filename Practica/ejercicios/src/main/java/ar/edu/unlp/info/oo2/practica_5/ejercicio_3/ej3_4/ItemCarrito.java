package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_4;

// Bad smell: Envidia de atributo
// Refactoring usando: Move method
public class ItemCarrito {
    
    private Producto producto;
    private int cantidad;

    public double getPrecioTotal(){
        return this.producto.getPrecio() * this.cantidad;
    }
}
