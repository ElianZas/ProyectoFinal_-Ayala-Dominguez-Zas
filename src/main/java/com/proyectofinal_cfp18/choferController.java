package com.proyectofinal_cfp18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class choferController {
    
    choferService choferService = new choferService();

    public void getChofer(){ 
        JSONObject choferobj = new JSONObject();
        ArrayList<chofer> choferes = new ArrayList<chofer>();

        choferes.add(new chofer("ROBERTO", "DOMINGUEZ", 31465872, 10, 70000));
        int x = 0;
        for(x=0;x<= choferes.size()-1;x++){ 
                 JSONObject chofer = new JSONObject();
        
                 chofer.put("nombre",choferes.get(x).getNombre());
                 chofer.put("apellido",choferes.get(x).getApellido());
                 chofer.put("dni",choferes.get(x).getDni());
                 chofer.put("antiguedad",choferes.get(x).getantiguedad());
                 chofer.put("sueldoBase",choferes.get(x).getSueldoBase());

                 choferobj.put(66,chofer);
                 System.out.println();
             }       

        JSONArray choferesList = new JSONArray();

        choferesList.add(choferobj);

        try(FileWriter file = new FileWriter("chofer.json")){
            file.write(choferesList.toJSONString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
        public void postChofer(){ 
        JSONParser jsonParser = new JSONParser();
        choferBuilder builderChofer = new choferBuilder();

        try(FileReader reader = new FileReader("chofer.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray jsonChofer = (JSONArray) obj;
            chofer chofer = builderChofer.builderChofer((JSONObject)jsonChofer.get(0));
            System.out.println(chofer);
            choferService.validateAndSaveChofer(chofer);
        } catch (Exception e){
            e.printStackTrace();
        }
    } 
    
    public void getSueldos(){ 
        ArrayList<sueldochofer> sueldoBase = choferService.getchofer();
        JSONObject sueldoss = new JSONObject();
        int x = 0;
        while(x < sueldoBase.size()){ 
            JSONObject sueldo = new JSONObject();        
            sueldo.put("sueldoNeto", sueldoBase.get(x).getsueldoNeto()); 
            sueldo.put("sueldoBruto", sueldoBase.get(x).getsueldoBruto());
            sueldo.put("apellido", sueldoBase.get(x).getapellido());
            sueldo.put("nombre", sueldoBase.get(x).getnombre());
            
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
