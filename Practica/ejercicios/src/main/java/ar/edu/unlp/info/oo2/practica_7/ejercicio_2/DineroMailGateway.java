package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

public class DineroMailGateway {

    private double montoActual;
    private String email;

    public DineroMailGateway(double monto,String email) {
        this.email = email;
        this.montoActual = monto;
    }

    public boolean realizarPagoParaEmail(double monto, String email) {
        if (this.montoActual < monto || !(this.email.equals(email))) return false;

        this.montoActual = this.montoActual - monto;
        return true;
    }

}
