package ar.edu.unlp.info.oo2.ejercicio_2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


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
	void testSocios() throws ParseException {
		JSONArray array = (JSONArray) new JSONParser().parse(biblioteca.exportarSocios());
		
		JSONObject socio1 = (JSONObject) array.get(0);
		JSONObject socio2 = (JSONObject) array.get(1);
		assertEquals(socio1.get("name"),"Arya Stark");
		assertEquals(socio2.get("legajo"),"2345-2");
	}

}
