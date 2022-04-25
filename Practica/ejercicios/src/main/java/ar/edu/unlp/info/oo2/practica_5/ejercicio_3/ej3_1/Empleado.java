package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_1;

// Bad smell: Código duplicado
// Refactoring usado: Pull up Method
public abstract class Empleado {
    
    protected String nombre;
    protected String apellido;
    protected double sueldoBasico;

    public Empleado(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = 0;
    }

    public double sueldo(){
        return this.sueldoBasico + this.adicional() - (this.sueldoBasico * 0.13);
    }

    public abstract double adicional();

}
