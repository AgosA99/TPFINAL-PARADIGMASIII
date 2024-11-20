/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.controladores.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sebas
 */
public class Conexion {
    
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/TPFINAL";
    
    public static Connection conn = null;
    public static ResultSet rs =null;
    public static Statement st =null;
    
  
    public static Connection conectarDB() throws SQLException, ClassNotFoundException{
        
      Dotenv dotenv = Dotenv.configure().load();  // Cargar las variables de entorno
      
      if (conn == null) {
         try {
            //Set Values from  .env configuration file
            String POSTGRES_USER = dotenv.get("POSTGRES_USER");
            String POSTGRES_PASSWORD = dotenv.get("POSTGRES_PASSWORD");
            
            // Set Driver to Database
            Class.forName(JDBC_DRIVER);
             //STEP 3: Open a connection
            System.out.println("Intentando conectar a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, POSTGRES_USER, POSTGRES_PASSWORD);
            System.out.println("Conexión establecida correctamente!");
            
            String query = "SELECT * FROM empleados";
            
         } catch (SQLException ex) {
            System.out.println("Fallo al intentar establecer la conexión con la base de datos.");
            ex.printStackTrace();  // Imprimir el stacktrace para entender el error
         } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver JDBC.");
            throw new ClassNotFoundException(ex.getMessage());
         } catch (Exception e) {
            System.out.println("Error inesperado.");
            e.printStackTrace();
         }
         
          // Verificar si la conexión se estableció
        if (conn == null) {
            System.out.println("La conexión es nula. Verifica las credenciales y la URL.");
        }
        
      }
      return conn;
   }
   
   public static void cerrar() throws SQLException {
      if (conn != null) {
         conn.close();
         System.out.println("Conexión cerrada.");
      }
   }

}   

