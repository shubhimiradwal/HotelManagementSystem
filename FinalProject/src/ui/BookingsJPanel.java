/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author user
 */
public class BookingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookingsJPanel
     */
    public BookingsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddEmployees = new javax.swing.JButton();
        btnAddEmployees1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAddEmployees.setBackground(new java.awt.Color(102, 204, 255));
        btnAddEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployees.setText("ADD ROOMS");

        btnAddEmployees1.setBackground(new java.awt.Color(102, 204, 255));
        btnAddEmployees1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddEmployees1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployees1.setText("ROOM AVAILABILTY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnAddEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnAddEmployees1)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployees;
    private javax.swing.JButton btnAddEmployees1;
    // End of variables declaration//GEN-END:variables
}
