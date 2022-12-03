package com.proyectofinal_cfp18;

public class gananciasgastos extends linea {
    private Long ganancias;
    private Long gastos_mantenimiento;

    public gananciasgastos(Long newganancias, Long newgastos_mantenimiento, Long newnumero__linea, Long newunidades__linea, Long newgastos_totalMantenimiento){
        super(newnumero__linea, newunidades__linea, newgastos_totalMantenimiento);
        this.ganancias=newganancias;
        this.gastos_mantenimiento=newgastos_mantenimiento;
    }
    public Long getGanancias() {
        return this.ganancias;
    }
    public Long getGastos_mantenimiento() {
        return this.gastos_mantenimiento;
    }
    public void setGanancias(Long ganancias) {
        this.ganancias = ganancias;
    }
    public void setGastos_mantenimiento(Long gastos_mantenimiento) {
        this.gastos_mantenimiento = gastos_mantenimiento;
    }

}
