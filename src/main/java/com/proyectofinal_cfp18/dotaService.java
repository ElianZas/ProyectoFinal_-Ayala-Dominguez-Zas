package com.proyectofinal_cfp18;

import java.util.ArrayList;

public class dotaService {
    static dotaDTO dotaDTO = new dotaDTO();


    public ArrayList<ganancias> getDotas(){
        choferService choferService = new choferService();

        ArrayList<dota> dota = dotaDTO.getDotas();
        ArrayList<sueldochofer> sueldochofer= choferService.getchofer();
        ArrayList<ganancias> ganancias= new ArrayList<ganancias>();
        int gananciaBruta = 0;
        int gastosMantenimiento = 0;
        int gananciaNeta = 0;
        int totalSueldosChofer = 0;
        for(int x = 0; x < dota.size() ;x++){
            gananciaBruta = gananciaBruta + dota.get(x).getGanancias();//suma ganancias
            gananciaNeta = (gananciaBruta/100*70);//ganancia Neta
            gastosMantenimiento = gastosMantenimiento + (dota.get(x).getCantidad_unidades() *  dota.get(x).getMantenimiento());//suma gasto de mantenimiento              
        }
        for(int x = 0; x < sueldochofer.size() ;x++){
            totalSueldosChofer = totalSueldosChofer + (sueldochofer.get(x).getsueldoBruto());
        }
        ganancias.add(new ganancias(gastosMantenimiento, gananciaBruta, gananciaNeta,totalSueldosChofer));
        System.out.println();
        return ganancias;
    }
}
