package java_hotel_basic;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageReservationsForm extends javax.swing.JFrame {

    int xx, xy;
    RESERVATION reservation = new RESERVATION();

    public ManageReservationsForm() {
        initComponents();
        reservation.fillReservationsJTable(jTable1);
        jTable1.setRowHeight(25);
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
        jTextFieldReservationID = new javax.swing.JTextField();
        jTextFieldClienteID = new javax.swing.JTextField();
        jTextFieldRoomNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonaAddReservation = new javax.swing.JButton();
        jButtonEditReservation = new javax.swing.JButton();
        jButtonRemoveReservation = new javax.swing.JButton();
        jDateChooserDateOUT = new com.toedter.calendar.JDateChooser();
        jDateChooserDateIN = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVACIONES");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 35));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Reservacion", "ID Cliente", "N° de Habitacion", "Fecha de Ingreso", "Fecha de Salida"
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
        jLabel3.setText("ID Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("N° de Habitacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha de Ingreso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jTextFieldReservationID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldReservationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        jTextFieldClienteID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldClienteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, -1));

        jTextFieldRoomNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de Salida");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reserva.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 23, 270, -1));

        jButtonaAddReservation.setBackground(new java.awt.Color(51, 102, 255));
        jButtonaAddReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonaAddReservation.setForeground(new java.awt.Color(255, 255, 255));
        jButtonaAddReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        jButtonaAddReservation.setText("AGREGAR");
        jButtonaAddReservation.setBorder(null);
        jButtonaAddReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonaAddReservation.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonaAddReservation.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonaAddReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaAddReservationActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonaAddReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 90));

        jButtonEditReservation.setBackground(new java.awt.Color(255, 102, 0));
        jButtonEditReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditReservation.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-codigo.png"))); // NOI18N
        jButtonEditReservation.setText("EDITAR");
        jButtonEditReservation.setBorder(null);
        jButtonEditReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditReservation.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonEditReservation.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonEditReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditReservationActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 90));

        jButtonRemoveReservation.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRemoveReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemoveReservation.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButtonRemoveReservation.setText("ELIMINAR");
        jButtonRemoveReservation.setBorder(null);
        jButtonRemoveReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRemoveReservation.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonRemoveReservation.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonRemoveReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveReservationActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoveReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 110, 90));

        jDateChooserDateOUT.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserDateOUT.setDateFormatString("dd/MM/yyyy");
        jDateChooserDateOUT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jDateChooserDateOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 180, 26));

        jDateChooserDateIN.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserDateIN.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooserDateIN.setDateFormatString("dd/MM/yyyy");
        jDateChooserDateIN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jDateChooserDateIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, 26));

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
                Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jButtonaAddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaAddReservationActionPerformed
        // TODO add your handling code here: minuto 35 del video 7
        try {
            int client_id = Integer.valueOf(jTextFieldClienteID.getText());
            int room_number = Integer.valueOf(jTextFieldRoomNumber.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = dateFormat.format(jDateChooserDateIN.getDate());
            String date_out = dateFormat.format(jDateChooserDateOUT.getDate());
            String toDayDate = dateFormat.format(new Date());

            Date din = dateFormat.parse(date_in);
            Date dout = dateFormat.parse(date_out);

            Date tdd = dateFormat.parse(toDayDate);

            if (!(din.after(tdd) || din.equals(tdd))) {
                JOptionPane.showMessageDialog(rootPane, "La fecha de ingreso debe ser igual al de hoy dia o un dia mas", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(dout.after(din) || dout.equals(din))) {
                JOptionPane.showMessageDialog(rootPane, "La fecha de salida debe ser despues de la fecha de ingreso", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (reservation.addReservation(client_id, room_number, date_in, date_out)) {
                    JOptionPane.showMessageDialog(rootPane, "Nueva Reservacion agregado", "Agregado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo Reservar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + "La Fecha no puede ser antes ni el mismo dia", "Error al llenar los campos", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        Limpiar();
    }//GEN-LAST:event_jButtonaAddReservationActionPerformed

    private void jButtonEditReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditReservationActionPerformed
        // TODO add your handling code here:
        try {
            int reservationId = Integer.valueOf(jTextFieldReservationID.getText());
            int roomNumber = Integer.valueOf(jTextFieldRoomNumber.getText());
            int clientId = Integer.valueOf(jTextFieldClienteID.getText());

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = dateFormat.format(jDateChooserDateIN.getDate());
            String date_out = dateFormat.format(jDateChooserDateOUT.getDate());

            String toDayDate = dateFormat.format(new Date());

            Date din = dateFormat.parse(date_in);
            Date dout = dateFormat.parse(date_out);

            Date tdd = dateFormat.parse(toDayDate);

            if (!(din.after(tdd) || din.equals(tdd))) {
                JOptionPane.showMessageDialog(rootPane, "La fecha de ingreso debe ser igual al de hoy dia o un dia mas", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(dout.after(din) || dout.equals(din))) {
                JOptionPane.showMessageDialog(rootPane, "La fecha de salida debe ser despues de la fecha de ingreso", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (reservation.editReservation(reservationId, clientId, roomNumber, date_in, date_out)) {
                    JOptionPane.showMessageDialog(rootPane, "La informacion de la Reservacion se edito", "Editado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "La informacion de la Reservacion no se edito", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese el numero de habitacion, Cliente y de la Reservacion", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese una fecha de ingreso y una de salida", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        Limpiar();
    }//GEN-LAST:event_jButtonEditReservationActionPerformed

    private void jButtonRemoveReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveReservationActionPerformed
        // TODO add your handling code here:
        try {
            int reservationId = Integer.valueOf(jTextFieldReservationID.getText());

            if (reservation.removeReservation(reservationId)) {
                JOptionPane.showMessageDialog(rootPane, "La Reservacion se elimino", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La Reservacion no se elimino", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + " - Ingrese el Id de la Reservacion", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Limpiar();
    }//GEN-LAST:event_jButtonRemoveReservationActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID Reservacion", "ID Cliente", "N° de Habitacion", "Fecha de Ingreso", "Fecha de Salida"}));
        reservation.fillReservationsJTable(jTable1);
        Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rIndex = jTable1.getSelectedRow();
        jTextFieldReservationID.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldClienteID.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldRoomNumber.setText(model.getValueAt(rIndex, 2).toString());

        try {
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 3).toString());
            jDateChooserDateIN.setDate(dateIn);

            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 4).toString());
            jDateChooserDateOUT.setDate(dateOut);
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public void Limpiar() {
        jTextFieldClienteID.setText("");
        jTextFieldReservationID.setText("");
        jTextFieldRoomNumber.setText("");
        jDateChooserDateIN.setDate(null);
        jDateChooserDateOUT.setDate(null);
    }

    public static void main(String args[]) {
        try {
            FlatArcDarkOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReservationsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEditReservation;
    private javax.swing.JButton jButtonRemoveReservation;
    private javax.swing.JButton jButtonaAddReservation;
    private com.toedter.calendar.JDateChooser jDateChooserDateIN;
    private com.toedter.calendar.JDateChooser jDateChooserDateOUT;
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
    private javax.swing.JTextField jTextFieldClienteID;
    private javax.swing.JTextField jTextFieldReservationID;
    private javax.swing.JTextField jTextFieldRoomNumber;
    // End of variables declaration//GEN-END:variables
}
