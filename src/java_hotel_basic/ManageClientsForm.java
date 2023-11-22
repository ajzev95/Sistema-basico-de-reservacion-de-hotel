package java_hotel_basic;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageClientsForm extends javax.swing.JFrame {

    int xx, xy;
    CLIENT client = new CLIENT();

    public ManageClientsForm() {
        initComponents();
        client.fillClientJTable(jTable1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldFNAME = new javax.swing.JTextField();
        jTextFieldLNAME = new javax.swing.JTextField();
        jTextFieldPHONE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonAddClient = new javax.swing.JButton();
        jButtonEditClient = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButtonRemoveClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRACION DE CLIENTES");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 35));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Primer Nombre", "Segundo Nombre", "Celular", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 850, 180));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 40, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Primer Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Segundo Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("N° de Clular");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jTextFieldID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        jTextFieldFNAME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldFNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, -1));

        jTextFieldLNAME.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldLNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, -1));

        jTextFieldPHONE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldPHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jTextFieldEMAIL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldEMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 180, -1));

        jButton_Refresh_JTable_Data.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Refresh_JTable_Data.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Refresh_JTable_Data.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Refresh_JTable_Data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresco (1).png"))); // NOI18N
        jButton_Refresh_JTable_Data.setText("REFRESCAR");
        jButton_Refresh_JTable_Data.setBorder(null);
        jButton_Refresh_JTable_Data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_JTable_Data.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Refresh_JTable_Data.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_Refresh_JTable_Data.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_Refresh_JTable_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_JTable_DataActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Refresh_JTable_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 110, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-de-verificacion.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 30, 230, -1));

        jButtonAddClient.setBackground(new java.awt.Color(51, 102, 255));
        jButtonAddClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddClient.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        jButtonAddClient.setText("AGREGAR");
        jButtonAddClient.setBorder(null);
        jButtonAddClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAddClient.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonAddClient.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddClientActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 90));

        jButtonEditClient.setBackground(new java.awt.Color(255, 102, 0));
        jButtonEditClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditClient.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-codigo.png"))); // NOI18N
        jButtonEditClient.setText("EDITAR");
        jButtonEditClient.setBorder(null);
        jButtonEditClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditClient.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonEditClient.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonEditClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditClientActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, 90));

        jButtonClearFields.setBackground(new java.awt.Color(255, 102, 51));
        jButtonClearFields.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonClearFields.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClearFields.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        jButtonClearFields.setText("LIMPIAR");
        jButtonClearFields.setBorder(null);
        jButtonClearFields.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClearFields.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClearFields.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonClearFields.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldsActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClearFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 110, 90));

        jButtonRemoveClient.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRemoveClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemoveClient.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButtonRemoveClient.setText("ELIMINAR");
        jButtonRemoveClient.setBorder(null);
        jButtonRemoveClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoveClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRemoveClient.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonRemoveClient.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonRemoveClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveClientActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoveClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 110, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManageClientsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClientActionPerformed
        // TODO add your handling code here:
        String fname = jTextFieldFNAME.getText();
        String lname = jTextFieldLNAME.getText();
        String phone = jTextFieldPHONE.getText();
        String email = jTextFieldEMAIL.getText();

        if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Llene esos campos porfavor->(Primer/Segundo nombre + n° celular)", "Campos vacios", JOptionPane.WARNING_MESSAGE);
        } else {
            if (client.addclient(fname, lname, phone, email)) {
                JOptionPane.showMessageDialog(rootPane, "Nuevo Cliente agregado", "Agregado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cliente no se agregado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButtonAddClientActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rIndex = jTable1.getSelectedRow();
        jTextFieldID.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldFNAME.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldLNAME.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldPHONE.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldEMAIL.setText(model.getValueAt(rIndex, 4).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditClientActionPerformed
        // TODO add your handling code here: (get)
        int id = 0;
        String fname = jTextFieldFNAME.getText();
        String lname = jTextFieldLNAME.getText();
        String phone = jTextFieldPHONE.getText();
        String email = jTextFieldEMAIL.getText();

        if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Llene esos campos porfavor->(Primer/Segundo nombre + n° celular)", "Campos vacios", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                id = Integer.valueOf(jTextFieldID.getText());

                if (client.editClient(id, fname, lname, phone, email)) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente  se edito", "Editado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cliente no se edito", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese el ID del cliente(numero)", "Cliente ID Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonEditClientActionPerformed

    private void jButtonRemoveClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveClientActionPerformed
        // TODO add your handling code here:
        try {
                int id = Integer.valueOf(jTextFieldID.getText());

                if (client.removeClient(id)) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente  se elimino", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cliente no se elimino", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese el ID del cliente(numero)", "Cliente ID Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonRemoveClientActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID","Primer Nombre","Segundo Nombre","Celular","Correo"}));
        client.fillClientJTable(jTable1);         
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    public void limpiar() {
        jTextFieldID.setText("");
        jTextFieldFNAME.setText("");
        jTextFieldLNAME.setText("");
        jTextFieldPHONE.setText("");
        jTextFieldEMAIL.setText("");
    }

    public static void main(String args[]) {
        try {
            FlatArcDarkOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClientsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddClient;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditClient;
    private javax.swing.JButton jButtonRemoveClient;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldFNAME;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLNAME;
    private javax.swing.JTextField jTextFieldPHONE;
    // End of variables declaration//GEN-END:variables
}
