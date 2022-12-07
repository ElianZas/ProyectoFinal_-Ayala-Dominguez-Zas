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
            ganancia.put("gananciaBruto", gananciaBase.get(x).getgananciasLinea());
            ganancia.put("GastoMatenimiento", gananciaBase.get(x).getmantenimientoLinea());
            ganancia.put("GananciaNeta",gananciaBase.get(x).getganaciaNeta());
            ganancia.put("totalSueldosChofer",gananciaBase.get(x).gettotalSueldoChofer());
            
            
            gananciass.put(x,ganancia);
            System.out.println();
            x++;
        }

        JSONArray GananciaList = new JSONArray();

        GananciaList.add(gananciass);

        try(FileWriter file = new FileWriter("GananciasYGastos.json")){
            file.write(GananciaList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
