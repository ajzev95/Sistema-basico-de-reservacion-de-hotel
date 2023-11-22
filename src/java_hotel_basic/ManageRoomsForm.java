package java_hotel_basic;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageRoomsForm extends javax.swing.JFrame {

    int xx, xy;
    ROOMS rooms = new ROOMS();

    public ManageRoomsForm() {
        initComponents();
        rooms.fillRooms_TYPE_JCombox(jComboBoxType);
        rooms.fillRoomsJTable(jTable1);
        jTable1.setRowHeight(30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonYES);
        bg.add(jRadioButtonNO);
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
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jTextFieldPHONE = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonAddRoom = new javax.swing.JButton();
        jButtonEditRoom = new javax.swing.JButton();
        jButtonShowRoomTypes = new javax.swing.JButton();
        jButtonRemoveRoom = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonYES = new javax.swing.JRadioButton();
        jRadioButtonNO = new javax.swing.JRadioButton();

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
        jLabel1.setText("ADMINISTRACION DE HABITACIONES");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 35));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Tipo", "Celular", "Reservacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
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
        jLabel2.setText("Numero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tipo de habitacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Reservacion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jTextFieldNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, -1));

        jTextFieldPHONE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldPHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 120, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresco (1).png"))); // NOI18N
        jButton3.setText("REFRESCAR");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 110, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/habitaciones.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 30, 250, -1));

        jButtonAddRoom.setBackground(new java.awt.Color(51, 102, 255));
        jButtonAddRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        jButtonAddRoom.setText("AGREGAR");
        jButtonAddRoom.setBorder(null);
        jButtonAddRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAddRoom.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonAddRoom.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRoomActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 90));

        jButtonEditRoom.setBackground(new java.awt.Color(255, 102, 0));
        jButtonEditRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-codigo.png"))); // NOI18N
        jButtonEditRoom.setText("EDITAR");
        jButtonEditRoom.setBorder(null);
        jButtonEditRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditRoom.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonEditRoom.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonEditRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditRoomActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, 90));

        jButtonShowRoomTypes.setBackground(new java.awt.Color(255, 153, 51));
        jButtonShowRoomTypes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonShowRoomTypes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowRoomTypes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cama.png"))); // NOI18N
        jButtonShowRoomTypes.setText("HABITACIONES");
        jButtonShowRoomTypes.setBorder(null);
        jButtonShowRoomTypes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonShowRoomTypes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonShowRoomTypes.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonShowRoomTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowRoomTypesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonShowRoomTypes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 110, 90));

        jButtonRemoveRoom.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRemoveRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemoveRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButtonRemoveRoom.setText("ELIMINAR");
        jButtonRemoveRoom.setBorder(null);
        jButtonRemoveRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRemoveRoom.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonRemoveRoom.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonRemoveRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveRoomActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoveRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 110, 90));

        jComboBoxType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jComboBoxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("N° de Celular");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jRadioButtonYES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonYES.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButtonYES.setText("SI");
        jPanel1.add(jRadioButtonYES, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jRadioButtonNO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonNO.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButtonNO.setText("NO");
        jPanel1.add(jRadioButtonNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

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
                Logger.getLogger(ManageRoomsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRoomActionPerformed
        // TODO add your handling code here:
        try {
            int roomNumber = Integer.valueOf(jTextFieldNumber.getText());
            int roomType = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
            String phone = jTextFieldPHONE.getText();

            if (rooms.addRoom(roomNumber, roomType, phone)) {
                JOptionPane.showMessageDialog(rootPane, "Nueva Habitacion agregado", "Agregado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se pudo agregado la Habitacion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese el numero la Habitacion", "Numero de Habitacion Error", JOptionPane.ERROR_MESSAGE);
        }

        Limpiar();
    }//GEN-LAST:event_jButtonAddRoomActionPerformed

    private void jButtonEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditRoomActionPerformed
        // TODO add your handling code here:
        int roomNumber = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String phone = jTextFieldPHONE.getText();
        String isReserved = "NO";

        if (jRadioButtonYES.isSelected()) {
            isReserved = "YES";
        }

        if (phone.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese N° de la Habitacion y su N° de celular", "Campos vacios", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                roomNumber = Integer.valueOf(jTextFieldNumber.getText());

                if (rooms.editRoom(roomNumber, type, phone, isReserved)) {
                    JOptionPane.showMessageDialog(rootPane, "Habitacion se edito", "Editado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "La Habitacion no se edito", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese el numero de habitacion", "Numero de Habitacion-Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        Limpiar();
    }//GEN-LAST:event_jButtonEditRoomActionPerformed

    private void jButtonShowRoomTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowRoomTypesActionPerformed
        // TODO add your handling code here:
        ALL_ROOMS_TYPE_FORM roomType = new ALL_ROOMS_TYPE_FORM();
        roomType.setVisible(true);
        roomType.pack();
    }//GEN-LAST:event_jButtonShowRoomTypesActionPerformed

    private void jButtonRemoveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveRoomActionPerformed
        // TODO add your handling code here:
        try {
            int roomNumber = Integer.valueOf(jTextFieldNumber.getText());

            if (rooms.removeRoom(roomNumber)) {
                JOptionPane.showMessageDialog(rootPane, "La Habitacion se elimino", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La Habitacion no se elimino", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese el numero de la Habitacion", "Numero de la Habitacion-Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoveRoomActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Numero", "Tipo de Habitacion", "Celular", "Reservacion"}));
        rooms.fillRoomsJTable(jTable1);
        Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rIndex = jTable1.getSelectedRow();
        jTextFieldNumber.setText(model.getValueAt(rIndex, 0).toString());
        jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
        jTextFieldPHONE.setText(model.getValueAt(rIndex, 2).toString());

        String isReserved = model.getValueAt(rIndex, 3).toString();
        if (isReserved.equals("SI")) {
            jRadioButtonYES.setSelected(true);
        } else if (isReserved.equals("NO")) {
            jRadioButtonNO.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public void Limpiar() {
        jTextFieldNumber.setText("");
        jTextFieldPHONE.setText("");
        jComboBoxType.setSelectedIndex(0);
        jRadioButtonNO.setSelected(true);
    }

    public static void main(String args[]) {
        try {
            FlatArcDarkOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAddRoom;
    private javax.swing.JButton jButtonEditRoom;
    private javax.swing.JButton jButtonRemoveRoom;
    private javax.swing.JButton jButtonShowRoomTypes;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonYES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldPHONE;
    // End of variables declaration//GEN-END:variables
}
