package ar.edu.unlp.info.oo2.practica_7.ejercicio_1;

public class Lavarropas {
    
    private LavarropasStrategy modoLavado;

    public int iniciarLavado(){
        return modoLavado.iniciarLavado(this);
    }

	public void agregarAgua(int porcentaje) {}
	public void agregarJabonEnPolvo() {}
	public void lavar(int minutos) {}
	public void vaciarAgua() {}
	public void agregarEnjuague() {}
	public void enjuaga(int minutos) {}
	public void centrifugar(int minutos) {}

    public void cambiarLavado(LavarropasStrategy strategy){
        this.modoLavado = strategy;
    }

}
