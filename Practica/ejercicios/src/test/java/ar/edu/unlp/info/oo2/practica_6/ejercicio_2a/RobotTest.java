package ar.edu.unlp.info.oo2.practica_6.ejercicio_2a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RobotTest {
    
    SolarEnergyCaterpillarRobotWithBombs caterpillarBombs;
    SolarEnergyCaterpillarRobotWithLasers caterpillarLasers;

    SolarEnergyOvercraftRobotWithBombs overcraftBombs;
    SolarEnergyOvercraftRobotWithLasers overcraftLasers;

    GameBoard board;

    void initialize(){
        board = new GameBoard();
        caterpillarBombs = new SolarEnergyCaterpillarRobotWithBombs();
        caterpillarLasers = new SolarEnergyCaterpillarRobotWithLasers();

        overcraftBombs = new SolarEnergyOvercraftRobotWithBombs();
        overcraftLasers = new SolarEnergyOvercraftRobotWithLasers();
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testBoard(){
        assertEquals(caterpillarBombs.energy,100);
        assertEquals(caterpillarLasers.energy,100);
        assertEquals(overcraftBombs.energy,100);
        assertEquals(overcraftLasers.energy,100);


        caterpillarBombs.step();
        caterpillarLasers.step();
        overcraftBombs.step();
        overcraftLasers.step();
    }

}
