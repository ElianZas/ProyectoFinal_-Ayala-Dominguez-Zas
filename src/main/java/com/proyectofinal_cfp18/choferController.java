package com.proyectofinal_cfp18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class choferController {
    
    choferService choferService = new choferService();

    public void getSueldos(){ 
        ArrayList<sueldochofer> sueldoBase = choferService.getchofer();
        JSONObject sueldoss = new JSONObject();
        int x = 0;
        while(x < sueldoBase.size() - 1){ 
            JSONObject sueldo = new JSONObject();         
            sueldo.put("SueldoBruto", sueldoBase.get(x).getsueldoBruto());
            sueldo.put("SueldoNeto", sueldoBase.get(x).getsueldoNeto());
            sueldo.put("nombre",sueldoBase.get(x).getnombre());
            sueldo.put("apellido",sueldoBase.get(x).getapellido());
            
            sueldoss.put(x,sueldo);
            System.out.println();
            x++;
        }

        JSONArray EmpleadosList = new JSONArray();

        EmpleadosList.add(sueldoss);

        try(FileWriter file = new FileWriter("SueldosChofer.json")){
            file.write(EmpleadosList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
