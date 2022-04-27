package ar.edu.unlp.info.oo2.practica_5_2;

public abstract class Llamada {

	protected String emisor;
	protected String remitente;
	protected int duracion;
	
	public Llamada() {
		
	}
	public Llamada(String emisor, String remitente, int duracion) {
		this.emisor = emisor;
		this.remitente = remitente;
		this.duracion = duracion;
	}

	public void setEmisor(String q) {
		emisor = q;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
    
	public abstract double getCosto();
	
}
