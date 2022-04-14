package ar.edu.unlp.info.oo2.practica_4.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
    
    FileOO2 archivo;

    @BeforeEach
    void setUp(){
        this.archivo = new FileOO2("oo2", ".txt", 32, "administrador");
    }

    @Test
    void testPrimerOrden(){
        // nombre - extensión
        DecoratorExtension e = new DecoratorExtension(archivo);
        DecoratorNombre n = new DecoratorNombre(e);

        assertEquals("oo2 - .txt - ",n.prettyPrint());
    }

    @Test
    void testSegundoOrden(){
        // nombre - extensión - fecha de creación
        DecoratorCreacion c = new DecoratorCreacion(archivo);
        DecoratorExtension e = new DecoratorExtension(c);
        DecoratorNombre n = new DecoratorNombre(e);

        assertEquals("oo2 - .txt - 2022-04-14 - ",n.prettyPrint());
    }

    @Test
    void testTercerOrden(){
        // permisos - nombre - extensión - tamaño
        DecoratorTamaño t = new DecoratorTamaño(archivo);
        DecoratorExtension e = new DecoratorExtension(t);
        DecoratorNombre n = new DecoratorNombre(e);
        DecoratorPermisos p = new DecoratorPermisos(n);

        assertEquals("administrador - oo2 - .txt - 32.0 - ",p.prettyPrint());
    }

}
