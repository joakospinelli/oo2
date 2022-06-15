package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

public class DineroMailGatewayAdapter extends MedioDePago {

    private DineroMailGateway adaptee;

    public DineroMailGatewayAdapter(double monto,String email) {
        this.adaptee = new DineroMailGateway(monto,email);
    }

    
    public boolean pagar(double monto){
        return this.adaptee.realizarPagoParaEmail(monto,this.cliente.getEmail());
    }
    
}
