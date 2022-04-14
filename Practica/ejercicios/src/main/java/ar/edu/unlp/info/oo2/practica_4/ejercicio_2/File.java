package ar.edu.unlp.info.oo2.practica_4.ejercicio_2;

import java.time.LocalDate;

public interface File {
    
    public String prettyPrint();
    public String getNombre();
    public String getExtension();
    public String getPermisos();
    public double getTamaño();
    public LocalDate getCreacion();
	public LocalDate getModificacion();

}
