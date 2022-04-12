package ar.edu.unlp.info.oo2.practica_3.ejercicio_4;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Puntaje implements Sugerencia {
    
    public List<Pelicula> sugerir(List<Pelicula> peliculas){
        Collections.sort(peliculas, new PuntajeComparable());
        Collections.reverse(peliculas);
        return peliculas.stream().limit(3).collect(Collectors.toList());
    }

}
