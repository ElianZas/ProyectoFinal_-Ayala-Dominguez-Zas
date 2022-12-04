package com.proyectofinal_cfp18;

public class dota {
    
    private int linea; // linea N°: 79
    private int cantidad_unidades; //total de unidades: 12
    private long Mantenimiento;
    private long ganancias; // ganancias totales: 7000000

    public dota (int newLinea, int newCantidad_unidades,long newMantenimiento, long newGanancias){
        this.linea = newLinea;
        this.Mantenimiento = newMantenimiento;
        this.cantidad_unidades = newCantidad_unidades;
        this.ganancias = newGanancias;
    } 
    
    public int getLinea() {
        return linea;
    }
    public int getCantidad_unidades() {
        return cantidad_unidades;
    }
    public long getMantenimiento() {
        return Mantenimiento;
    }
    public long getGanancias() {
        return ganancias;
    }
    public void setLinea(int linea) {
        this.linea = linea;
    }
    public void setCantidad_unidades(int cantidad_unidades) {
        this.cantidad_unidades = cantidad_unidades;
    }
    public void setMantenimiento(long mantenimiento) {
        Mantenimiento = mantenimiento;
    }
    public void setGanancias(long ganancias) {
        this.ganancias = ganancias;
    }

    public static void add(dota mapDota) {
    }  
}
