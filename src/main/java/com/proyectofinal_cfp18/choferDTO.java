package com.proyectofinal_cfp18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class choferDTO {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root1";
    static final String Contrasena_BD = "root1";

        public void saveChofer(String nombre, String apellido,int dni, int antiguedad, int sueldoBase){

            try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
                Statement stmt = con.createStatement()){
                String query = " INSERT INTO proyectofinal_cfp18.chofer(nombre, apellido, dni, antiguedad, sueldoBase) VALUES ('" + nombre + "','" + apellido + "','" + dni + "','" + antiguedad + "','" + sueldoBase + "');";
                stmt.executeUpdate(query); //crear base de Datos
                System.out.println("Persistio en base de datos.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        /**/
        public ArrayList<chofer> getchofer(){
        choferMapping choferMapping = new choferMapping();
        ArrayList<chofer> chofer= new ArrayList<chofer>();
        
            try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
            Statement stmt = con.createStatement()){
                String query = "select * from proyectofinal_cfp18.chofer c;";
                ResultSet result = stmt.executeQuery(query);
                while(result.next()){ 
                    String nombreBD = result.getString("nombre"); //formato nombre
                    String apellidoBD = result.getString("apellido"); //formato apellido
                    Integer dniDB = result.getInt("dni");
                    Integer antiguedadDB = result.getInt("antiguedad");
                    Integer sueldoBaseDB = result.getInt ("sueldoBase");
                    chofer.add(choferMapping.mapChofer(nombreBD, apellidoBD, dniDB, antiguedadDB, sueldoBaseDB));    
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //System.out.println(chofer);
            return chofer;
        }

}