package ar.edu.unlp.info.oo2.practica_5_2;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {

	protected List<Llamada> listaLlamadas = new ArrayList<Llamada>();
	private String tipo;
	private String nombreApellido;
	private String telefono;
	private String cuit;
	private String documento;
	private Persoonal sistema;
	
	public Persoona(String documento,String nombreApellido,String telefono){
		this.documento = documento;
		this.nombreApellido = nombreApellido;
		this.telefono = telefono;
	}

	public abstract double calcularMontoLlamadas();

	public void registrarLlamada(Llamada llamada){
		listaLlamadas.add(llamada);
	}

	public List<Llamada> getListaLlamadas() {
		return listaLlamadas;
	}
	public void setListaLlamadas(List<Llamada> lista) {
		this.listaLlamadas = lista;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombreApellido() {
		return this.nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCuit() {
		return this.cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDocumento() {
		return this.documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public void setSistema(Persoonal sistema){
		this.sistema = sistema;
	}

	public Persoonal getSistema(){
		return this.sistema;
	}
	
}
