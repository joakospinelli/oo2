package ar.edu.unlp.info.oo2.practica_5.ejercicio_3.ej3_6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Bad smell: condicionales
// Refactoring usando: Replace conditional with Polymorphism.
public class Pelicula {

    private LocalDate fechaEstreno;
    private double costo;

    public double getCosto() {
   	 return this.costo;
    }
    
    public double calcularCargoExtraPorEstreno(){
	// Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
   	return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
    }
}

