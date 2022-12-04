package com.proyectofinal_cfp18;

import java.util.ArrayList;

public class choferService {
    static choferDTO choferDTO = new choferDTO();

    public static void validateAndSaveChofer(chofer chofer){
        if(chofer.getNombre() == null ){
            System.out.println("ERROR: coloque el Nombre");
        }if(chofer.getApellido() == null ){
            System.out.println("ERROR: coloque el apellido");
        } else {
            choferDTO.saveChofer(chofer.getNombre(), chofer.getApellido(), chofer.getDni(), chofer.getantiguedad(), chofer.getSueldoBase());
            System.out.println("OK");
        }
    }

    public ArrayList<sueldochofer> getchofer(){
        ArrayList<chofer> chofer = choferDTO.getchofer ();
        ArrayList<sueldochofer> sueldochofer= new ArrayList<sueldochofer>();
        
        for(int x = 0 ; x < chofer.size();x++){
            int sueldo = 0;
            if(chofer.get(x).getantiguedad() > 0 ){
                sueldo =  chofer.get(x).getSueldoBase() + (chofer.get(x).getantiguedad() * 5000);
                
            }
            //System.out.println(sueldo1);
            sueldochofer.add(new sueldochofer(sueldo, sueldo, chofer.get(x).getDni(), chofer.get(x).getNombre() , chofer.get(x).getApellido()));
        }
        System.out.println(sueldochofer);
        return sueldochofer;
    }
}
