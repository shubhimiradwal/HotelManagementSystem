/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JPanel;

/**
 *
 * @author Shruti
 */
public class RecreationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public RecreationJPanel() {
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
        btnRecreationalActivities = new javax.swing.JButton();
        btnGuestRecreationBooking = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        layeredPane.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnRecreationalActivities.setBackground(new java.awt.Color(255, 153, 51));
        btnRecreationalActivities.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRecreationalActivities.setForeground(new java.awt.Color(255, 255, 255));
        btnRecreationalActivities.setText("Recreational Activities");
        btnRecreationalActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecreationalActivitiesActionPerformed(evt);
            }
        });

        btnGuestRecreationBooking.setBackground(new java.awt.Color(255, 153, 51));
        btnGuestRecreationBooking.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnGuestRecreationBooking.setForeground(new java.awt.Color(255, 255, 255));
        btnGuestRecreationBooking.setText("Guest Bookings");
        btnGuestRecreationBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestRecreationBookingActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/recreation3.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnRecreationalActivities)
                .addGap(103, 103, 103)
                .addComponent(btnGuestRecreationBooking)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecreationalActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuestRecreationBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175))
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

    private void btnRecreationalActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecreationalActivitiesActionPerformed
        // TODO add your handling code here:
        AddRecreationJPanel addRecreation = new AddRecreationJPanel();
        switchPanels(addRecreation);
    }//GEN-LAST:event_btnRecreationalActivitiesActionPerformed

    private void btnGuestRecreationBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestRecreationBookingActionPerformed
        // TODO add your handling code here:
        AllGuestRecreationBookingJPanel guestRecreation = new AllGuestRecreationBookingJPanel();
        switchPanels(guestRecreation);
    }//GEN-LAST:event_btnGuestRecreationBookingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuestRecreationBooking;
    private javax.swing.JButton btnRecreationalActivities;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLayeredPane layeredPane;
    // End of variables declaration//GEN-END:variables
}
