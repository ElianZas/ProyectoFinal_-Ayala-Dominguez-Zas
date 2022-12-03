package com.proyectofinal_cfp18;

public class chofer {
    protected Long dni__chofer;
    protected String nombre;
    protected String apellido;
    protected Long sueldo__base;

    public chofer (Long newdni__chofer, String newnombre, String newapellido, Long newsueldo__base){
        this.dni__chofer = newdni__chofer;
        this.nombre = newnombre;
        this.apellido = newapellido;
        this.sueldo__base=newsueldo__base;
    }     
    public String getApellido() {
        return this.apellido;
    }
    public Long getDni__chofer() {
        return this.dni__chofer;
    }
    public String getNombre() {
        return this.nombre;
    }
    public Long getSueldo__base() {
        return this.sueldo__base;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni__chofer(Long dni__chofer) {
        this.dni__chofer = dni__chofer;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSueldo__base(Long sueldo__base) {
        this.sueldo__base = sueldo__base;
    }
    
}
