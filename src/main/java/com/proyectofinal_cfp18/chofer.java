package com.proyectofinal_cfp18;

public class chofer {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int antigüedad;
    private int sueldoBase;

    public chofer(String newNombre, String newApellido, int newDni, int newAntiguedad, int newSueldoBase){
        this.nombre = newNombre;
        this.apellido = newApellido;
        this.dni = newDni;
        this.antigüedad = newAntiguedad;
        this.sueldoBase = newSueldoBase;
        }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }
    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String toString(){
        return this.nombre + " " + this.apellido +" " +this.dni+" "+this.antigüedad+" "+this.sueldoBase+" ";
    }
    
}
