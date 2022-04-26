package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_6;

public class UsuarioBasico implements Usuario {

    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
    }
    
}
