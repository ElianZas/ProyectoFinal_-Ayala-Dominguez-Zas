package com.proyectofinal_cfp18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class demobase {
    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";
    public static void main( String[] args ){
        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            // String query = "CREATE DATABASE proyectofinal;";
            // stmt.executeUpdate(query);
            String query2 = "CREATE TABLE proyectofinal.choferes (id_chofer int AUTO_INCREMENT PRIMARY KEY  NOT NULL, dni__chofer bigint(9) NOT NULL ,nombre varchar(32) NOT NULL,apellido varchar(32) NOT NULL , sueldo__base bigint(10)NOT NULL, sueldo__bruto bigint(20) , sueldo__neto bigint(20));";
            stmt.executeUpdate(query2);
            // String query2 = "INSERT INTO proyectofinal.choferes (dni__chofer,nombre,apellido, sueldo__bruto, sueldo__neto) VALUES ('" + dni__chofer + "','" + nombre + "','" + apellido + "','" + sueldo__bruto + ","+ sueldo__neto "');";
            // stmt.executeUpdate(query2);
            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
