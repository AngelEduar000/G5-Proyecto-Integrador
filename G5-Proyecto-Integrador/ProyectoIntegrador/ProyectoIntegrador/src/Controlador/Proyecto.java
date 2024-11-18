package Controlador;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Proyecto {
    
    public void agregarProyecto(String nombreProyecto, int numeroTorres) {
        
        String sql = "INSERT INTO PROYECTO (NOMBRE, NUMERO_TORRES) VALUES (?, ?)";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psProyecto = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psProyecto.setString(1, nombreProyecto);
            psProyecto.setInt(2, numeroTorres);
            
            int filasAfectadas = psProyecto.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Proyecto agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el proyecto.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el proyecto: " + e.getMessage());
        }
    }
    
    
    public void editarProyecto(String nombreProyecto, int numeroTorres, int idProyecto){
        
        String sql = "UPDATE PROYECTO SET NOMBRE = ?, NUMERO_TORRES = ? WHERE ID_PROYECTO = ? ";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psProyecto = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psProyecto.setString(1, nombreProyecto);
            psProyecto.setInt(2, numeroTorres);
            psProyecto.setInt(3, idProyecto);
            
            int filasAfectadas = psProyecto.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Proyecto editado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo editar el proyecto.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el proyecto: " + e.getMessage());
        }
        
    }
    
    public static ResultSet listarTabla(String consulta){
        
        Connection cn = new ConexionBD().conectarConstructora();
        Statement sql;
        ResultSet datos=null;
        
        try{
            sql=cn.createStatement();
            datos=sql.executeQuery(consulta);
                    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al ver los Proyectos: " + e.getMessage());
        }
        return datos;
    }
    
    public void eliminarProyecto(int idProyecto){
        
        String sql = "DELETE FROM PROYECTO WHERE ID_PROYECTO = ? ";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psProyecto = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psProyecto.setInt(1, idProyecto);
            
            
            int filasAfectadas = psProyecto.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Proyecto eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el proyecto.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el proyecto: " + e.getMessage());
        }
        
    }
}

