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

	public ArrayList<Topografia> getComponents(){
		return this.components;
	}
	
	public void addComponent(Topografia t) {
		if (components.size() < 4) this.components.add(t);
	}

	public boolean esIgual(Topografia t){
		return false;
	}
	
}
