package ar.edu.unlp.info.oo2.ejercicio_3;

/* 
 * Agregué algunos métodos para probar que funcionen las clases
 */
public class VideoStreamAdapter extends Media {

	private VideoStream adaptee;
	
	public VideoStreamAdapter(String name) {
		super(name);
		this.adaptee = new VideoStream();
	}
	
	public String play() {
		return "Reproduciendo " + super.name + " via " + (adaptee.reproduce());
	}
	
}
