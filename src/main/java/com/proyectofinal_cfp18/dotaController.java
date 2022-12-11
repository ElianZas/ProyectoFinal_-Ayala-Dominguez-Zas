package com.proyectofinal_cfp18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class dotaController {
    dotaService dotaService = new dotaService();

    public void getGananciasDota(){ 
        ArrayList<ganancias> gananciaBase = dotaService.getDotas();
        JSONObject gananciass = new JSONObject();
        int x = 0;
        while(x < gananciaBase.size() ){ 
            JSONObject ganancia = new JSONObject();         
            ganancia.put("gastosMantenimientoUnidades", gananciaBase.get(x).getmantenimientoLinea());
            ganancia.put("gananciaBrutaEmpresa", gananciaBase.get(x).getGananciaBruta());
            ganancia.put("gananciaNetaEmpresa",gananciaBase.get(x).getganaciaNeta());
            ganancia.put("totalSueldosChoferes",gananciaBase.get(x).gettotalSueldoChofer());
            ganancia.put("GananciaFinalEmpresa",gananciaBase.get(x).getganaciaFinalEmpresa());
            
            
            gananciass.put(x,ganancia);
            System.out.println();
            x++;
        }

        JSONArray gananciaList = new JSONArray();

        gananciaList.add(gananciass);

        try(FileWriter file = new FileWriter("GananciasYGastos.json")){
            file.write(gananciaList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
