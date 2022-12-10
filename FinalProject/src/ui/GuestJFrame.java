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
        pnl6 = new javax.swing.JPanel();
        btnRoomDetails = new javax.swing.JButton();
        btnTravel5 = new javax.swing.JButton();
        btnRecreation5 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
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

        btnTravel5.setBackground(new java.awt.Color(255, 153, 51));
        btnTravel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnTravel5.setForeground(new java.awt.Color(255, 255, 255));
        btnTravel5.setText("Travel");
        btnTravel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravel5ActionPerformed(evt);
            }
        });

        btnRecreation5.setBackground(new java.awt.Color(255, 153, 51));
        btnRecreation5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRecreation5.setForeground(new java.awt.Color(255, 255, 255));
        btnRecreation5.setText("Recreational Activities ");
        btnRecreation5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecreation5ActionPerformed(evt);
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

        javax.swing.GroupLayout pnl6Layout = new javax.swing.GroupLayout(pnl6);
        pnl6.setLayout(pnl6Layout);
        pnl6Layout.setHorizontalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRecreation5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRoomDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTravel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl6Layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnl6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogout, btnRecreation5, btnRoomDetails, btnTravel5});

        pnl6Layout.setVerticalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnRoomDetails)
                .addGap(39, 39, 39)
                .addComponent(btnTravel5)
                .addGap(47, 47, 47)
                .addComponent(btnRecreation5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(29, 29, 29))
        );

        pnl6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogout, btnRecreation5, btnRoomDetails, btnTravel5});

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
        HotelJPanel hotel = new HotelJPanel();
        splitPane.setRightComponent(hotel);
    }//GEN-LAST:event_btnRoomDetailsActionPerformed

    private void btnTravel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravel5ActionPerformed
        // TODO add your handling code here:
        TravelJPanel travel = new TravelJPanel();
        splitPane.setRightComponent(travel);
    }//GEN-LAST:event_btnTravel5ActionPerformed

    private void btnRecreation5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecreation5ActionPerformed
        // TODO add your handling code here:
        RecreationJPanel recreation = new RecreationJPanel();
        splitPane.setRightComponent(recreation);
    }//GEN-LAST:event_btnRecreation5ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        MainJFrame MainJFrame = new MainJFrame();
        MainJFrame.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRecreation5;
    private javax.swing.JButton btnRoomDetails;
    private javax.swing.JButton btnTravel5;
    private javax.swing.JPanel pnl6;
    private javax.swing.JPanel pnl7;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
