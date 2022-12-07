package com.proyectofinal_cfp18;

public class ganancias {
    private int mantenimientosLinea;
    private int gananciaBruta;
    private int ganaciaNeta;
    private int totalSueldoChofer;

    public ganancias(int newmantenimientoLinea, int newgananciaBruta, int newganaciaNeta , int newtotalSueldoChofer){
        this.mantenimientosLinea = newmantenimientoLinea;
        this.gananciaBruta = newgananciaBruta;
        this.ganaciaNeta = newganaciaNeta;
        this.totalSueldoChofer = newtotalSueldoChofer;
    }

    public int getmantenimientoLinea(){
        return mantenimientosLinea;
    }

    public int getGananciaBruta() {
        return gananciaBruta;
    }

    public int getganaciaNeta(){
        return ganaciaNeta;
    }

    public int gettotalSueldoChofer(){
        return totalSueldoChofer;
    }

    public String toString(){
        return this.mantenimientosLinea + " " + this.gananciaBruta +" " +this.ganaciaNeta+" "+this.totalSueldoChofer+" ";
    }
}
