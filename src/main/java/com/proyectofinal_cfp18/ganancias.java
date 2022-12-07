package com.proyectofinal_cfp18;

public class ganancias {
    private int mantenimientosLinea;
    private int gananciasLinea;
    private int ganaciaNeta;
    private int totalSueldoChofer;

    public ganancias(int newmantenimientoLinea, int newgananciasLinea, int newganaciaNeta , int newtotalSueldoChofer){
        this.mantenimientosLinea = newmantenimientoLinea;
        this.gananciasLinea = newgananciasLinea;
        this.ganaciaNeta = newganaciaNeta;
        this.totalSueldoChofer = newtotalSueldoChofer;
    }

    public int getmantenimientoLinea(){
        return mantenimientosLinea;
    }

    public int getgananciasLinea(){
        return gananciasLinea;
    }

    public int getganaciaNeta(){
        return ganaciaNeta;
    }

    public int gettotalSueldoChofer(){
        return totalSueldoChofer;
    }

    public String toString(){
        return this.mantenimientosLinea + " " + this.gananciasLinea +" " +this.ganaciaNeta+" "+this.totalSueldoChofer+" ";
    }
}
