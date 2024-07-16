
package swing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaEscribir extends javax.swing.JFrame {

    String[] cabecera = {"N1","N2","N3","N4"};
    String[][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo,cabecera);
    
    public VentanaEscribir() {
        initComponents();
        personalizarTable();
    }
    
    public void personalizarTable(){
        tblEscribir.setModel(dtm);
    }
    
    public void escribirArchivoCsv(String n1, String n2,String n3,String n4){
        //ESCRITURA DE UN ARCHIVO TEXTO
        File f;//CONVERTIR EL ARCHIVO FISICO
        FileWriter fw;//ABRIR UNA CANALETA DE COMUNICACIÓN(ORIGEN-DESTINO)
        BufferedWriter bw;//ESCRIBIR 
        String fila = "";
        
        try{
            f = new File("data/NOTAS.csv");
            fw = new FileWriter(f, true);//AÑADE
            bw = new BufferedWriter(fw);//escribir
            
            fila = n1 +";"+n2 +";"+n3 +";"+n4;
            bw.write(fila +"\r\n");   
            bw.flush();//GRABA EN DISCO(archivo)
        }catch(Exception e){
            System.out.println("ERROR: "+ e.getMessage());
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cmdGrabar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        panel1 = new javax.swing.JScrollPane();
        tblEscribir = new javax.swing.JTable();
        cmdInsertarFila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ESCRIBIR ARCHIVOS CSV");
        lblTitulo.setOpaque(true);

        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("LIMPIAR");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        tblEscribir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEscribir.setShowGrid(true);
        panel1.setViewportView(tblEscribir);

        cmdInsertarFila.setText("INSERTAR FILA");
        cmdInsertarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertarFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cmdGrabar)
                .addGap(30, 30, 30)
                .addComponent(cmdInsertarFila)
                .addGap(47, 47, 47)
                .addComponent(cmdLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdSalir)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGrabar)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdSalir)
                    .addComponent(cmdInsertarFila))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed
      //RECUPERAR LOS DATOS DEL TABLE
      int numeroFilas = dtm.getRowCount();
      String patron = "[0-9]{1,2}";
      for(int i=0; i<numeroFilas; i++){
          String n1 = String.valueOf(dtm.getValueAt(i,0));
          String n2 = String.valueOf(dtm.getValueAt(i,1));
          String n3 = String.valueOf(dtm.getValueAt(i,2));
          String n4 = String.valueOf(dtm.getValueAt(i,3));
          if(n1.matches(patron) &&
             n2.matches(patron) &&
             n3.matches(patron) &&
             n4.matches(patron) &&
             Integer.parseInt(n1) >= 0 && Integer.parseInt(n1) <=10 &&
             Integer.parseInt(n2) >= 0 && Integer.parseInt(n2) <=10 &&
             Integer.parseInt(n3) >= 0 && Integer.parseInt(n3) <=10 &&
             Integer.parseInt(n4) >= 0 && Integer.parseInt(n4) <=10){
             System.out.println(n1 + " " + n2 + " " + n3 + " "+ n4);
             escribirArchivoCsv(n1, n2, n3, n4);      
            }else{
              JOptionPane.showMessageDialog(null, "Error", "ENTRADA INCORRECTA", JOptionPane.ERROR_MESSAGE);
          }
              
          }
    }//GEN-LAST:event_cmdGrabarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        int numeroFilas = dtm.getRowCount();
        for(int i=0; i<numeroFilas; i++){
            dtm.removeRow(0);
        }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdInsertarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertarFilaActionPerformed
     String[] filasBlanco = {"","","",""};
     dtm.addRow(filasBlanco);
    }//GEN-LAST:event_cmdInsertarFilaActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEscribir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdGrabar;
    private javax.swing.JButton cmdInsertarFila;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane panel1;
    private javax.swing.JTable tblEscribir;
    // End of variables declaration//GEN-END:variables
}
