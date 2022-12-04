package com.proyectofinal_cfp18;

import java.util.ArrayList;

public class choferService {
    
    choferDTO choferDTO = new choferDTO();

    public ArrayList<sueldochofer> getchofer(){
        ArrayList<chofer> chofer = choferDTO.getchofer ();
        ArrayList<sueldochofer> sueldochofer= new ArrayList<sueldochofer>();
        
        for(int x = 0 ; x < chofer.size();x++){
            int sueldo = 0;
            if(chofer.get(x).getAntigüedad() > 0 ){
                sueldo =  chofer.get(x).getSueldoBase() + (chofer.get(x).getAntigüedad() * 5000);
                
            }
            //System.out.println(sueldo1);
            sueldochofer.add(new sueldochofer(sueldo, sueldo, chofer.get(x).getNombre() , chofer.get(x).getApellido()));
            
            
        }
        System.out.println(sueldochofer);
        return sueldochofer;
    }
}
