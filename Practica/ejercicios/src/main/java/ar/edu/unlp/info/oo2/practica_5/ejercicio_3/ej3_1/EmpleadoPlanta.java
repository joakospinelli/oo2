package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_1;

// Bad smell: Código duplicado
// Refactoring usado: Pull up Method
public class EmpleadoPlanta extends Empleado {
    
    private int cantidadHijos;

    public EmpleadoPlanta(String nombre,String apellido){
        super(nombre,apellido);
        this.cantidadHijos = 0;
    }

    public double adicional(){
        return (this.cantidadHijos * 2000);
    }
}
