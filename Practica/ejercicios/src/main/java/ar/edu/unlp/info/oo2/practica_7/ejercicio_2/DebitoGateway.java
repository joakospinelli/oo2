package ar.edu.unlp.info.oo2.practica_7.ejercicio_2;

import java.util.ArrayList;

public class DebitoGateway {

    private double montoActual;
    private String cbu;

    public DebitoGateway(double monto,String cbu){
        this.montoActual = monto;
        this.cbu = cbu;
    }

    public ArrayList<String> autorizarMontoConCbu(double monto,String cbu){
        ArrayList<String> errores = new ArrayList<>();

        if (this.montoActual < monto || !this.cbu.equals(cbu)){
            errores.add("Error");
        }
        return errores;
    }

    public void pagarMontoConCbu(double monto,String cbu){
        this.montoActual = this.montoActual - monto;
    }
}
