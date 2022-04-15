package ar.edu.unlp.info.oo2.practica_3.ejercicio_4;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Puntaje implements Sugerencia {
    
    public List<Pelicula> sugerir(Decodificador d){
        List<Pelicula> noVistas = d.getPeliculas().stream()
                                  .filter(p -> !d.getConocidas().contains(p))
                                  .toList();
                                  
    return noVistas.stream()
                   .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed()
                   .thenComparing(Comparator.comparing(Pelicula::getEstreno).reversed()))
                   .limit(3)
                   .collect(Collectors.toList());
    }

}
