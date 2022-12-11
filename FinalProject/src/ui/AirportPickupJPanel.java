/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.EmployeeQueries;
import databaseconnection.RecreationQueries;
import databaseconnection.TravelQueries;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Employee;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AirportPickupJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirportPickupJPanel
     */
    public AirportPickupJPanel() {
        initComponents();
        populateDriverName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblGuestEmail = new javax.swing.JLabel();
        txtGuestEmail = new javax.swing.JTextField();
        lblPickupLocation = new javax.swing.JLabel();
        txtPickupLocation = new javax.swing.JTextField();
        lblPickupTime = new javax.swing.JLabel();
        txtPickupTime = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblDriverName = new javax.swing.JLabel();
        comboBoxDriver = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Schedule Airport Pickup");

        lblGuestEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblGuestEmail.setForeground(new java.awt.Color(51, 153, 255));
        lblGuestEmail.setText("Guest Email:");

        txtGuestEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtGuestEmail.setForeground(new java.awt.Color(51, 153, 255));
        txtGuestEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestEmailActionPerformed(evt);
            }
        });

        lblPickupLocation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPickupLocation.setForeground(new java.awt.Color(51, 153, 255));
        lblPickupLocation.setText("Pickup Location:");

        txtPickupLocation.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPickupLocation.setForeground(new java.awt.Color(51, 153, 255));

        lblPickupTime.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPickupTime.setForeground(new java.awt.Color(51, 153, 255));
        lblPickupTime.setText("Pickup Time:");

        txtPickupTime.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPickupTime.setForeground(new java.awt.Color(51, 153, 255));

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Book");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblDriverName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblDriverName.setForeground(new java.awt.Color(51, 153, 255));
        lblDriverName.setText("Driver Name:");

        comboBoxDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDriverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPickupLocation)
                                        .addComponent(txtPickupLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comboBoxDriver, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDriverName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPickupTime)
                                        .addComponent(txtPickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblPickupLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPickupLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLayeredPane1.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String guestEmail = txtGuestEmail.getText();
        String pickupLocation = txtPickupLocation.getText();
        String pickupTime = txtPickupTime.getText();
        String driverName = (String) comboBoxDriver.getSelectedItem();
        String ariport_pickup= "Schedule Airport Pickup";
        TravelQueries tq= new TravelQueries();
        tq.scheduleAirportPickup(guestEmail, pickupLocation, pickupTime, ariport_pickup, driverName);
        JOptionPane.showMessageDialog(this, "travel Updated Successfully ");
        
 
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtGuestEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestEmailActionPerformed

    private void comboBoxDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDriverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> comboBoxDriver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDriverName;
    private javax.swing.JLabel lblGuestEmail;
    private javax.swing.JLabel lblPickupLocation;
    private javax.swing.JLabel lblPickupTime;
    private javax.swing.JTextField txtGuestEmail;
    private javax.swing.JTextField txtPickupLocation;
    private javax.swing.JTextField txtPickupTime;
    // End of variables declaration//GEN-END:variables

    private void populateDriverName(){
    EmployeeQueries emp= new EmployeeQueries();
        try {
            for(String emp1: emp.getDriverName()){
                System.out.println(emp1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        comboBoxDriver.setModel(new DefaultComboBoxModel<String>(Employee.driverName.toArray(new String[0])));
        
    }
}
