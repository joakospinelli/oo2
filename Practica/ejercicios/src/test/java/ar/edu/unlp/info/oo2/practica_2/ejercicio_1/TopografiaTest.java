package ar.edu.unlp.info.oo2.practica_2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
    
    Editor editor;

    void initialize(){
        this.editor = new Editor();
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testLeaf() throws Exception{
        editor.agregarTopografia(new Agua());
        editor.agregarTopografia(new Tierra());

        assertEquals(0+1,editor.sumarProporciones());
    }

    @Test
    void testComponent() throws Exception {
        CompositeTopografia composite1 = new CompositeTopografia();
        composite1.addComponent(new Agua());
        composite1.addComponent(new Tierra());

        CompositeTopografia composite2 = new CompositeTopografia();
        composite2.addComponent(composite1);
        editor.agregarTopografia(composite2);

        assertEquals((0d+1d/2)/1,editor.sumarProporciones());
    }

    @Test
    void testEqualsLeaf() throws Exception {
        Tierra t1 = new Tierra();
        Tierra t2 = new Tierra();
        Agua agua = new Agua();

        assertFalse(t1.esIgual(agua));
        assertTrue(t1.esIgual(t2));
    }

}
