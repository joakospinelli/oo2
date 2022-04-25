package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_1;

// Bad smell: Código duplicado
// Refactoring usado: Pull up Method
public class EmpleadoPasante extends Empleado {

    public EmpleadoPasante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public double adicional() {
        return 0d;
    }

}
