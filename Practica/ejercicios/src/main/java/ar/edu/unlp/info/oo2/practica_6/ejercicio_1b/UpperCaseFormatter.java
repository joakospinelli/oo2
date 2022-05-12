package ar.edu.unlp.info.oo2.practica_6.ejercicio_1b;

import java.util.logging.*;

public class UpperCaseFormatter extends SimpleFormatter {
    
    public String format(LogRecord record){
        return super.format(record).toUpperCase();
    }

}
