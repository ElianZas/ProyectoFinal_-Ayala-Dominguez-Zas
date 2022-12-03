package com.proyectofinal_cfp18;

public class sueldo extends chofer{
    private Long sueldo__bruto;
    private Long sueldo__neto;

    public sueldo(Long newsueldo__bruto, Long newsueldo__neto, Long newdni__chofer, String newnombre, String newapellido, Long newsueldo__base){
        super(newdni__chofer, newnombre,newapellido, newsueldo__base);
        this.sueldo__bruto=newsueldo__bruto;
        this.sueldo__neto=newsueldo__neto;
    }

    public void setSueldo__bruto(Long sueldo__bruto) {
        this.sueldo__bruto = sueldo__bruto;
    }
    public void setSueldo__neto(Long sueldo__neto) {
        this.sueldo__neto = sueldo__neto;
    }

    public Long getSueldo__bruto() {
        return this.sueldo__bruto;
    }
    public Long getSueldo__neto() {
        return this.sueldo__neto;
    }


}
