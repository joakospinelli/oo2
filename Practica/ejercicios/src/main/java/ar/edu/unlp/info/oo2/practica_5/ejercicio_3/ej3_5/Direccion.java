package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_5;

// Bad smell: Clase de datos, envidia de atributos
// Refactoring usando: Move method
public class Direccion {
    
    private String localidad;
    private String calle;
    private int numero;
    private String departamento;

    public String getDireccionFormateada(){
        return 
            this.localidad + ", " +
            this.calle + ", " +
            this.numero + ", " +
            this.departamento;
    }

}
