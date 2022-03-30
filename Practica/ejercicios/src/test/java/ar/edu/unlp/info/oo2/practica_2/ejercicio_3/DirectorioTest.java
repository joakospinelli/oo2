package ar.edu.unlp.info.oo2.practica_2.ejercicio_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DirectorioTest {

    private Directorio vacio;
    private Directorio conUnArchivo;
    private Directorio conVariosArchivos;
    private Directorio conSubdirectorios;
    private Archivo grande;
    private Archivo backup2015;

    @BeforeEach
    void setUp() throws Exception {

        LocalDate date = LocalDate.of(2015, 1, 1);
        grande = new Archivo("grande.tmp", LocalDate.of(2016, 4, 2), 2000000);
        backup2015 = new Archivo("2015.zip", LocalDate.of(2016, 4, 6), 240000000);
        Directorio mysql = new Directorio("mysql", date);
        mysql.agregarArchivo(new Archivo("mysql01.log", LocalDate.of(2015, 12, 3), 1200000));
        mysql.agregarArchivo(new Archivo("mysql02.log", LocalDate.of(2014, 3, 3), 2000000));
        mysql.agregarArchivo(new Archivo("mysql03.log", LocalDate.of(2013, 3, 21), 2000000));
        mysql.agregarArchivo(new Archivo("mysql04.log", LocalDate.of(2014, 7, 15), 2000000));
        Directorio older = new Directorio("older", date);
        older.agregarArchivo(backup2015);
        mysql.agregarArchivo(older);
        Directorio postgres = new Directorio("postgres", date);
        postgres.agregarArchivo(new Archivo("pg01.log", LocalDate.of(2015, 4, 12), 1400000));
        postgres.agregarArchivo(new Archivo("pg02.log", LocalDate.of(2016, 3, 8), 4000000));
        postgres.agregarArchivo(new Archivo("pg03.log", LocalDate.of(2016, 2, 13), 4000000));
        // Directorio vacío
        vacio = new Directorio("home", date);
        //"Directorio con un solo archivo"
        conUnArchivo = new Directorio("var", date);
        Archivo config = new Archivo("config.bak", LocalDate.of(2016, 4, 2), 128);
        conUnArchivo.agregarArchivo(config);
        // Directorio con varios archivos, pero sin subdirectorios"
        conVariosArchivos = new Directorio("tmp", date);
        conVariosArchivos.agregarArchivo(new Archivo("nada.tmp", LocalDate.of(2015, 5, 1), 0));
        conVariosArchivos.agregarArchivo(new Archivo("chico.tmp", LocalDate.of(2013, 6, 3), 10));
        conVariosArchivos.agregarArchivo(grande);
        conVariosArchivos.agregarArchivo(new Archivo("mediano.tmp", LocalDate.of(1995, 11, 23), 10000));
        //Directorio con subdirectorios, archivos, y archivos dentro de los subdirectorios"
        conSubdirectorios = new Directorio("log", date);
        conSubdirectorios.agregarArchivo(new Archivo("sys.log", LocalDate.of(2016, 3, 3), 90000));
        conSubdirectorios.agregarArchivo(mysql);
        conSubdirectorios.agregarArchivo(postgres);
    }

    @Test
    void testArchivoMasGrande() {
        assertEquals(null, vacio.archivoMasGrande());
        assertEquals("config.bak", conUnArchivo.archivoMasGrande().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasGrande());
        assertEquals(backup2015, conSubdirectorios.archivoMasGrande());
    }

    @Test
    void testArchivoMasNuevo() {
        assertEquals(null, vacio.archivoMasNuevo());
        assertEquals("config.bak", conUnArchivo.archivoMasNuevo().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasNuevo());
        assertEquals(backup2015, conSubdirectorios.archivoMasNuevo());
    }

    @Test
    void testtamañoTotalOcupado() {
        assertEquals(32, vacio.tamañoTotalOcupado());
        assertEquals(160, conUnArchivo.tamañoTotalOcupado()); //32 del directorio + 128 del archivo
        assertEquals(2010042, conVariosArchivos.tamañoTotalOcupado()); //  2M de grande + 10K + 0 + 10 + 32 directorio
        assertEquals(256690128, conSubdirectorios.tamañoTotalOcupado());
    }


}
