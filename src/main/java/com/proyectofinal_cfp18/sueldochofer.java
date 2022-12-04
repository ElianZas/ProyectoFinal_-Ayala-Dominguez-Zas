package com.proyectofinal_cfp18;
// para el formato del JSON
public class sueldochofer {

    private int sueldoBruto;
    private int sueldoNeto;
    private String nombre;
    private String apellido;

    public sueldochofer(int newsueldoBruto, int newsueldoNeto, String newnombre, String newapellido){
        this.sueldoBruto = newsueldoBruto;
        this.sueldoNeto = newsueldoNeto;
        this.nombre = newnombre;
        this.apellido = newapellido;
    }

    public int getsueldoBruto(){
        return sueldoBruto;
    }

    public int getsueldoNeto(){
        return sueldoNeto;
    }

    public String getnombre(){
        return nombre;
    }

    public String getapellido(){
        return apellido;
    }

    public String toString(){
        return this.sueldoBruto + " " + this.sueldoNeto +" " +this.nombre+" "+this.apellido+" ";

    }
}
