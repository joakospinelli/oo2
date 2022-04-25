package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_1;

// Bad smell: Código duplicado
// Refactoring usado: Pull up Method
public class EmpleadoTemporario extends Empleado {
    
    private double horasTrabajadas;
    private int cantidadHijos;

    public EmpleadoTemporario(String nombre,String apellido){
        super(nombre,apellido);
        this.horasTrabajadas = 0;
        this.cantidadHijos = 0;
    }

    public double adicional(){
        return (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000);
    }

}
