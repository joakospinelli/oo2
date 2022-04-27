package ar.edu.unlp.info.oo2.practica_5_2;

import java.util.ArrayList;
import java.util.List;

public class Persoonal {
	List<Persoona> listaPersonas = new ArrayList<Persoona>();
	List<Llamada> listaLlamadas = new ArrayList<Llamada>();
	GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	static double descuentoFis = 0;
	static double descuentoJur = 0.15;
	
	public boolean agregarTelefono(String str) {
		boolean encontre = guiaTelefonica.guia.contains(str);
		if (!encontre) {
			guiaTelefonica.guia.add(str);
			return true;
		}
		return false;
	}
	
	public Persoona registrarUsuario(String documento, String nombreCompleto, String tipo) {
		Persoona persona = crearPersonaSegunTipo(documento,nombreCompleto,tipo);
		persona.setSistema(this);
		listaPersonas.add(persona);
		return persona;
	}

	private Persoona crearPersonaSegunTipo(String documento,String nombreCompleto,String tipo){
		if (tipo.equals("fisica")){
			return new PersoonaFisica(documento,nombreCompleto,guiaTelefonica.getUltimoNumero());
		}
		if (tipo.equals("juridica")){
			return new PersoonaJuridica(documento,nombreCompleto,guiaTelefonica.getUltimoNumero());
		}
		return null;
	}
	
	public boolean eliminarUsuario(Persoona p) {
		
		/* List<Persoona> l = p.getSistema().listaPersonas.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < listaPersonas.size()) {
			this.listaPersonas = l;
			this.guiaTelefonica.guia.add(p.getTelefono());
			borre = true;
		}
		return borre; */
		if (listaPersonas.contains(p)){
			listaPersonas.remove(p);
			guiaTelefonica.agregarNumero(p.getTelefono());
			return true;
		}
		return false;
	}
	
	public Llamada registrarLlamada(Persoona emisor, Persoona remitente, String tipoLlamada, int duracion) {
		Llamada llamada = crearLlamadaSegunTipo(tipoLlamada, emisor, remitente, duracion);
		emisor.registrarLlamada(llamada);
		return llamada;
	}

	private Llamada crearLlamadaSegunTipo(String tipo,Persoona emisor,Persoona remitente,int duracion){
		if (tipo.equals("nacional")){
			return new LlamadaNacional(emisor.getTelefono(),remitente.getTelefono(),duracion);
		}
		if (tipo.equals("internacional")){
			return new LlamadaInternacional(emisor.getTelefono(),remitente.getTelefono(),duracion);
		}
		return null;
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		return p.calcularMontoLlamadas();
	}

	public int cantidadDeUsuarios() {
		return listaPersonas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return listaPersonas.contains(persona);
	}
	
}
