package com.proyectofinal_cfp18;

import java.util.ArrayList;
import java.util.Scanner;

public class dotaService {
    static dotaDTO dotaDTO = new dotaDTO();

    public ArrayList<ganancias> getDotas(){

        Scanner input = new Scanner(System.in);

        choferService choferService = new choferService();

        ArrayList<dota> dota = dotaDTO.getDotas();
        ArrayList<sueldochofer> sueldochofer = choferService.getchofer();
        ArrayList<ganancias> ganancias = new ArrayList<ganancias>();
        int gananciaBruta = 0;
        int gastosMantenimiento = 0;
        int gananciaNeta = 0;
        int totalSueldosChofer = 0;
        int totalganacia = 0;
        int gananciaFinalEmpresa = 0;
        for(int x = 0; x < dota.size() ;x++){
            gananciaBruta = gananciaBruta + dota.get(x).getGanancias();
            gananciaNeta = (gananciaBruta/100*70);
            gastosMantenimiento = gastosMantenimiento + (dota.get(x).getCantidad_unidades() * dota.get(x).getMantenimiento());//suma gasto de mantenimiento              
        }
        for(int x = 0; x < sueldochofer.size() ;x++){
            totalSueldosChofer = totalSueldosChofer + (sueldochofer.get(x).getsueldoBruto());
        }
        totalganacia = gananciaNeta - (gastosMantenimiento + totalSueldosChofer);
        System.out.println("");
        System.out.println("GANANCIA EMPRESA DESCONTANDO IMPUESTO GANANCIA, TOTAL SUELDOS CHOFER Y MANTENIMIENTO DE COLECTIVOS = " + totalganacia);
        System.out.println("");
     
        if(totalganacia > 10000000){
            System.out.println("QUIERE COMPRAR NUEVA UNIDAD VALOR $5.000.000--INGRESE 1=SI / 0=NO:");
            int comprar = input.nextInt(); 
            if(comprar == 1){
                gananciaFinalEmpresa = totalganacia - 5000000;
                System.out.println("SE SUMARA 5.000.000 A LOS GASTOS");
                System.out.println("");
                System.out.println("TOTAL GANANCIA EMPRESA: " + gananciaFinalEmpresa);
            }else {
                gananciaFinalEmpresa = totalganacia;
                System.out.println("OPTO NO comprar UNIDAD");
                System.out.println("TOTAL GANANCIA EMPRESA: " + gananciaFinalEmpresa);
            }    
        }
        else {
            System.out.println("LAS GANANCIAS NO SUPERAN LOS $ 10.000.000. NO HAY OFERTA DE UNIDADES NUEVAS.");
            gananciaFinalEmpresa = totalganacia;
        }
        ganancias.add(new ganancias(gastosMantenimiento, gananciaBruta, gananciaNeta,totalSueldosChofer,gananciaFinalEmpresa));
        System.out.println();
        input.close();
        return ganancias;
    }
}
