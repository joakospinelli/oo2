package ar.edu.unlp.info.oo2.practica_6.ejercicio_2b;

public class SolarWithBattery extends EnergySource{

    public void consume(Robot robot) {
        System.out.println("Consuming solar energy");
        robot.setBattery(robot.getBattery() - 5);
    }
    
}