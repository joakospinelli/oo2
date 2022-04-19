package ar.edu.unlp.info.oo2.practica_5.ejercicio_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpootifyTest {
    
    Spootify spootify;
    Usuario u1;
    Autor a1; Autor a2;
    Album al1; Album al2; Album al3;
    Cancion c1; Cancion c2; Cancion c3; Cancion c4; Cancion c5;

    void initialize(){
        spootify = new Spootify();
        u1 = new Usuario("Joaquín");

        a1 = new Autor("ZUTOMAYO");
        a2 = new  Autor("Yorushika");

        al1 = new Album("GUSARE");
        al2 = new Album("Plagiarism");
        al3 = new Album("elma");

        c1 = new Cancion("Study me");
        c2 = new Cancion("MILABO");
        c3 = new Cancion("Human and Badger game");
        c4 = new Cancion("Ghost in a flower");
        c5 = new Cancion("rain with cappuccino");
    }

    @BeforeEach
    void setUp(){
        this.initialize();

        u1.agregarCancion(c1);

        al1.agregarCancion(c1); al1.agregarCancion(c2);
        al2.agregarCancion(c3); al2.agregarCancion(c4);
        al3.agregarCancion(c5);

        a1.agregarAlbum(al1);
        a2.agregarAlbum(al2); a2.agregarAlbum(al3);

        spootify.agregarAutor(a1); spootify.agregarAutor(a2);
        spootify.agregarUsuario(u1);
    }

    @Test
    void testCaseInsensitive(){
        assertEquals(spootify.buscarPorTitulo("Study me"),spootify.buscarPorTitulo("StUDy mE"));
        assertEquals(spootify.buscarPorAutor("ZUTOMAYO"),spootify.buscarPorAutor("zuToMAYO"));
        assertEquals(spootify.buscarPorAlbum("GUSARE"),spootify.buscarPorAlbum("gusARe"));
    }

    @Test
    void testBuscarPorTitulo(){
        assertTrue(spootify.buscarPorTitulo("LABO").contains(c2));
        assertTrue(spootify.buscarPorTitulo("Human").contains(c3));
        assertTrue(spootify.buscarPorTitulo("rain").contains(c5));

        assertFalse(spootify.buscarPorTitulo("Study me").contains(c2));
    }

    @Test
    void testBuscarPorAutor(){
        assertTrue(spootify.buscarPorAutor("ZUTO").contains(c1));
        assertTrue(spootify.buscarPorAutor("Yor").contains(c4));

        assertFalse(spootify.buscarPorAutor("ZUTOMAYO").contains(c5));
    }

    @Test
    void testBuscarPorAlbum(){
        assertTrue(spootify.buscarPorAlbum("GU").contains(c1));
        assertTrue(spootify.buscarPorAlbum("Plagiarism").contains(c4));
        assertTrue(spootify.buscarPorAlbum("elm").contains(c5));

        assertFalse(spootify.buscarPorAlbum("Plagiarism").contains(c5));
    }

    @Test
    void testMyMusic(){
        assertTrue(u1.getMyMusic().contains(c1));
        assertFalse(u1.getMyMusic().contains(c4));
    }

}
