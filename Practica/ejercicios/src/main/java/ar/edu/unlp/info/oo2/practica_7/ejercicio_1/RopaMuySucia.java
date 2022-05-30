package ar.edu.unlp.info.oo2.practica_7.ejercicio_1;

public class RopaMuySucia extends LavarropasState {

    public int iniciarLavado(Lavarropas lavarropas){
        return super.iniciarLavado(lavarropas,100,100,15,10);
    }
    
}
