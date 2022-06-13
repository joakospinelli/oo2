package ar.edu.unlp.info.oo2.practica_7.ejercicio_3;

public class Conformado implements ProyectoState {

    public void cancelar(Proyecto p) {
        throw new RuntimeException("No puede cancelar un proyecto ya conformado");
    }

    public void invertir(Proyecto p, double monto) {
        p.addMonto(monto);
    }
}
