package ar.edu.unlp.info.oo2.practica_7.ejercicio_3;

public class Proyecto {

    private String titulo;
    private double meta;
    private double montoActual;
    private Persona responsable;
    private ProyectoState estado;

    public Proyecto(String titulo, double meta,Persona responsable) {
        this.titulo = titulo;
        this.meta = meta;
        this.responsable = responsable;
        this.montoActual = 0;
        this.estado = new Creado();
    }

    public void cancelar() {
        this.estado.cancelar(this);
    }

    public void invertir(double monto) {
        this.estado.invertir(this,monto);
    }
    
    public void setEstado(ProyectoState estado){
        this.estado = estado;
    }

    public double getMeta(){
        return this.meta;
    }

    public double getMontoActual(){
        return this.montoActual;
    }

    public double addMonto(double monto){
        this.montoActual += monto;
        return montoActual;
    }

}
