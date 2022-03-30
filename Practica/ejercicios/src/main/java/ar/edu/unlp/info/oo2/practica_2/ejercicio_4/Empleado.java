package ar.edu.unlp.info.oo2.practica_2.ejercicio_4;

public abstract class Empleado {
    
    public abstract int getAdicional();
    public abstract int getBasico();

    public double sueldo(){
        return (this.getBasico() + this.getAdicional()) - (this.getBasico() * 0.13 + this.getAdicional() * 0.05);
    }

}
