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
public class Apartamento {
    
    
    public void agregarApartamento(int idTorre, int numeroApartamento, double valorApartamento, String tipoUnidad, double area, String matricula){
        
        String sql = "INSERT INTO APARTAMENTO (ID_TORRE, NUMERO_APARTAMENTO, VALOR_APARTAMENTO, TIPO_UNIDAD, AREA, MATRICULA) VALUES (?, ?, ?, ?, ?, ?)";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psApartamento = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psApartamento.setInt(1, idTorre);
            psApartamento.setInt(2, numeroApartamento);
            psApartamento.setDouble(3, valorApartamento);
            psApartamento.setString(4, tipoUnidad);
            psApartamento.setDouble(5, area);
            psApartamento.setString(6, matricula);
            
            int filasAfectadas = psApartamento.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Apartamento agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el Apartamento.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el Apartamento: " + e.getMessage());
        }
        
    }
    
    
    
    public void editarApartamento(int idTorre, int numeroApartamento, double valorApartamento, String tipoUnidad, double area, String matricula, int idApartamento){
        
        String sql = "UPDATE APARTAMENTO SET ID_TORRE = ?, NUMERO_APARTAMENTO = ?, VALOR_APARTAMENTO = ?, TIPO_UNIDAD = ?, AREA = ?, MATRICULA = ? WHERE ID_APARTAMENTO = ? ";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psApartamento = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psApartamento.setInt(1, idTorre);
            psApartamento.setInt(2, numeroApartamento);
            psApartamento.setDouble(3, valorApartamento);
            psApartamento.setString(4, tipoUnidad);
            psApartamento.setDouble(5, area);
            psApartamento.setString(6, matricula);
            psApartamento.setInt(7, idApartamento);
            
            int filasAfectadas = psApartamento.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Apartamento editado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo editar el Apartamento.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el Apartamento: " + e.getMessage());
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
            JOptionPane.showMessageDialog(null, "Error al ver los Apartamentos: " + e.getMessage());
        }
        return datos;
    }
    
    
    public void eliminarApartamento(int idApartamento){
        
        String sql = "DELETE FROM APARTAMENTO WHERE ID_APARTAMENTO = ? ";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psProyecto = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psProyecto.setInt(1, idApartamento);
            
            
            int filasAfectadas = psProyecto.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Apartamento eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el Apartamento.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el Apartamento: " + e.getMessage());
        }
        
    }
    
    public void agregarVendedor(String vendedor, int idApartamento){
        
        String sql = "UPDATE APARTAMENTO SET VENDEDOR = ? WHERE ID_APARTAMENTO = ? ";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarConstructora();
             PreparedStatement psApartamento = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psApartamento.setString(1, vendedor);
            psApartamento.setInt(2, idApartamento);
            
            
            int filasAfectadas = psApartamento.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Apartamento editado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo editar el Apartamento.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el Apartamento: " + e.getMessage());
        }
        
    }
    
}
