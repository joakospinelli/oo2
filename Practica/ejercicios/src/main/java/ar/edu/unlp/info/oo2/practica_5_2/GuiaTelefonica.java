package ar.edu.unlp.info.oo2.practica_5_2;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	public SortedSet<String> guia = new TreeSet<String>();

	public String getUltimoNumero(){
		return this.guia.last();
	}

	public void agregarNumero(String telefono){
		this.guia.add(telefono);
	}
}
