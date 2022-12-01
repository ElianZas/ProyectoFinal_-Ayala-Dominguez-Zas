package com.proyectofinal_cfp18;

public class choferes extends dota {

    private int salario;

    public choferes(int newSalario, int newLinea,int newTotal_unidades,int newTotal_ganancias){
        super(newLinea, newTotal_unidades, newTotal_ganancias);
        this.salario = newSalario;

    }

    @Override
    public int oferta_unidad(int ganancias_linea) {
        return 0;
    }

  
    
}
