package ar.edu.unlp.info.oo2.ejercicio_2b;

import java.util.List;
import org.json.simple.*;

/* No sé si debería cambiar los métodos de esta clase para que
 * trabajen con JSON o si debería hacer una clase nueva (PREGUNTAR)
 */

public class VoorheesExporter {

	private static JSONObject crearJson(Socio s) {
		JSONObject objectJson = new JSONObject();	
		objectJson.put("name",s.getNombre());
		objectJson.put("legajo", s.getLegajo());
		objectJson.put("email", s.getEmail());
		
		return objectJson;
	}
	
	public String exportar(List<Socio> socios) {
		
		JSONArray arrayJson = new JSONArray();
		
		for (Socio i: socios) {
			arrayJson.add(crearJson(i));
		}
		
		return arrayJson.toJSONString();
	}
}
