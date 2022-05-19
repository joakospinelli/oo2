package ar.edu.unlp.info.oo2.practica_6.ejercicio_2b;

public class NuclearReactor extends EnergySource{

    public void consume(Robot robot) {
        System.out.println("Consuming nuclear energy");
        robot.setBattery(robot.getBattery() - 10);
    }
    
}
