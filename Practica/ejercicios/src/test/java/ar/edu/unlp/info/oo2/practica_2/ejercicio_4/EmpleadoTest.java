package ar.edu.unlp.info.oo2.practica_2.ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    Temporario temporario;    
    Pasante pasante;
    Planta planta;

    void initialize(){
        temporario = new Temporario(8, 1, false);
        pasante = new Pasante(3);
        planta = new Planta(2,0,true);
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testEmpleados(){
        assertEquals(21388,temporario.sueldo());
        assertEquals(23100,pasante.sueldo());
        assertEquals(52050,planta.sueldo());
    }

}
