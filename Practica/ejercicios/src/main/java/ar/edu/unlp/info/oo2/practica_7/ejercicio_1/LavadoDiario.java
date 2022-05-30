package ar.edu.unlp.info.oo2.practica_7.ejercicio_1;

public class LavadoDiario extends LavarropasState {

    public int iniciarLavado(Lavarropas lavarropas){
        return super.iniciarLavado(lavarropas,50,20,7,3);
    }
    
}
