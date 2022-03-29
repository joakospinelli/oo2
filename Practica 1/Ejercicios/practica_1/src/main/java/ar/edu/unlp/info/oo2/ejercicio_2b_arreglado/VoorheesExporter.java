package ar.edu.unlp.info.oo2.ejercicio_2b_arreglado;

import java.util.List;

/*
 * En vez de trabajar con objetos tipo JSON, crea Strings que siguen el formato
 */
public class VoorheesExporter {

	private String exportar(Socio socio) {
		String separator = System.lineSeparator();
		return "\t{" + separator
			+ "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator
			+ "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator
			+ "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator
			+ "\t}";
	}
	
	

	public String exportar(List<Socio> socios) {
		
		if (socios.isEmpty()) {
			return "[]";
		}
		
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
				.append(",")
				.append(separator);
		});

		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}
}
