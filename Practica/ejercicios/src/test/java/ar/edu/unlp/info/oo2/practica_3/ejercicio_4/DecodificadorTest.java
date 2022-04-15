package ar.edu.unlp.info.oo2.practica_3.ejercicio_4;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
    
    ArrayList<Pelicula> grillaInicial;
    Decodificador d;
    Pelicula p1;
    Pelicula p2;
    Pelicula p3;
    Pelicula p4;
    Pelicula p5;

    void initialize(){
        grillaInicial = new ArrayList<>();
        p1 = new Pelicula("Jujutsu Kaisen 0",2021,10);
        p2 = new Pelicula("The Batman",2022,8);
        p3 = new Pelicula("Spider-man: No way home",2021,6);
        p4 = new Pelicula("Your Name.",2015,10);
        p5 = new Pelicula("Tenki no Ko",2019,9);
        grillaInicial.add(p1); grillaInicial.add(p2); grillaInicial.add(p3); grillaInicial.add(p4); grillaInicial.add(p5);
        d = new Decodificador(grillaInicial);
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testPuntaje(){
        d.setSugerencia(new Puntaje());
        assertTrue(d.sugerirPeliculas().contains(p4));
        assertFalse(d.sugerirPeliculas().contains(p3));
    }

    @Test
    void testNovedad(){
        d.setSugerencia(new Novedad());
        assertTrue(d.sugerirPeliculas().contains(p1));
        assertFalse(d.sugerirPeliculas().contains(p4));
    }

    @Test
    void testSimilaridad(){
        p4.agregarSimilar(p5);
        d.comprarPelicula(p4);
        d.setSugerencia(new Similaridad());
        assertTrue(d.sugerirPeliculas().contains(p5));
    }
}
