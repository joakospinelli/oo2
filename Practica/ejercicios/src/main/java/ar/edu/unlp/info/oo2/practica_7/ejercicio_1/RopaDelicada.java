package ar.edu.unlp.info.oo2.practica_7.ejercicio_1;

public class RopaDelicada extends LavarropasStrategy {

    public int iniciarLavado(Lavarropas lavarropas){
        return super.iniciarLavado(lavarropas,100,40,15,0);
    }
    
}
