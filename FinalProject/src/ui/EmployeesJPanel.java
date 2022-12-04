/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class EmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public EmployeesJPanel() {
        initComponents();        
    }
    public void switchPanels(JPanel panel){
            layeredPane.removeAll();
            layeredPane.add(panel);
            layeredPane.repaint();
            layeredPane.revalidate();
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        btnAddEmployees = new javax.swing.JButton();
        btnAddRooms = new javax.swing.JButton();
        btnManageGuests = new javax.swing.JButton();
        btnManageEmployees = new javax.swing.JButton();
        btnManageRecreation = new javax.swing.JButton();
        btnAddRecreation = new javax.swing.JButton();
        btnManageRooms = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        layeredPane.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAddEmployees.setBackground(new java.awt.Color(255, 102, 51));
        btnAddEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployees.setText("Add Employees");
        btnAddEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeesActionPerformed(evt);
            }
        });

        btnAddRooms.setBackground(new java.awt.Color(255, 102, 51));
        btnAddRooms.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddRooms.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRooms.setText("Add Rooms");

        btnManageGuests.setBackground(new java.awt.Color(255, 102, 51));
        btnManageGuests.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageGuests.setForeground(new java.awt.Color(255, 255, 255));
        btnManageGuests.setText("Manage Guests");

        btnManageEmployees.setBackground(new java.awt.Color(255, 102, 51));
        btnManageEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployees.setText("Manage Employees");
        btnManageEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeesActionPerformed(evt);
            }
        });

        btnManageRecreation.setBackground(new java.awt.Color(255, 102, 51));
        btnManageRecreation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageRecreation.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRecreation.setText("Manage Recreation");
        btnManageRecreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRecreationActionPerformed(evt);
            }
        });

        btnAddRecreation.setBackground(new java.awt.Color(255, 102, 51));
        btnAddRecreation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddRecreation.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRecreation.setText("Add Recreation ");
        btnAddRecreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecreationActionPerformed(evt);
            }
        });

        btnManageRooms.setBackground(new java.awt.Color(255, 102, 51));
        btnManageRooms.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageRooms.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRooms.setText("Manage Rooms");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageGuests)
                    .addComponent(btnManageEmployees)
                    .addComponent(btnAddEmployees))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRecreation)
                    .addComponent(btnManageRecreation))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageRooms)
                    .addComponent(btnAddRooms))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddEmployees, btnAddRecreation, btnAddRooms, btnManageEmployees, btnManageGuests, btnManageRecreation, btnManageRooms});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRecreation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageRecreation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnManageGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        layeredPane.add(jPanel3, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeesActionPerformed

    private void btnManageRecreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRecreationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageRecreationActionPerformed

    private void btnAddRecreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecreationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddRecreationActionPerformed

    private void btnAddEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeesActionPerformed
        // TODO add your handling code here:
        AddEmployeesJPanel addEmp = new AddEmployeesJPanel();
        switchPanels(addEmp);
    }//GEN-LAST:event_btnAddEmployeesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployees;
    private javax.swing.JButton btnAddRecreation;
    private javax.swing.JButton btnAddRooms;
    private javax.swing.JButton btnManageEmployees;
    private javax.swing.JButton btnManageGuests;
    private javax.swing.JButton btnManageRecreation;
    private javax.swing.JButton btnManageRooms;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLayeredPane layeredPane;
    // End of variables declaration//GEN-END:variables
}
