package Controlador;
import java.sql.*;

public class ConexionBD {
    
    private Connection cn;

    // Método para conectar con el usuario constructora
    public Connection conectarConstructora(){
        try {
            cn=DriverManager.getConnection("jdbc:oracle:thin:CONSTRUCTORA/CONSTRUCTORA@192.168.254.215:1521:orcl"); 
            if(cn != null){
                DatabaseMetaData meta = cn.getMetaData();
                System.out.println("Conectado a la base de datos como usuario constructora: " + meta.getDriverName());
            }
        } catch (Exception e) {
            System.out.println("Error al conectar como constructora: " + e.getMessage());
        }
        return cn;
    }

    // Método para conectar con el usuario login
    public Connection conectarLogin(){
        try {
            cn = DriverManager.getConnection("jdbc:oracle:thin:LOGIN21/LOGIN@192.168.254.215:1521:orcl");
            if(cn != null){
                DatabaseMetaData meta = cn.getMetaData();
                System.out.println("Conectado a la base de datos como usuario login: " + meta.getDriverName());
            }
        } catch (Exception e) {
            System.out.println("Error al conectar como login: " + e.getMessage());
        }
        return cn;
    }
    
    public Connection conectarAsesor(){
        try {
            cn = DriverManager.getConnection("jdbc:oracle:thin:ASESOR21/ASESOR21@192.168.254.215:1521:orcl");
            if(cn != null){
                DatabaseMetaData meta = cn.getMetaData();
                System.out.println("Conectado a la base de datos como usuario asesor: " + meta.getDriverName());
            }
        } catch (Exception e) {
            System.out.println("Error al conectar como asesor: " + e.getMessage());
        }
        return cn;
    }
}