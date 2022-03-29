package ar.edu.unlp.info.oo2.practica_2.ejercicio_1;

import java.util.ArrayList;

public class CompositeTopografia implements Topografia {
	
	private ArrayList<Topografia> components;
	
	public CompositeTopografia() {
		this.components = new ArrayList<>();
	}
	
	public double getProporcion() {
		return components.stream().mapToDouble(i -> i.getProporcion()).sum() / this.components.size();
	}
	
	public void addComponent(CompositeTopografia t) {
		if (components.size() < 4) this.components.add(t);
	}
	
	public void addTierra(Tierra t) {
		this.components.add(t);
	}
	
	public void addAgua(Agua t) {
		this.components.add(t);
	}
}
