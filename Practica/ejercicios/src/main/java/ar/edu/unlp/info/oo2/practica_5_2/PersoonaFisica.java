package ar.edu.unlp.info.oo2.practica_5_2;

public class PersoonaFisica extends Persoona {

    public PersoonaFisica(String documento, String nombreApellido, String telefono) {
        super(documento, nombreApellido, telefono);
    }

    @Override
    public double calcularMontoLlamadas() {
        return this.listaLlamadas.stream()
				.mapToDouble(l -> l.getCosto())
				.sum();
    }
    
}
