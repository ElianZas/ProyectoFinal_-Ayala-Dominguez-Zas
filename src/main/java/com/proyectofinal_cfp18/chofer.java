package com.proyectofinal_cfp18;

public class chofer {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int antiguedad;
    private int sueldoBase;

    public chofer(String newNombre, String newApellido, int newDni, int newAntiguedad, int newSueldoBase){
        this.nombre = newNombre;
        this.apellido = newApellido;
        this.dni = newDni;
        this.antiguedad = newAntiguedad;
        this.sueldoBase = newSueldoBase;
        }
    
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public int getantiguedad() {
        return this.antiguedad;
    }

    public int getSueldoBase() {
        return this.sueldoBase;
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
    public void setantiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String toString(){
        return this.nombre + " " + this.apellido +" " +this.dni+" "+this.antiguedad+" "+this.sueldoBase+" ";
    }
    
}
