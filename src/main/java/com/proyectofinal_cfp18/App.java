package com.proyectofinal_cfp18;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        dotaController dotaController = new dotaController();
        choferController choferController = new choferController();
        //choferController.getpostChofer();
        // choferController.getSueldos();
        choferController.postSueldos("0");
        // dotaController.getGananciasDota();


        //para prueba
        //dotaService dotaService = new dotaService();
        //dotaService.getDotas();
    }
}
