package com.proyectofinal_cfp18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class choferDTO {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

        public void saveChofer(String nombre, String apellido,long dni, int antigüedad, long sueldoBase){

            try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
                Statement stmt = con.createStatement()){
                String query = " INSERT INTO proyectofinal_cfp18.chofer(nombre, apellido, dni, antigüedad, sueldoBase) VALUES ('" + nombre + "','" + apellido + "','" + dni + "','" + antigüedad + "','" + sueldoBase + "');";
                stmt.executeUpdate(query); //crear base de Datos
                System.out.println("Persistio en base de datos.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        /**/
        public ArrayList<chofer> getChofers(){
        choferMapping choferMapping = new choferMapping();
        ArrayList<chofer> chofers= new ArrayList<chofer>();
        Map<Integer,chofer> choferMap = new HashMap<Integer,chofer>();
        
            try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
            Statement stmt = con.createStatement()){
                String query = "select * from proyectofinal_cfp18.chofer e;";
                ResultSet result = stmt.executeQuery(query);
                while(result.next()){ 
                    String nombreBD = result.getString("nombre"); //formato nombre
                    String apellidoBD = result.getString("apellido"); //formato apellido
                    Integer dniDB = result.getInt("dni");
                    Integer antiguedadDB = result.getInt("antiguedad");
                    Integer sueldoBaseDB = result.getInt("sueldoBase");
                   chofers.add(choferMapping.mapChofer(nombreBD, apellidoBD, dniDB,antiguedadDB, sueldoBaseDB));
                    //choferMap.put(id_chofer, choferMapping.mapChofer(nombreBD, apellidoBD, dniDB, antiguedadDB,sueldoBaseDB));    
                }
                System.out.println(choferMap.get(0) );
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return chofers;
        }

}