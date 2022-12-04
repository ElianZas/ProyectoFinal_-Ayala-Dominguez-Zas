package com.proyectofinal_cfp18;

public class dotaMapping {
    
    public dota mapDota(int lineaDB,int cantidad_unidadesDB, int mantenimientoDB, int gananciasDB ){
        dota dota = new dota(lineaDB, cantidad_unidadesDB, mantenimientoDB, gananciasDB);
        return dota;
        
    }
}
