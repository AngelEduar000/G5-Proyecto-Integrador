package Controlador;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}

