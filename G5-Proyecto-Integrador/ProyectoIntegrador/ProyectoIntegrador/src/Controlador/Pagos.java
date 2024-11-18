/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author unise
 */
public class Pagos {
    
    public void generarPago(int idVenta, int cedulaCliente, int cedulaAsesor, double valorPago ){
        
        
        String sql = "INSERT INTO CONSTRUCTORA.PAGO (ID_VENTA, CEDULA_CLIENTE, CEDULA_ASESOR, VALORPAGO, FECHAPAGO) VALUES (?, ?, ?, ?, ?)";

    // Usar try-with-resources para manejar la conexión y el PreparedStatement
    try (Connection cn = new ConexionBD().conectarAsesor();
         PreparedStatement psPago = cn.prepareStatement(sql)) {

        // Obtener la fecha actual del sistema
        java.sql.Date fechaPago = new java.sql.Date(System.currentTimeMillis());

        // Establecer los parámetros de manera segura
        psPago.setInt(1, idVenta);
        psPago.setInt(2, cedulaCliente);
        psPago.setInt(3, cedulaAsesor);
        psPago.setDouble(4, valorPago);
        psPago.setDate(5, fechaPago);

        // Ejecutar la consulta
        int filasAfectadas = psPago.executeUpdate();

        // Comprobar si el registro fue exitoso
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Pago agregado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el pago.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al agregar el pago: " + e.getMessage());
    }
        
    }
        
        
    }
    

