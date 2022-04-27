package ar.edu.unlp.info.oo2.practica_5_2;

public class LlamadaNacional extends Llamada {

    public LlamadaNacional(String telefono, String telefono2, int duracion) {
        super(telefono,telefono2,duracion);
    }

    @Override
    public double getCosto() {
		return  this.duracion *3 + (this.duracion*3*0.21);
	}
    
}
