package com.proyectofinal_cfp18;
import org.json.simple.JSONObject;

public class choferBuilder {
    
    public static chofer builderChofer(JSONObject object){
        JSONObject choferObject = (JSONObject) object.get("66");
        String nombre = (String) choferObject.get("nombre");
        String apellido = (String) choferObject.get("apellido");
        Long dni=(Long) choferObject.get("dni");
        Long antiguedad = (Long) choferObject.get("antiguedad");
        Long sueldoBase = (Long) choferObject.get("sueldoBase");
        chofer resultChofer = new chofer(nombre, apellido, dni.intValue(), antiguedad.intValue(), sueldoBase.intValue());
        return resultChofer;   
    }        
}