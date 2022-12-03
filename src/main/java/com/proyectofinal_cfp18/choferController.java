package com.proyectofinal_cfp18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class choferController {

    public static void main( String[] args ){

    //     JSONObject choferObjet = new JSONObject();

    //     ArrayList<chofer> choferes = new ArrayList<chofer>();

    //     choferes.add(new chofer(35478116L, "Elian", "Zas", 70000L));
    //     choferes.add(new chofer(34658971L, "Nicolas", "Ayala", 70000L));
    //     choferes.add(new chofer(31458375L, "Paula", "Dominguez", 70000L));

    //     int x = 0;
    //     for(x=0;x<= choferes.size()-1;x++){ 
    //         JSONObject choferObjet2 = new JSONObject();
                        
    //         choferObjet2.put("dni__chofer", choferes.get(x).getDni__chofer());
    //         choferObjet2.put("nombre", choferes.get(x).getNombre());
    //         choferObjet2.put("apellido", choferes.get(x).getApellido());
    //         choferObjet2.put("sueldo__base", choferes.get(x).getSueldo__base());

    //         choferObjet.put(x,choferObjet2);
    //         System.out.println();
    //     }       
    //     JSONArray choferesList = new JSONArray();

    //     choferesList.add(choferObjet);
    
    //     try(FileWriter file = new FileWriter("Choferes.json")){
    //         file.write(choferesList.toJSONString());
    //         file.flush();
    //     } catch (IOException e){
    //         e.printStackTrace();
    //     }
    // }
        // int x = 0;
        // while(x < empleadoBase.size() - 1){ 

        //     JSONObject Empleado = new JSONObject();
            
        //     Empleado.put("nombre", empleadoBase.get(x).getNombre());
        //     Empleado.put("apellido", empleadoBase.get(x).getApellido());
        //     Empleado.put("fecha_nacimiento",empleadoBase.get(x).getFecha_nacimiento());
            
        //     empleadoss.put(x,Empleado);
        //     System.out.println();
        //     x++;
        // }
        JSONParser jsonParser = new JSONParser();
        choferBuilder choferBuilder = new choferBuilder();

        try(FileReader reader = new FileReader("Choferes.json")){
            Object obj = jsonParser.parse(reader);
            JSONArray jsonChoferes = (JSONArray) obj;
            chofer chofer1 = choferBuilder.builderChofer((JSONObject)jsonChoferes.get(0));
            System.out.println(chofer1);
            choferService.validateAndSaveChofer(chofer1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
