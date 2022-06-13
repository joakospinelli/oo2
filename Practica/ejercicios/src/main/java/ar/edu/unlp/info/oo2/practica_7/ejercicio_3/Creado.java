package ar.edu.unlp.info.oo2.practica_7.ejercicio_3;

public class Creado implements ProyectoState {

    public void cancelar(Proyecto p) {
        p.setEstado(new Cancelado());
    }

    public void invertir(Proyecto p, double monto) {
        if (p.addMonto(monto) == p.getMeta()){
            p.setEstado(new Conformado());
        }
    }
}
