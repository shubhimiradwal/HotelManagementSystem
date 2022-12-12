/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author Shruti
 */
public class GuestJFrame extends javax.swing.JFrame {

    /**
     * Creates new form GuestJFrame
     */
    public GuestJFrame() {
        initComponents();
        setSize(1050, 650);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        pnl6 = new javax.swing.JPanel();
        btnRoomDetails = new javax.swing.JButton();
        btnTravel = new javax.swing.JButton();
        btnRecreation = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnTotalTransactions = new javax.swing.JButton();
        btnBookHousekeeping = new javax.swing.JButton();
        pnl7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl6.setBackground(new java.awt.Color(255, 255, 255));

        btnRoomDetails.setBackground(new java.awt.Color(255, 153, 51));
        btnRoomDetails.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRoomDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnRoomDetails.setText("Room Details");
        btnRoomDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomDetailsActionPerformed(evt);
            }
        });

        btnTravel.setBackground(new java.awt.Color(255, 153, 51));
        btnTravel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnTravel.setForeground(new java.awt.Color(255, 255, 255));
        btnTravel.setText("Travel");
        btnTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravelActionPerformed(evt);
            }
        });

        btnRecreation.setBackground(new java.awt.Color(255, 153, 51));
        btnRecreation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRecreation.setForeground(new java.awt.Color(255, 255, 255));
        btnRecreation.setText("Recreational Activities ");
        btnRecreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecreationActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 153, 51));
        btnLogout.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(255, 153, 51));
        btnProfile.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnTotalTransactions.setBackground(new java.awt.Color(255, 153, 51));
        btnTotalTransactions.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnTotalTransactions.setForeground(new java.awt.Color(255, 255, 255));
        btnTotalTransactions.setText("Total Transactions");
        btnTotalTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalTransactionsActionPerformed(evt);
            }
        });

        btnBookHousekeeping.setBackground(new java.awt.Color(255, 153, 51));
        btnBookHousekeeping.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBookHousekeeping.setForeground(new java.awt.Color(255, 255, 255));
        btnBookHousekeeping.setText("Book Housekeeping");
        btnBookHousekeeping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookHousekeepingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl6Layout = new javax.swing.GroupLayout(pnl6);
        pnl6.setLayout(pnl6Layout);
        pnl6Layout.setHorizontalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(btnRoomDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(btnTravel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(btnRecreation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(btnTotalTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBookHousekeeping, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pnl6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogout, btnProfile, btnRecreation, btnRoomDetails, btnTravel});

        pnl6Layout.setVerticalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnProfile)
                .addGap(18, 18, 18)
                .addComponent(btnRoomDetails)
                .addGap(18, 18, 18)
                .addComponent(btnTravel)
                .addGap(18, 18, 18)
                .addComponent(btnRecreation)
                .addGap(18, 18, 18)
                .addComponent(btnTotalTransactions)
                .addGap(18, 18, 18)
                .addComponent(btnBookHousekeeping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(29, 29, 29))
        );

        pnl6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogout, btnRecreation, btnRoomDetails, btnTravel});

        splitPane.setLeftComponent(pnl6);

        pnl7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl7Layout = new javax.swing.GroupLayout(pnl7);
        pnl7.setLayout(pnl7Layout);
        pnl7Layout.setHorizontalGroup(
            pnl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        pnl7Layout.setVerticalGroup(
            pnl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(pnl7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRoomDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomDetailsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRoomDetailsActionPerformed

    private void btnTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelActionPerformed
        // TODO add your handling code here:
        TravelJPanel travel = new TravelJPanel();
        splitPane.setRightComponent(travel);
    }//GEN-LAST:event_btnTravelActionPerformed

    private void btnRecreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecreationActionPerformed
        // TODO add your handling code here:
        BookRecreationJPanel recreation = new BookRecreationJPanel();
        splitPane.setRightComponent(recreation);
    }//GEN-LAST:event_btnRecreationActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnTotalTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalTransactionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTotalTransactionsActionPerformed

    private void btnBookHousekeepingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookHousekeepingActionPerformed
        // TODO add your handling code here:
         BookHousekeepingJPanel housekeeping = new BookHousekeepingJPanel();
        splitPane.setRightComponent(housekeeping);
        
    }//GEN-LAST:event_btnBookHousekeepingActionPerformed

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
            java.util.logging.Logger.getLogger(GuestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookHousekeeping;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRecreation;
    private javax.swing.JButton btnRoomDetails;
    private javax.swing.JButton btnTotalTransactions;
    private javax.swing.JButton btnTravel;
    private javax.swing.JPanel pnl6;
    private javax.swing.JPanel pnl7;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
