package com.proyectofinal_cfp18;
import org.json.simple.JSONObject;

public class choferBuilder {

    public sueldochofer builderSueldosChofer(JSONObject object){
        JSONObject sueldosObject = (JSONObject) object.get("0");
        Long sueldoBruto = (Long) sueldosObject.get("sueldoBruto");
        Long sueldoNeto=(Long) sueldosObject.get("sueldoNeto");
        Long dni=(Long) sueldosObject.get("dni");
        String nombre = (String) sueldosObject.get("nombre");
        String apellido = (String) sueldosObject.get("apellido");
        sueldochofer resultChofer = new sueldochofer(sueldoBruto.intValue(), sueldoNeto.intValue(), dni.intValue(), nombre, apellido);
        return resultChofer;   
    }        
    
    public static chofer builderChofer(JSONObject object){
        JSONObject choferObject = (JSONObject) object.get("66");
        String nombre=(String) choferObject.get("nombre");
        String apellido=(String) choferObject.get("apellido");
        Long dni=(Long) choferObject.get("dni");
        Long antiguedad=(Long) choferObject.get("antiguedad");
        Long sueldoBase=(Long) choferObject.get("sueldoBase");
        chofer resultChofer = new chofer(nombre, apellido, dni.intValue(), antiguedad.intValue(), sueldoBase.intValue());
        return resultChofer;   
    }        
}