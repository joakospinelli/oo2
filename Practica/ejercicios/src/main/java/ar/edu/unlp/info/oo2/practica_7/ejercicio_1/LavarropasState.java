package ar.edu.unlp.info.oo2.practica_7.ejercicio_1;

public abstract class LavarropasState {

    // Template Method
    public final int iniciarLavado(Lavarropas lavarropas,int agua,int tiempo,int enjuague,int centrifugar){
        lavarropas.agregarAgua(agua);
        lavarropas.agregarJabonEnPolvo();
        lavarropas.lavar(tiempo);
        lavarropas.vaciarAgua();
        lavarropas.agregarEnjuague();
        lavarropas.enjuaga(enjuague);
        lavarropas.centrifugar(centrifugar);
        return tiempo + enjuague + centrifugar;
    }

    public abstract int iniciarLavado(Lavarropas lavarropas);
    
}
