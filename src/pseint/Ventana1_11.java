/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pseint;

/**
 *
 * @author Jorge
 */
public class Ventana1_11 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1_11
     */
    public Ventana1_11() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAcres = new javax.swing.JLabel();
        txtAcres = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        txtHectarias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CONVIERTE ACRES EN HECTARIAS");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 761, 33));

        lblAcres.setText("INTRODUCE TU EXTENSION EN ACRES");
        getContentPane().add(lblAcres, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 51, 228, 36));
        getContentPane().add(txtAcres, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 51, 195, 36));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 93, 761, 10));

        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 58, -1, -1));
        getContentPane().add(txtHectarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 158, 193, 42));

        jLabel1.setText("CANTIDAD EN HECTARIAS SON:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 121, 220, 31));

        txtReiniciar.setText("REINICIAR");
        txtReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(txtReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        //declaracion de variables y entrada
        String acres1 = txtAcres.getText();
        double acres = Double.parseDouble(acres1);
        double hectarias;
        //PROCESO
        hectarias = acres * 4047/10000;
        //SALIDA
        txtHectarias.setText(hectarias+"");
        
        
        
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void txtReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReiniciarActionPerformed
       txtHectarias.setText("");
       txtAcres.setText("");
    }//GEN-LAST:event_txtReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1_11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAcres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAcres;
    private javax.swing.JTextField txtHectarias;
    private javax.swing.JButton txtReiniciar;
    // End of variables declaration//GEN-END:variables
}