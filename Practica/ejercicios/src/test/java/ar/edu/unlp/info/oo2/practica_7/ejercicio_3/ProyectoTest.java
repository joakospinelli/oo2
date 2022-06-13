package ar.edu.unlp.info.oo2.practica_7.ejercicio_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
    
    Persona emprendedor;
    Persona inversor;
    Proyecto proyecto;

    void initialize(){
        this.emprendedor = new Persona("Emprendedor");
        this.inversor = new Persona("Inversor");
        proyecto = this.emprendedor.crearProyecto("Vacaciones Kathmandu 2023",5000);
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testInversion(){
        inversor.invertir(proyecto,500);
        assertEquals(500,proyecto.getMontoActual());
    }

}
