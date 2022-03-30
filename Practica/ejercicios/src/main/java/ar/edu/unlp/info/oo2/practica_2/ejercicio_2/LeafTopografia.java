package ar.edu.unlp.info.oo2.practica_2.ejercicio_2;

public abstract class LeafTopografia implements Topografia {

    public boolean esIgual(Topografia t){
		return this.getProporcion() == t.getProporcion();
	}
}
