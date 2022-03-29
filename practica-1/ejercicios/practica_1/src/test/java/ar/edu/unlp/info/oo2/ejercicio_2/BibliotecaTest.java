package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	Biblioteca biblioteca;
	
	void initialize() {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	@BeforeEach
	void setUp() {
		this.initialize();
	}
	
	@Test
	void testSocios() {
	}

}
