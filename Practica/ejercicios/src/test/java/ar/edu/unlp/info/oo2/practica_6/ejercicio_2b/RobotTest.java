package ar.edu.unlp.info.oo2.practica_6.ejercicio_2b;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RobotTest {
    GameBoard board;
    Robot robotLaserNuclear;
    Robot robotBombsSolar;


    void initialize(){
        robotLaserNuclear = new Robot(new Traction(),new LaserSystem(),new NuclearReactor());
        robotBombsSolar = new Robot(new Traction(),new BombsSystem(), new SolarWithBattery());
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testLaserNuclear(){
        assertEquals(robotLaserNuclear.getBattery(),100);
        robotLaserNuclear.step();
        assertEquals(robotLaserNuclear.getBattery(),90);
    }

    @Test
    void testBombsSolar(){
        assertEquals(robotBombsSolar.getBattery(),100);
        robotBombsSolar.step();
        assertEquals(robotBombsSolar.getBattery(),95);
    }
}
