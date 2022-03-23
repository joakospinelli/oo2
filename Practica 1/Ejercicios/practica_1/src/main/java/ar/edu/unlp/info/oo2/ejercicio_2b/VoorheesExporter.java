package ar.edu.unlp.info.oo2.ejercicio_2b;

import java.util.List;
import org.json.simple.*;

public class VoorheesExporter {

	private static JSONObject crearJson(Socio s) {
		JSONObject objectJson = new JSONObject();	
		objectJson.put("name",s.getNombre());
		objectJson.put("legajo", s.getLegajo());
		objectJson.put("email", s.getEmail());
		
		return objectJson;
	}
	
	private String exportar(Socio socio) {
		
		return crearJson(socio).toJSONString();
	}
	
	public String exportar(List<Socio> socios) {
		
		JSONArray arrayJson = new JSONArray();
		
		for (Socio i: socios) {
			arrayJson.add(crearJson(i));
		}
		
		return arrayJson.toJSONString();
	}
}
