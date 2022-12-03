package com.proyectofinal_cfp18;
import java.sql.Date;

public class choferMapping {
    
    public chofer mapChofer(Long dni__chofer, String nombreBD, String apellidoBD, Long sueldo__baseBD){
        chofer chofer = new chofer( dni__chofer,  nombreBD,  apellidoBD,  sueldo__baseBD);
        return chofer;
    }
}
