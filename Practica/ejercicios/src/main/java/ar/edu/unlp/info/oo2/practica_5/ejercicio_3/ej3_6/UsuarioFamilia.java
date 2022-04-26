package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_6;

public class UsuarioFamilia {
    
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno() * 0.90;
    }
}
