package agenda;

import java.awt.Image;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class VentanaAgenda2 extends javax.swing.JFrame {

    //BASE DE DATOS
    List<Persona2> personas_al;

    ConexionMysql1 cm = new ConexionMysql1("PROYECTO25");
    Connection conexion = cm.getConexion();

    public VentanaAgenda2() {
        initComponents();
        personalizarVentana();
        cargarBaseDatos();
        pintarCajitas(0);

    }

    public List<Persona2> obtenerTodosLosRegistros() {
        List<Persona2> personas_al = new ArrayList<>();
        String sql = "SELECT * FROM Persona";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String nacimiento = rs.getString("nacimiento");
                Persona2 persona = new Persona2(dni, nombre, apellidos, direccion, telefono, nacimiento);
                personas_al.add(persona);
            }
        } catch (SQLException e) {
            personas_al = null;
        }
        return personas_al;
    }

    public void cargarBaseDatos() {
        personas_al = obtenerTodosLosRegistros();
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    public void pintarCajitas(int indice) {
        // Verificar que el índice está dentro del rango permitido
        if (indice >= 0 && indice < personas_al.size()) {
            Persona2 persona = personas_al.get(indice);
            // Realizar operaciones con el objeto persona
        } else {
            System.out.println("Índice fuera de los límites: " + indice);
        }
        Persona2 persona = personas_al.get(indice);
        txtDNI.setText(persona.getDni());
        txtNOMBRE.setText(persona.getNombre());
        txtPATERNO.setText(persona.getPaterno());
        txtDIRECCION.setText(persona.getDireccion());
        txtTELEFONO.setText(persona.getTelefono());
        txtNACIMIENTO.setText(persona.getNacimiento());
        ;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        lblDNI = new javax.swing.JLabel();
        lblNOMBRE = new javax.swing.JLabel();
        lblPATERNO = new javax.swing.JLabel();
        lblDIRECCION = new javax.swing.JLabel();
        lblTELEFONO = new javax.swing.JLabel();
        lblNACIMIENTO = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNOMBRE = new javax.swing.JTextField();
        txtPATERNO = new javax.swing.JTextField();
        txtDIRECCION = new javax.swing.JTextField();
        txtTELEFONO = new javax.swing.JTextField();
        txtNACIMIENTO = new javax.swing.JTextField();
        cmdALANTE = new javax.swing.JButton();
        cmdATRAS = new javax.swing.JButton();
        cmdGUARDAR = new javax.swing.JButton();
        cmdINICIO = new javax.swing.JButton();
        cmdFIN = new javax.swing.JButton();
        txtINDICE1 = new javax.swing.JTextField();
        cmdNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 390));
        setSize(new java.awt.Dimension(760, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AGENDA ELECTRÓNICA");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 761, 33));
        getContentPane().add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 761, 10));
        getContentPane().add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 222, 761, 10));

        lblDNI.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblDNI.setText("DNI:");
        getContentPane().add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 95, -1));

        lblNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblNOMBRE.setText("NOMBRE:");
        getContentPane().add(lblNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 95, -1));

        lblPATERNO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblPATERNO.setText("PATERNO:");
        getContentPane().add(lblPATERNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 95, -1));

        lblDIRECCION.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblDIRECCION.setText("DIRECCIÓN:");
        getContentPane().add(lblDIRECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 95, -1));

        lblTELEFONO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblTELEFONO.setText("TELEFONO:");
        getContentPane().add(lblTELEFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 95, -1));

        lblNACIMIENTO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblNACIMIENTO.setText("NACIMIENTO");
        getContentPane().add(lblNACIMIENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 95, -1));

        txtDNI.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 51, 255));
        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        txtNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNOMBRE.setForeground(new java.awt.Color(0, 51, 255));
        txtNOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 80, -1));

        txtPATERNO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtPATERNO.setForeground(new java.awt.Color(0, 51, 255));
        txtPATERNO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPATERNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 90, -1));

        txtDIRECCION.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDIRECCION.setForeground(new java.awt.Color(0, 51, 255));
        txtDIRECCION.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDIRECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 150, -1));

        txtTELEFONO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtTELEFONO.setForeground(new java.awt.Color(0, 51, 255));
        txtTELEFONO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTELEFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 90, -1));

        txtNACIMIENTO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNACIMIENTO.setForeground(new java.awt.Color(0, 51, 255));
        txtNACIMIENTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNACIMIENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 95, -1));

        cmdALANTE.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdALANTE.setText(">>");
        cmdALANTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdALANTEActionPerformed(evt);
            }
        });
        getContentPane().add(cmdALANTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 250, -1, -1));

        cmdATRAS.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdATRAS.setText("<<");
        cmdATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdATRASActionPerformed(evt);
            }
        });
        getContentPane().add(cmdATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 250, -1, -1));

        cmdGUARDAR.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdGUARDAR.setText("GUARDAR");
        cmdGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGUARDARActionPerformed(evt);
            }
        });
        getContentPane().add(cmdGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        cmdINICIO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdINICIO.setText("INICIO");
        cmdINICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdINICIOActionPerformed(evt);
            }
        });
        getContentPane().add(cmdINICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 252, -1, -1));

        cmdFIN.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdFIN.setText("FIN");
        cmdFIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFINActionPerformed(evt);
            }
        });
        getContentPane().add(cmdFIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 252, -1, -1));

        txtINDICE1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtINDICE1.setForeground(new java.awt.Color(255, 0, 51));
        txtINDICE1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtINDICE1.setText("0");
        txtINDICE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtINDICE1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtINDICE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 90, -1));

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void cmdALANTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdALANTEActionPerformed
        String indices = txtINDICE1.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei < personas_al.size() - 1) {
            indicei++;
            txtINDICE1.setText(indicei + "");
            pintarCajitas(indicei);

        }
    }//GEN-LAST:event_cmdALANTEActionPerformed

    private void cmdATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdATRASActionPerformed
        String indices = txtINDICE1.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei > 0) {
            indicei--;
            txtINDICE1.setText(indicei + "");
            pintarCajitas(indicei);
        }
    }//GEN-LAST:event_cmdATRASActionPerformed

    private void txtINDICE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtINDICE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtINDICE1ActionPerformed

    private void cmdGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGUARDARActionPerformed
     // Recoger datos del formulario
    String dni = txtDNI.getText();
    String nombre = txtNOMBRE.getText();
    String paterno = txtPATERNO.getText();
    String direccion = txtDIRECCION.getText();
    String telefono = txtTELEFONO.getText();
    String nacimiento = txtNACIMIENTO.getText();

    // Crear un objeto Persona con los datos recogidos
    Persona2 persona = new Persona2(dni, nombre, paterno, direccion, telefono, nacimiento);

    // Crear una instancia de MetodoCrud
    MetodoCrud mc = new MetodoCrud(conexion);

    // Insertar la nueva persona en la base de datos
    boolean insercionCorrecta = mc.insertarPersona(persona);

    // Comprobar si la inserción fue correcta y mostrar un mensaje
    if (insercionCorrecta) {
        System.out.println("Alumno insertado correctamente.");
        // Añadir la persona a la lista local si la inserción fue correcta
        personas_al.add(persona);
        // Vaciar las cajas de texto
        txtDNI.setText("");
        txtNOMBRE.setText("");
        txtPATERNO.setText("");
        txtDIRECCION.setText("");
        txtTELEFONO.setText("");
        txtNACIMIENTO.setText("");
        
        // Actualizar la vista con el nuevo índice
        int nuevoIndice = personas_al.size() - 1; // Último índice de la lista
        txtINDICE1.setText(String.valueOf(nuevoIndice + 1)); // Actualizar índice para mostrar al usuario
        System.out.println(nuevoIndice);
        // Verificar que el nuevo índice esté dentro del rango adecuado antes de llamar a pintarCajitas
        if (nuevoIndice >= 0 && nuevoIndice < personas_al.size()) {
            pintarCajitas(nuevoIndice);
        } else {
            System.out.println("Nuevo índice fuera de los límites: " + nuevoIndice);
        }
    } else {
        System.out.println("Hubo un error al insertar el alumno.");
    }
    }//GEN-LAST:event_cmdGUARDARActionPerformed

    private void cmdFINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFINActionPerformed
        txtINDICE1.setText((personas_al.size() - 1) + "");
        pintarCajitas(personas_al.size() - 1);
    }//GEN-LAST:event_cmdFINActionPerformed

    private void cmdINICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdINICIOActionPerformed
        txtINDICE1.setText("0");
        pintarCajitas(0);

    }//GEN-LAST:event_cmdINICIOActionPerformed
    
    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        // Vaciar las cajas de texto
        txtDNI.setText("");
        txtNOMBRE.setText("");
        txtPATERNO.setText("");
        txtDIRECCION.setText("");
        txtTELEFONO.setText("");
        txtNACIMIENTO.setText("");
        int nuevoIndice = personas_al.size(); // Use the current size directly
        txtINDICE1.setText((nuevoIndice) + "");

        // Verificar que el nuevo índice esté dentro del rango adecuado antes de llamar a pintarCajitas
        if (nuevoIndice >= 0 && nuevoIndice < personas_al.size()) {
            pintarCajitas(nuevoIndice);
        } else {
            System.out.println("Nuevo índice: " + nuevoIndice);
        }


    }//GEN-LAST:event_cmdNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgenda2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdALANTE;
    private javax.swing.JButton cmdATRAS;
    private javax.swing.JButton cmdFIN;
    private javax.swing.JButton cmdGUARDAR;
    private javax.swing.JButton cmdINICIO;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JLabel lblDIRECCION;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNACIMIENTO;
    private javax.swing.JLabel lblNOMBRE;
    private javax.swing.JLabel lblPATERNO;
    private javax.swing.JLabel lblTELEFONO;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTextField txtDIRECCION;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtINDICE1;
    private javax.swing.JTextField txtNACIMIENTO;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtPATERNO;
    private javax.swing.JTextField txtTELEFONO;
    // End of variables declaration//GEN-END:variables
}
