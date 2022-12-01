package com.proyectofinal_cfp18;

public class colectivos extends dota {

    
    private int ganancia;
    private int mantenimiento;

    public colectivos(int newGanancia, int newMantenimiento,int newLinea, int newTotal_unidades, int newTotal_ganancias){
        super(newMantenimiento, newMantenimiento, newGanancia);
        this.ganancia = newGanancia;
        this.mantenimiento = newMantenimiento;
    }

    @Override
    public int oferta_unidad(int ganancias_linea) {
        return 0;
    }
}
