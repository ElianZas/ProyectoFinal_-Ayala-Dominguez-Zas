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
        return this.mantenimientosLinea;
    }

    public int getGananciaBruta() {
        return this.gananciaBruta;
    }

    public int getganaciaNeta(){
        return this.ganaciaNeta;
    }

    public int gettotalSueldoChofer(){
        return this.totalSueldoChofer;
    }

    public int getganaciaFinalEmpresa(){
        return this.ganaciaFinalEmpresa;
    }

    public String toString(){
        return this.mantenimientosLinea + " " + this.gananciaBruta +" " +this.ganaciaNeta+" "+this.totalSueldoChofer+" ";
    }
}
