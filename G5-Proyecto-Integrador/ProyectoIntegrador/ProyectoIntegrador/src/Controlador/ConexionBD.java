/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.*;
import java.util.logging.*;


/**
 *
 * @author SAlA-9
 */
public class ConexionBD {
    
    //Definir unas variables de la conexion a la base de datos
   public Connection cn;
   
   public Connection conectar(){
   
       //SQLite
       // jdbc:oracle:thin:admin21/admin21@localhost
       //Base de datos con oracle
       //url:"jdbc:oracle:thin:@localhost:1521:proyectoIntegrador";
       try {
           cn=DriverManager.getConnection("jdbc:oracle:thin:CONSTRUCTORA/CONSTRUCTORA@localhost:1521");
           if(cn!=null){
               DatabaseMetaData meta = cn.getMetaData();
               System.out.println("Base de datos conectada " + meta.getDriverName());
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       return cn;
    }
}
//    public static void main(String[] args) throws SQLException {
//        System.out.println("Iniciando la conexion a la base de datos");
//        ConexionBD conexion = new ConexionBD();
//        conexion.conectar();
//   }
//}
