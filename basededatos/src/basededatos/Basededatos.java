/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
    

public class Basededatos {

    public static void main(String[] args) {
        System.out.println("GESTION DE LA BASE DE DATOS CON SQLITE");
        //String url="jdbc:sqlite:bd/userdb.db";
        
        String url = "jdbc:sqlite:userdb.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexión establecida a SQLite.");
                
                // Crear tabla
                String sqlCrear = "CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY, nombre TEXT, email TEXT)";
                Statement stmt = conn.createStatement();
                stmt.execute(sqlCrear);

                // Insertar datos
                //String sqlInsertar = "INSERT INTO usuarios(nombre, email) VALUES('Juan', 'juan@mail.com')";
                //stmt.execute(sqlInsertar);
                String sqlInsertar2 = "INSERT INTO usuarios(nombre, email) VALUES('Maria', 'juan@khdhh.com')";
                stmt.execute(sqlInsertar2);
                String sqlInsertar3 = "INSERT INTO usuarios(nombre, email) VALUES('Pedro', 'juan@dijd.com')";
                stmt.execute(sqlInsertar3);
                
                // Consultar datos
                String sqlSelect = "SELECT * FROM usuarios";
                ResultSet rs;
                rs = stmt.executeQuery(sqlSelect);

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("email"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con SQLite: " + e.getMessage());
        }
        

        System.out.println("--- FIN DEL PROGRAMA ---");
    
    }
    
}
