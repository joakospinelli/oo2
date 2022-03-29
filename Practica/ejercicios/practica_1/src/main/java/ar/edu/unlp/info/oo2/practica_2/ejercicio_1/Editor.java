package ar.edu.unlp.info.oo2.practica_2.ejercicio_1;

import java.util.ArrayList;

public class Editor {

	private ArrayList<Topografia> topografias;
	
	public Editor() {
		this.topografias = new ArrayList<>();
	}
	
	public void agregarTierra(Tierra t) {
		this.topografias.add(t);
	}
	
	public void agregarAgua(Agua a) {
		this.topografias.add(a);
	}
	
	public void agregarComposite(CompositeTopografia c) {
		this.topografias.add(c);
	}
	
	public double sumarProporciones() {
		return this.topografias.stream().mapToDouble(i -> i.getProporcion()).sum();
	}
	
}
