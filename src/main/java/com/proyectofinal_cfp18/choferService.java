package com.proyectofinal_cfp18;
import java.util.ArrayList;

public class choferService{

    static choferesDTO choferesDTO = new choferesDTO();

    public ArrayList<chofer> getEmpleados(){
        ArrayList<chofer> chofer = choferesDTO.getChoferes();
        return chofer;
    }

    public static void validateAndSaveChofer(chofer chofer){
            choferesDTO.saveChofer(chofer.getDni__chofer(), chofer.getNombre(), chofer.getApellido(), chofer.getSueldo__base());
        }
    }