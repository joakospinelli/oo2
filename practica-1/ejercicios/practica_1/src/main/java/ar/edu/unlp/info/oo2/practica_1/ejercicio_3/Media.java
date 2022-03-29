package ar.edu.unlp.info.oo2.practica_1.ejercicio_3;

/* 
 * Agregué algunos métodos para probar que funcionen las clases
 */
public abstract class Media {
	
	protected String name;
	
	public Media(String name) {
		this.name = name;
	}
	
	public abstract String play();
	
	public String getName() {
		return this.name;
	}
	
}
