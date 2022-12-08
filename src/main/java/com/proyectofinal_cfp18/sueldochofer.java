package com.proyectofinal_cfp18;
// para el formato del JSON
public class sueldochofer {
    private int sueldoBruto;
    private int sueldoNeto;

    public sueldochofer(int newsueldoBruto, int newsueldoNeto){
        this.sueldoBruto = newsueldoBruto;
        this.sueldoNeto = newsueldoNeto;
    }

    public int getsueldoBruto(){
        return this.sueldoBruto;
    }

    public int getsueldoNeto(){
        return this.sueldoNeto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    public void setSueldoNeto(int sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public String toString(){
        return this.sueldoBruto + " " + this.sueldoNeto +" ";

    }
}
