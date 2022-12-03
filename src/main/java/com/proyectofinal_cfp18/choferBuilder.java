package com.proyectofinal_cfp18;
import org.json.simple.JSONObject;

public class choferBuilder {
    
    public chofer builderChofer(JSONObject object){
        
        JSONObject choferObject = (JSONObject) object.get("0");
        Long dni__chofer = (Long) choferObject.get("dni__chofer");
        String nombre = (String) choferObject.get("nombre");
        String apellido = (String) choferObject.get("apellido");
        Long sueldo__base = (Long) choferObject.get("sueldo__base");

        chofer resultChofer = new chofer(dni__chofer, nombre, apellido, sueldo__base);
        return resultChofer;   
    }        
}
