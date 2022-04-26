package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_4;

import java.util.List;

// Bad smell: Envidia de atributo
// Refactoring usando: Move method
public class Carrito {
    
    private List<ItemCarrito> items;

    public double getPrecioTotal(){
        return this.items.stream()
                     .mapToDouble(i -> i.getPrecioTotal())
                     .sum();
    }

}
