package ar.edu.unlp.info.oo2.practica_5_2;

public class PersoonaJuridica extends Persoona {

    public PersoonaJuridica(String documento, String nombreApellido, String telefono) {
        super(documento, nombreApellido, telefono);
    }

    public double calcularMontoLlamadas() {
		double c = this.listaLlamadas.stream()
				.mapToDouble(l -> l.getCosto())
				.sum();
		return c - (c * 0.15);
	}
    
}
