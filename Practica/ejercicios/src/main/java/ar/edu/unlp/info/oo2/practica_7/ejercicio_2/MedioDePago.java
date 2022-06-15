package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

public abstract class MedioDePago {
    
    protected Cliente cliente;

    public void setCliente(Cliente cli){
        this.cliente = cli;
    }

    public abstract boolean pagar(double monto);

}
