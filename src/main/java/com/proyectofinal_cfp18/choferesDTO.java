package com.proyectofinal_cfp18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class choferesDTO {
    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

    public void saveChofer(Long dni__chofer, String nombre, String apellido, Long sueldo__base){

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            String query2 = "INSERT INTO proyectofinal.choferes (dni__chofer,nombre,apellido, sueldo__base) VALUES ('" + dni__chofer + "','" + nombre + "','" + apellido + "," + sueldo__base+ "');";
            stmt.executeUpdate(query2);
            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<chofer> getChoferes(){
        choferMapping choferMapping = new choferMapping();
        ArrayList<chofer> choferes = new ArrayList<chofer>();
        
            try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
            Statement stmt = con.createStatement()){
                String query = "select * from proyectofinal.choferes;";
                ResultSet result = stmt.executeQuery(query);
                while(result.next()){ 
                    Long dni__choferBD = result.getLong("dni__chofer"); 
                    String nombreBD = result.getString("nombre"); 
                    String apellidoBD = result.getString("nombre"); 
                    Long sueldo__baseBD = result.getLong("sueldo__base"); 
                    choferes.add(choferMapping.mapChofer(dni__choferBD, nombreBD, apellidoBD, sueldo__baseBD));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return choferes;
        }
}

