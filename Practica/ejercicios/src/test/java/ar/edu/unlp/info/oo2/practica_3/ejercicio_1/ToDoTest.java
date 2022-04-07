package ar.edu.unlp.info.oo2.practica_3.ejercicio_1;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoTest {
    
    Sistema sistema;
    ToDoItem t;

    void initialize(){
        sistema = new Sistema();
        t = sistema.agregarItem("item");
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testInicial(){
        assertEquals(t.getEstado(),"pending");
        t.start();
        assertEquals(t.getEstado(),"in progress");
    }

    @Test
    void testPausa(){
        t.start();
        t.togglePause();
        assertEquals(t.getEstado(),"paused");
        t.togglePause();
        assertEquals(t.getEstado(),"in progress");
    }

    @Test
    void testFin(){
        t.start();
        t.finish();
        assertEquals(t.getEstado(),"finished");
    }

    @Test
    void testWorkedTime() throws InterruptedException{
        t.start();
        TimeUnit.SECONDS.sleep(2);
        t.togglePause();
        assertEquals(2,t.workedTime().get(ChronoUnit.SECONDS));
        t.togglePause();
        TimeUnit.SECONDS.sleep(3);
        t.finish();
        assertEquals(5,t.workedTime().get(ChronoUnit.SECONDS));
    }
    
}
