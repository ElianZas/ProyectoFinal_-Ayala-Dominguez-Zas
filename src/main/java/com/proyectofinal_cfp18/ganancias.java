package com.proyectofinal_cfp18;

public class ganancias {
    private int mantenimientosLinea;
    private int gananciaBruta;
    private int ganaciaNeta;
    private int totalSueldoChofer;
    private int ganaciaFinalEmpresa;

    public ganancias(int newmantenimientoLinea, int newgananciaBruta, int newganaciaNeta , int newtotalSueldoChofer, int newganaciaFinalEmpresa){
        this.mantenimientosLinea = newmantenimientoLinea;
        this.gananciaBruta = newgananciaBruta;
        this.ganaciaNeta = newganaciaNeta;
        this.totalSueldoChofer = newtotalSueldoChofer;
        this.ganaciaFinalEmpresa = newganaciaFinalEmpresa;
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

    public int getganaciaFinalEmpresa(){
        return ganaciaFinalEmpresa;
    }

    public String toString(){
        return this.mantenimientosLinea + " " + this.gananciaBruta +" " +this.ganaciaNeta+" "+this.totalSueldoChofer+" ";
    }
}
