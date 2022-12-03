package com.proyectofinal_cfp18;

public class chofer {
    
    private String nombre;
    private String apellido;
    private long dni;
    private int antigüedad;
    private long sueldoBase;

    public chofer(String newNombre, String newApellido, long newDni, int newAntiguedad, long newSueldoBase){
        this.nombre = newNombre;
        this.apellido = newApellido;
        this.dni = newDni;
        this.sueldoBase = newSueldoBase;
        }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public long getSueldoBase() {
        return sueldoBase;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }
    public void setSueldoBase(long sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
}
