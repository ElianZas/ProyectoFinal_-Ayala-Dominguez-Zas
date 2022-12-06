package com.proyectofinal_cfp18;
// para el formato del JSON
public class sueldochofer {
    private int sueldoBruto;
    private float sueldoNeto;
    private int dni;
    private String nombre;
    private String apellido;

    public sueldochofer(float newsueldoBruto, float newsueldoNeto, int newdni, String newnombre, String newapellido){
        this.sueldoBruto = newsueldoBruto;
        this.sueldoNeto = newsueldoNeto;
        this.dni = newdni;
        this.nombre = newnombre;
        this.apellido = newapellido;
    }

    public int getsueldoBruto(){
        return this.sueldoBruto;
    }

    public float getsueldoNeto(){
        return this.sueldoNeto;
    }
    public int getDni() {
        return dni;
    }
    public String getnombre(){
        return this.nombre;
    }

    public String getapellido(){
        return this.apellido;
    }
    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    public void setSueldoNeto(Float sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
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
    public String toString(){
        return this.sueldoBruto + " " + this.sueldoNeto +" " + this.dni +" " +this.nombre+" "+this.apellido+" ";

    }
}
