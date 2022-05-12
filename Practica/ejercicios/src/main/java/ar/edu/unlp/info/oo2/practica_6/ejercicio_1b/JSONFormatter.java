package ar.edu.unlp.info.oo2.practica_6.ejercicio_1b;

import java.util.HashMap;
import java.util.logging.*;

import org.json.simple.JSONObject;

public class JSONFormatter extends SimpleFormatter {
    
    public String format(LogRecord record){
        HashMap<String,Object> mapJson = new HashMap<>();
        mapJson.put("message",record.getMessage());
        mapJson.put("level",record.getLevel());
        return new JSONObject(mapJson).toString() + "\n";
    }

}
