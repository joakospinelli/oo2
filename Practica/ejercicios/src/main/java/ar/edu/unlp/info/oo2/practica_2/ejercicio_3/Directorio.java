package ar.edu.unlp.info.oo2.practica_2.ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ArchivoComponent {
    
    private ArrayList<ArchivoComponent> archivos;

    public Directorio(String nombre,LocalDate fecha){
        super(nombre,fecha,32);
        archivos = new ArrayList<>();
    }
    
    public void agregarArchivo(ArchivoComponent a){
        this.archivos.add(a);
    }

    public int getTamaño(){
        return this.tamañoTotalOcupado();
    }

    public int tamañoTotalOcupado(){
        return this.archivos.stream()
                .mapToInt(i -> i.getTamaño())
                .sum() + this.tamaño;
    }

    public ArchivoComponent archivoMasGrande(){
        ArchivoComponent max = null;
        ArchivoComponent act = null;
        int maxValue = Integer.MIN_VALUE;

        for (ArchivoComponent i: this.archivos){
            act = i.archivoMasGrande();
            if (act.getTamaño() >= maxValue){
                max = act;
                maxValue = act.getTamaño();
            }
        }
        return max;
    }

    public ArchivoComponent archivoMasNuevo(){
        LocalDate maxDate = LocalDate.of(1977,1,1);
        ArchivoComponent max = null;
        ArchivoComponent act = null;

        for (ArchivoComponent i: this.archivos){
            act = i.archivoMasNuevo();
            if (act.getFecha().isAfter(maxDate) || act.getFecha().isEqual(maxDate)){
                max = act;
                maxDate = act.getFecha();
            }
        }
        return max;
    }

}
