/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author unise
 */
public class Ventas {
    
    public void creaVenta(int idApartamento, int cedulaCliente, double precioTotalVenta, int numeroCuotas, double intereses) {
        
        String sql = "INSERT INTO CONSTRUCTORA.VENTA (ID_APARTAMENTO, CEDULA_CLIENTE, PRECIO_TOTAL_VENTA, NUMERO_CUOTAS, INTERESES) VALUES (?, ?, ?, ?, ?)";
        
        // Usar try-with-resources para cerrar la conexión automáticamente
        try (Connection cn = new ConexionBD().conectarAsesor();
             PreparedStatement psProyecto = cn.prepareStatement(sql)) {
             
            // Establecer parámetros de manera segura
            psProyecto.setInt(1, idApartamento);
            psProyecto.setInt(2, cedulaCliente);
            psProyecto.setDouble(3, precioTotalVenta);
            psProyecto.setInt(4, numeroCuotas);
            psProyecto.setDouble(5, intereses);
            
            int filasAfectadas = psProyecto.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "venta agregada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la venta.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la venta: " + e.getMessage());
        }
    }
    
}
