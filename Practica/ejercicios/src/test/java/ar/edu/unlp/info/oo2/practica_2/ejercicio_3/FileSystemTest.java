package ar.edu.unlp.info.oo2.practica_2.ejercicio_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class FileSystemTest {
    
    public FileSystem fs;
    public Archivo a1;
    public Archivo a2;

    void initialize(){
        fs = new FileSystem();
        a1 = new Archivo("hola.txt",LocalDate.now(),100);
        a2 = new Archivo("mundo.txt",LocalDate.of(2000,1,1),200);
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    public void testTamaño() {
        Directorio d = fs.agregarArchivo("carpeta", LocalDate.now());
        d.agregarArchivo(a1);
        d.agregarArchivo(a2);
        assertEquals(a1,d.archivoMasNuevo());
        assertEquals(a2,d.archivoMasGrande());
    }

}
