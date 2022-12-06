/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.text.StyleConstants;

/**
 *
 * @author user
 */
public class OwnerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainPageJFrame
     */
    public OwnerJFrame() {
        initComponents();
        setSize(950, 600);
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
        pnl1 = new javax.swing.JPanel();
        btnHotel = new javax.swing.JButton();
        btnTravel = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBookings = new javax.swing.JButton();
        btnRecreation = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1.setBackground(new java.awt.Color(255, 255, 255));

        btnHotel.setBackground(new java.awt.Color(255, 153, 51));
        btnHotel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnHotel.setForeground(new java.awt.Color(255, 255, 255));
        btnHotel.setText("Hotel");
        btnHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHotelActionPerformed(evt);
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

        btnLogout.setBackground(new java.awt.Color(255, 153, 51));
        btnLogout.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBookings.setBackground(new java.awt.Color(255, 153, 51));
        btnBookings.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBookings.setForeground(new java.awt.Color(255, 255, 255));
        btnBookings.setText("Bookings");
        btnBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingsActionPerformed(evt);
            }
        });

        btnRecreation.setBackground(new java.awt.Color(255, 153, 51));
        btnRecreation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRecreation.setForeground(new java.awt.Color(255, 255, 255));
        btnRecreation.setText("Rerceation");
        btnRecreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecreationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTravel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecreation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnHotel)
                .addGap(41, 41, 41)
                .addComponent(btnBookings)
                .addGap(50, 50, 50)
                .addComponent(btnTravel)
                .addGap(55, 55, 55)
                .addComponent(btnRecreation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(19, 19, 19))
        );

        splitPane.setLeftComponent(pnl1);

        pnl2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(pnl2);

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

    private void btnHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHotelActionPerformed
        // TODO add your handling code here:
        HotelJPanel hotel = new HotelJPanel();
        splitPane.setRightComponent(hotel);
    }//GEN-LAST:event_btnHotelActionPerformed

    private void btnTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelActionPerformed
        // TODO add your handling code here:
        HotelJPanel hotel = new HotelJPanel();
        splitPane.setRightComponent(hotel);
    }//GEN-LAST:event_btnTravelActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingsActionPerformed
        // TODO add your handling code here:
        BookingsJPanel bookings = new BookingsJPanel();
        splitPane.setRightComponent(bookings);
    }//GEN-LAST:event_btnBookingsActionPerformed

    private void btnRecreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecreationActionPerformed
        // TODO add your handling code here:
        RecreationJPanel recreation = new RecreationJPanel();
        splitPane.setRightComponent(recreation);
    }//GEN-LAST:event_btnRecreationActionPerformed

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
            java.util.logging.Logger.getLogger(OwnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookings;
    private javax.swing.JButton btnHotel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRecreation;
    private javax.swing.JButton btnTravel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
