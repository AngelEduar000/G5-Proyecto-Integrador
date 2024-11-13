/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;
import java.sql.PreparedStatement;
import Controlador.ConexionBD;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author unise
 */
public class inicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    ConexionBD con = new ConexionBD();
    Connection cn = con.conectarLogin();
    
    
    public inicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setSize(new java.awt.Dimension(800, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Construcciones Urbanas C.A.S.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\unise\\Downloads\\Diseño-sin-título-(15)-Photoroom.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 250, -1));

        txtPass.setBackground(new java.awt.Color(204, 204, 255));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diseño sin título (14).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1040, 790));

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String usuario = txtUsuario.getText();
        String password = txtPass.getText();

        if (!usuario.equals("") && !password.equals("")) {
            try {
                // Preparar la consulta para verificar si el usuario es asesor
                String sqlAsesor = "SELECT * FROM CONSTRUCTORA.USUARIO_ASESOR WHERE CEDULA = ? AND CONTRASENA = ?";
                try (PreparedStatement psAsesor = cn.prepareStatement(sqlAsesor)) {
                    psAsesor.setString(1, usuario);
                    psAsesor.setString(2, password);
                    try (ResultSet rsAsesor = psAsesor.executeQuery()) {
                        if (rsAsesor.next()) {
                            // Si se encuentra un registro en la tabla asesor, redirigir a la vista asesor
                            this.setVisible(false); // Cerrar la ventana de inicio de sesión
                            vistaAsesor vas = new vistaAsesor(); // Abrir la vista del asesor
                            vas.setVisible(true);
                            return; // Salir del método para evitar la verificación adicional
                        }
                    }
                }

                // Verificar si es administrador
                String sqlAdmin = "SELECT * FROM CONSTRUCTORA.USUARIO_ADMINISTRADOR WHERE CEDULA = ? AND CONTRASENA = ?";
                try (PreparedStatement psAdmin = cn.prepareStatement(sqlAdmin)) {
                    psAdmin.setString(1, usuario);
                    psAdmin.setString(2, password);
                    try (ResultSet rsAdmin = psAdmin.executeQuery()) {
                        if (rsAdmin.next()) {
                            // Si se encuentra un registro en la tabla administrador, redirigir a la vista administrador
                            this.setVisible(false); // Cerrar la ventana de inicio de sesión
                            vistaAdministrador vad = new vistaAdministrador(); // Abrir la vista del administrador
                            vad.setVisible(true);
                            return; // Salir del método para evitar el mensaje de error
                        }
                    }
                }

                // Si no se encontró en ninguna tabla
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Error al iniciar sesión! " + e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe completar los datos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
