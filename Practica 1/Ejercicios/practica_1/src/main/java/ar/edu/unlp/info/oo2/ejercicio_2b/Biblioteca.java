package ar.edu.unlp.info.oo2.ejercicio_2b;

import java.util.ArrayList;
import java.util.List;

/* El enunciado dice que esta clase no debe modificarse, así que
 * hice que siga trabajando con VorheesExporter y reciba Strings (aunque
 * en el Test se hace el JSON.Parser)
 */
public 
public class Biblioteca {
	private List<Socio> socios;
	private VoorheesExporter exporter;

	public Biblioteca() {
		socios = new ArrayList<>();
		exporter= new VoorheesExporter(); 
	}

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

	public VoorheesExporter getExporter() {
		return exporter;
	}

	public void setExporter(VoorheesExporter exporter) {
		this.exporter = exporter;
	}
}
