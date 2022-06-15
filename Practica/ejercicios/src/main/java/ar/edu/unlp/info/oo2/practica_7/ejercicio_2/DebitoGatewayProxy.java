package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

public class DebitoGatewayProxy extends MedioDePago{

    private DebitoGateway realAccess;

    public DebitoGatewayProxy(double monto,String cbu){
        this.realAccess = new DebitoGateway(monto,cbu);
    }

    public boolean pagar(double monto){
        if (this.realAccess.autorizarMontoConCbu(monto,this.cliente.getCbu()).size() > 0){
            return false;
        }
        this.realAccess.pagarMontoConCbu(monto,this.cliente.getCbu());
        return true;
    }

}
