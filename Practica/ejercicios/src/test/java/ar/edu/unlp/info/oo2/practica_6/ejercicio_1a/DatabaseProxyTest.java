package ar.edu.unlp.info.oo2.practica_6.ejercicio_1a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class DatabaseProxyTest {
    
    public DatabaseAccessProxy database;

    void initialize(){
        database = new DatabaseAccessProxy(new DatabaseRealAccess());
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testException(){
        assertThrows(RuntimeException.class, () -> {
            database.getSearchResults("select * from comics where id=1");
        });
    }

    @Test
    void testSearchResults(){
        database.authenticate();
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), database.getSearchResults("select * from comics where id=4"));
    }

    @Test
    void testNewRow(){
        database.authenticate();
        assertEquals(3, database.insertNewRow(Arrays.asList("Flash","DC Comics")));
        assertEquals(Arrays.asList("Flash","DC Comics"),database.getSearchResults("select * from comics where id=3"));
    }

}
