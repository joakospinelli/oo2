package ar.edu.unlp.info.oo2.practica_5_2;

public class LlamadaInternacional extends Llamada {
    
    public LlamadaInternacional(String telefono, String telefono2, int duracion) {
        super(telefono,telefono2,duracion);
    }

    public double getCosto() {
		return this.duracion * 200 + (this.duracion *200 * 0.21);
	}

}
