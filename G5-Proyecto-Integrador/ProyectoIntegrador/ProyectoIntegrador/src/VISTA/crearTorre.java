/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;

import Controlador.Torre;

/**
 *
 * @author unise
 */
public class crearTorre extends javax.swing.JFrame {

    /**
     * Creates new form crearTorre
     */
    public crearTorre() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroApartamentos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdProyecto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroDeLaTorre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Registrar Torre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Numero de Apartamentos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        txtNumeroApartamentos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtNumeroApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Id del Proyecto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        txtIdProyecto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtIdProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 210, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Numero de la Torre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        txtNumeroDeLaTorre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtNumeroDeLaTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 210, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        jButton6.setText("Volver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diseño sin título (14).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1030, 750));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int idProyecto, numeroDeLaTorre, numeroDeApartamento;
        idProyecto = Integer.parseInt(txtIdProyecto.getText());
        numeroDeLaTorre = Integer.parseInt(txtNumeroDeLaTorre.getText());
        numeroDeApartamento = Integer.parseInt(txtNumeroApartamentos.getText());
        
        Torre torre = new Torre();
        torre.agregarTorre(idProyecto, numeroDeLaTorre, numeroDeApartamento);
        
        this.setVisible(false);
        gestionTorre gTr = new gestionTorre();
        gTr.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        gestionTorre gTr = new gestionTorre();
        gTr.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crearTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearTorre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearTorre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtIdProyecto;
    private javax.swing.JTextField txtNumeroApartamentos;
    private javax.swing.JTextField txtNumeroDeLaTorre;
    // End of variables declaration//GEN-END:variables
}
