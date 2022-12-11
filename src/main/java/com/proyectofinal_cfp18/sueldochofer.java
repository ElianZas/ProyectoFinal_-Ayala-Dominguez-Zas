package com.proyectofinal_cfp18;
// para el formato del JSON
public class sueldochofer {
    private int sueldoBruto;
    private int sueldoNeto;
    private String apellido;
    private String nombre;

    public sueldochofer(int newsueldoBruto, int newsueldoNeto, String newapellido, String newnombre){
        this.sueldoBruto = newsueldoBruto;
        this.sueldoNeto = newsueldoNeto;
        this.apellido = newapellido;
        this.nombre = newnombre;
    }

    public int getsueldoBruto(){
        return this.sueldoBruto;
    }

    public int getsueldoNeto(){
        return this.sueldoNeto;
    }

    public String getapellido(){
        return this.apellido;
    }

    public String getnombre(){
        return this.nombre;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    public void setSueldoNeto(int sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return this.sueldoBruto + " " + this.sueldoNeto + " " + this.apellido + " " + this.nombre + " ";

    }
}
