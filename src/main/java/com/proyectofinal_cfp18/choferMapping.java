package com.proyectofinal_cfp18;

public class choferMapping {

    public chofer mapChofer(String nombreBD, String apellidoBD, Integer dniDB, Integer antiguedadDB, Integer sueldoBaseBD){
    chofer chofer = new chofer(nombreBD, apellidoBD,dniDB, antiguedadDB, sueldoBaseBD);
    return chofer;
    
    }
}
