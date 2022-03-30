package ar.edu.unlp.info.oo2.practica_1.ejercicio_3;

/* 
 * Agregué algunos métodos para probar que funcionen las clases
 */
public class Audio extends Media {
	
	public Audio(String name) {
		super(name);
	}
	
	public String play() {
		return "Reproduciendo " + super.name;
	}
	
}
