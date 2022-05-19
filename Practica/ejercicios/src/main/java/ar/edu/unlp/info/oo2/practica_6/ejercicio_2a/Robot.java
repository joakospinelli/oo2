package ar.edu.unlp.info.oo2.practica_6.ejercicio_2a;

public abstract class Robot {

    protected double energy = 100;

    public void step(){
        this.move();
        this.consumeBattery();
        this.fireArms();
        this.collectArtifacts();
    }

    public abstract void move();

    public abstract void consumeBattery();
    
    public abstract void fireArms();

    public void collectArtifacts(){
        System.out.println("Collecting artifacts");
    };
}
