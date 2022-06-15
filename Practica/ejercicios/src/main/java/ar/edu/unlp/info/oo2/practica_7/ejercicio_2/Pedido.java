package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

public class Pedido {
    
    private Cliente cliente;
    private double monto;

    public Pedido(Cliente cli,double monto){
        this.cliente = cli;
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double monto() {
        return monto;
    }

    public boolean pagarCon(MedioDePago m){
        m.setCliente(cliente);
        return m.pagar(this.monto);
    }
}
