/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author unise
 */
public class Torre {
    
    
    public void agregarTorre(int idProyecto, int numeroDeLaTorre, int numeroDeApartamento){
        
        String sql = "INSERT INTO TORRE (ID_PROYECTO, NUMEROTORRE, NUMEROAPARTAMENTOS) VALUES (?, ?, ?)";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psTorre = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psTorre.setInt(1, idProyecto);
            psTorre.setInt(2, numeroDeLaTorre);
            psTorre.setInt(3, numeroDeApartamento);
            
            int filasAfectadas = psTorre.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Torre agregada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la Torre.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la Torre: " + e.getMessage());
        }
        
    }
    
    
    
    public void editarTorre(int idProyecto, int numeroDeLaTorre, int numeroDeApartamento, int idTorre){
        
        String sql = "UPDATE TORRE SET ID_PROYECTO = ?, NUMEROTORRE = ?, NUMEROAPARTAMENTOS = ? WHERE ID_TORRE = ? ";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psTorre = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psTorre.setInt(1, idProyecto);
            psTorre.setInt(2, numeroDeLaTorre);
            psTorre.setInt(3, numeroDeApartamento);
            psTorre.setInt(4, idTorre);
            
            int filasAfectadas = psTorre.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Torre editada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo editar la Torre.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar la Torre: " + e.getMessage());
        }
        
    }
    
    public static ResultSet listarTabla(String consulta){
        
        Connection cn = new ConexionBD().conectarConstructora();
        Statement sql;
        ResultSet datos=null;
        
        try{
            sql=cn.createStatement();
            datos=sql.executeQuery(consulta);
                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al ver las Torres: " + e.getMessage());
        }
        return datos;
    }
    
    
    
    public void eliminarProyecto(int idTorre){
        
        String sql = "DELETE FROM TORRE WHERE ID_TORRE = ? ";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psProyecto = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psProyecto.setInt(1, idTorre);
            
            
            int filasAfectadas = psProyecto.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Torre eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la Torre.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Torre: " + e.getMessage());
        }
        
    }
    
}


