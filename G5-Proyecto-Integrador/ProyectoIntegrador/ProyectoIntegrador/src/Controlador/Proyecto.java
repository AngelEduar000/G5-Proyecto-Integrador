package Controlador;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controlador.ConexionBD;

public class Proyecto {
    
    private String nombreProyecto;
    private int numeroTorres;
    
    public void agregarProyecto(String nombreProyecto, int numeroTorres) {
        
        ConexionBD con = new ConexionBD();
        Connection cn = con.conectar();
        this.nombreProyecto = nombreProyecto;
        this.numeroTorres = numeroTorres;

        String sql = "INSERT INTO PROYECTO (NOMBRE, NUMERO_TORRES) VALUES ('"+nombreProyecto+"', '"+numeroTorres+"')";
        
        try (PreparedStatement psProyecto = cn.prepareStatement(sql)) {
            // Preparar y ejecutar la consulta SQL
            //psProyecto.setString(1, nombreProyecto);
            //psProyecto.setInt(2, numeroTorres);
            
            int filasAfectadas = psProyecto.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Proyecto agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el proyecto.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el proyecto: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
