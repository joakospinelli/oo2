package ar.edu.unlp.info.oo2.practica_6.ejercicio_2a;

public abstract class SolarEnergyRobot extends Robot {
    
    public void consumeBattery(){
        energy -= 1;
        System.out.println("Energy: " + energy);
    }
}
