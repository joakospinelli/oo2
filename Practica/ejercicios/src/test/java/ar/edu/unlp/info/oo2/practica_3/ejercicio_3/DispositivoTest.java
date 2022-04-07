package ar.edu.unlp.info.oo2.practica_3.ejercicio_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
    
    Dispositivo d;

    void initialize(){
        this.d = new Dispositivo();
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testConectarCon(){
        assertEquals("conectado por 4g",d.conectarCon(new Connection4GAdapter()));
        assertEquals("conectado por wifi",d.conectarCon(new WifiConn()));
    }

    @Test
    void testSend(){
        assertEquals("test 8134",d.send("test"));
    }

    @Test
    void testConfigurarCRC(){
        assertEquals("test 8134",d.send("test")); // Mensaje usando CRC16
        d.configurarCRC(new CRC32_Calculator());
        assertEquals("test -662733300",d.send("test")); // Mensaje usando CRC32
    }

}
