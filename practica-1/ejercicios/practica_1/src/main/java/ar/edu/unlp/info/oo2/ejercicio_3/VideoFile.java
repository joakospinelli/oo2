package ar.edu.unlp.info.oo2.ejercicio_3;

/* 
 * Agregué algunos métodos para probar que funcionen las clases
 */
public class VideoFile extends Media {

	public VideoFile(String name) {
		super(name);
	}
	
	
	public String play() {
		return "Reproduciendo " + super.name;
	}
}
