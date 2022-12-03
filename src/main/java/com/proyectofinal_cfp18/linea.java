package com.proyectofinal_cfp18;

public class linea{
    protected Long numero__linea;
    protected Long unidades__linea;
    protected Long gastos__totalMantenimiento;

    public linea(Long newnumero__linea, Long newunidades__linea, Long newgastos_totalMantenimiento){
        this.numero__linea=newnumero__linea;
        this.unidades__linea=newunidades__linea;
        this.gastos__totalMantenimiento=newgastos_totalMantenimiento;
    }
}
