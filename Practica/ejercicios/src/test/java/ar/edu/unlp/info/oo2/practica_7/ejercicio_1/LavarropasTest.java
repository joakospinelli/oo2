package ar.edu.unlp.info.oo2.practica_7.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LavarropasTest {
    
    Lavarropas lavarropas;

    void initialize(){
        lavarropas = new Lavarropas();
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testLavadoDiario(){
        lavarropas.cambiarLavado(new LavadoDiario());
        assertEquals(20 + 7 + 3,lavarropas.iniciarLavado()); // Tiempo de lavado + tiempo de enjuague + tiempo de centrifugado
    }

    // ----- el enunciado decía sólo hacer el test de lavado diario pero x las dudas

    @Test
    void testRopaDelicada(){
        lavarropas.cambiarLavado(new RopaDelicada());
        assertEquals(40 + 15 + 0,lavarropas.iniciarLavado());
    }

    @Test
    void testRopaMuySucia(){
        lavarropas.cambiarLavado(new RopaMuySucia());
        assertEquals(130 + 15 + 10,lavarropas.iniciarLavado());
    }
}
