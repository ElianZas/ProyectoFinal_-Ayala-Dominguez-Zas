package com.proyectofinal_cfp18;

import java.util.ArrayList;

public class dotaService {
    static dotaDTO dotaDTO = new dotaDTO();


    public ArrayList<ganancias> getDotas(){
        choferService choferService = new choferService();

        ArrayList<dota> dota = dotaDTO.getDotas();
        ArrayList<sueldochofer> sueldochofer= choferService.getchofer();
        ArrayList<ganancias> ganancias= new ArrayList<ganancias>();
        int sumaganancia = 0;
        int sumamantenimiento = 0;
        int gananciaNeta = 0;
        int sumasueldochofer = 0;
        for(int x = 0; x < dota.size() ;x++){
            sumaganancia = sumaganancia + dota.get(x).getGanancias();//suma ganancias
            gananciaNeta = (sumaganancia/100*80);//ganancia Neta
            sumamantenimiento = sumamantenimiento + (dota.get(x).getCantidad_unidades() *  dota.get(x).getMantenimiento());//suma gasto de mantenimiento              
        }
        for(int x = 0; x < sueldochofer.size() ;x++){
            sumasueldochofer = sumasueldochofer + (sueldochofer.get(x).getsueldoBruto());
        }
        ganancias.add(new ganancias(sumaganancia, sumamantenimiento, gananciaNeta,sumasueldochofer));
        System.out.println(ganancias);
        return ganancias;
    }
}
