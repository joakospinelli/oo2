package ar.edu.unlp.info.oo2.practica_7.ejercicio_3;

public class Cancelado implements ProyectoState {

    public void cancelar(Proyecto p) {
        throw new RuntimeException("Este proyecto ya está cancelado");
    }

    public void invertir(Proyecto p, double monto) {
        throw new RuntimeException("No puede invertir en un proyecto cancelado");
    }
    
}
