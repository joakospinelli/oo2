package ar.edu.unlp.info.oo2.practica_7.ejercicio_1;

public class RopaMuySucia extends LavarropasStrategy {

    // No usé el método de la superclase porque hacía las cosas en distinto orden
    public int iniciarLavado(Lavarropas lavarropas){
        lavarropas.agregarAgua(100);
        lavarropas.agregarJabonEnPolvo();
        lavarropas.lavar(100);
        lavarropas.vaciarAgua();
        lavarropas.agregarJabonEnPolvo();
        lavarropas.lavar(30);
        lavarropas.vaciarAgua();
        lavarropas.agregarEnjuague();
        lavarropas.enjuaga(15);
        lavarropas.centrifugar(10);

        return 100 + 30 + 15 + 10;
    }
}
