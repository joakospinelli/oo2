package ar.edu.unlp.info.oo2.practica_6.ejercicio_2b;

public class Robot {
    
    private LocomotionSystem locomotion;
    private ArmsSystem arms;
    private EnergySource energy;
    private int battery = 100;

    public void step(){
        locomotion.move(this);
        energy.consume(this);
        arms.fire(this);
        this.collectArtifacts();
    }

    public int getBattery(){
        return this.battery;
    }

    public void setBattery(int b){
        this.battery = b;
    }

    private void collectArtifacts() {
        System.out.println("Collecting artifacts");
    }

    public Robot(LocomotionSystem loc,ArmsSystem arms,EnergySource ener){
        this.locomotion = loc;
        this.arms = arms;
        this.energy = ener;
    }
}
