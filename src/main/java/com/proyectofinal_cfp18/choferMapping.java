package com.proyectofinal_cfp18;

public class choferMapping {

    public chofer mapChofer(String nombreBD, String apellidoBD, long dniDB, int antiguedadDB, long sueldoBaseBD){
    chofer chofer = new chofer(nombreBD,  apellidoBD,dniDB, antiguedadDB, sueldoBaseBD);
    return chofer;
    
    }
}
