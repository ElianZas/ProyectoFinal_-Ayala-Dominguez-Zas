package com.proyectofinal_cfp18;

import java.util.ArrayList;

public class choferService {
    static choferDTO choferDTO = new choferDTO();

    public static void validateAndSaveChofer(chofer chofer){
        if(chofer.getNombre() == null ){
            System.out.println("ERROR CAMPO VACIO: INGRESE NOMBRE");
        }
        if(chofer.getApellido() == null ){
            System.out.println("ERROR CAMPO VACIO: INGRESE APELLIDO");
        }
        if(chofer.getDni() == 0 ){
            System.out.println("ERROR DATO INVALIDO: DNI DEBE CONTENER 9 NUMEROS");
        }
        if(chofer.getantiguedad() <0 ){
            System.out.println("ERROR DATO INVALIDO: AÑOS DE ANTIGÜEDAD DEBE SER MAYOR O IGUAL A 0");
        }
        if(chofer.getSueldoBase() == 0 ){
            System.out.println("ERROR DATO INVALIDO: SUELDO BASE DEBE SER MAYOR O IGUAL A 70000");
        } else {
            choferDTO.saveChofer(chofer.getNombre(), chofer.getApellido(), chofer.getDni(), chofer.getantiguedad(), chofer.getSueldoBase());
            System.out.println("OK");
        }
    }

    public ArrayList<sueldochofer> getchofer(){
        ArrayList<chofer> chofer = choferDTO.getchofer ();
        ArrayList<sueldochofer> sueldochofer= new ArrayList<sueldochofer>();
        
        for(int x = 0 ; x < chofer.size();x++){
            int sueldoBruto = 0;
            float sueldoNeto=0;
            if(chofer.get(x).getantiguedad() > 0 ){
                sueldoBruto =  chofer.get(x).getSueldoBase() + (chofer.get(x).getantiguedad() * 5000);
                sueldoNeto = sueldoBruto*0.8f;
                if (sueldoBruto>150000){
                    sueldoBruto=sueldoBruto-4000;
                    sueldoNeto = sueldoBruto*0.8f;
                }
            }else if (chofer.get(x).getSueldoBase()==70000){
                sueldoBruto =   chofer.get(x).getSueldoBase();
                sueldoNeto = sueldoBruto*0.8f;
            }
            //System.out.println(sueldo1);
            sueldochofer.add(new sueldochofer(sueldoBruto, sueldoNeto, chofer.get(x).getDni(), chofer.get(x).getNombre() , chofer.get(x).getApellido()));
        }
        System.out.println("Se creó JSON con los sueldos de los choferes\n"+sueldochofer);
        return sueldochofer;
    }
}
