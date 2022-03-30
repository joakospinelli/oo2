package ar.edu.unlp.info.oo2.practica_2.ejercicio_2;

import java.util.ArrayList;

public class Editor {

	private ArrayList<Topografia> topografias;
	
	public Editor() {
		this.topografias = new ArrayList<>();
	}
	
	public void agregarTopografia(Topografia t){
		this.topografias.add(t);
	}

	public double sumarProporciones() {
		return this.topografias.stream().mapToDouble(i -> i.getProporcion()).sum();
	}
	
}
