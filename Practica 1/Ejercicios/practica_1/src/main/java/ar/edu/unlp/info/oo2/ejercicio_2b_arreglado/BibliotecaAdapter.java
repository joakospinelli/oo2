package ar.edu.unlp.info.oo2.ejercicio_2b_arreglado;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BibliotecaAdapter {
	
	private Biblioteca adaptee;
	
	public BibliotecaAdapter() {
		this.adaptee = new Biblioteca();
	}
	
	public void agregarSocio(Socio socio) {
		this.adaptee.agregarSocio(socio);
	}
	
	public JSONArray exportarSocios() throws ParseException {
		
		return (JSONArray) new JSONParser().parse(this.adaptee.exportarSocios());
	}
	
	public VoorheesExporter getExporter() {
		return this.adaptee.getExporter();
	}
	
	public void setExporter(VoorheesExporter exporter) {
		this.adaptee.setExporter(exporter);
	}
	
}
