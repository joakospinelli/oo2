package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_3;

// Bad smell: método largo
// Refactoring usando: Move method, Extract method, Decompose conditional
public class Usuario {

    private String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
