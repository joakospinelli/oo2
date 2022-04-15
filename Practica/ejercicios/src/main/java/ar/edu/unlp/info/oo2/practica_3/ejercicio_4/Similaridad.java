package ar.edu.unlp.info.oo2.practica_3.ejercicio_4;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements Sugerencia {
    
    public List<Pelicula> sugerir(Decodificador d){
        List<Pelicula> noVistas = d.getPeliculas().stream()
                                  .filter(p -> !d.getConocidas().contains(p))
                                  .toList();

    return noVistas.stream()
                   .filter(p -> d.getConocidas().stream().anyMatch(aux -> aux.getSimilares().contains(p)))
                   .limit(3)
                   .collect(Collectors.toList());
    }

}
