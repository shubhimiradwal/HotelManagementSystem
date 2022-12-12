/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.EmployeeQueries;
import databaseconnection.GuestQueries;
import databaseconnection.RecreationQueries;
import databaseconnection.TravelQueries;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Employee;
import model.Recreation;

/**
 *
 * @author Shruti
 */
public class BookRecreationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookRecreationJPanel
     */
    public BookRecreationJPanel() {
        initComponents();
        populateRecreationName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblActivityName = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        comboBoxTime = new javax.swing.JComboBox<>();
        btnBook = new javax.swing.JButton();
        lblGuestEmail = new javax.swing.JLabel();
        txtGuestEmail = new javax.swing.JTextField();
        lblTime1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        comboBoxRecreationName = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Book Recreational Activities");

        lblActivityName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblActivityName.setForeground(new java.awt.Color(51, 153, 255));
        lblActivityName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5340287_man_people_person_user_users_icon.png"))); // NOI18N
        lblActivityName.setText("Activity Name:");

        lblTime.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(51, 153, 255));
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/172517_phone_icon (1).png"))); // NOI18N
        lblTime.setText("Time:");

        comboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 hr", "2 hr", "3 hr", "4 hr", "5 hr", "6 hr" }));

        btnBook.setBackground(new java.awt.Color(255, 153, 51));
        btnBook.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        lblGuestEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblGuestEmail.setForeground(new java.awt.Color(51, 153, 255));
        lblGuestEmail.setText("Guest Email:");

        txtGuestEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtGuestEmail.setForeground(new java.awt.Color(51, 153, 255));
        txtGuestEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGuestEmailFocusLost(evt);
            }
        });

        lblTime1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblTime1.setForeground(new java.awt.Color(51, 153, 255));
        lblTime1.setText("Date:");

        txtDate.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblActivityName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTime)
                                    .addComponent(comboBoxTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxRecreationName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTime1)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(351, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxTime, lblActivityName, lblTime, lblTime1, txtDate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblActivityName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxRecreationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTime1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxTime, lblActivityName, lblTime, lblTime1, txtDate});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        String email = txtGuestEmail.getText();
        Pattern emailRegex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4"
                + "}\\b");
        if(email.isBlank() || !emailRegex.matcher(email).matches()){
            JOptionPane.showMessageDialog(null, "Please enter a valid Email ID");
            return;
        }
        String date = txtDate.getText();
        if(date.isBlank()){
            JOptionPane.showMessageDialog(null, "Please enter a valid Email ID");
            return;
        }
        String activityName = (String) comboBoxRecreationName.getSelectedItem();
        String time = (String) comboBoxTime.getSelectedItem();

        GuestQueries Insert= new GuestQueries();
        boolean result=Insert.bookRecreation(email, activityName, time, date);
        if (result==true){
            JOptionPane.showMessageDialog(this, "Recreation Booked succcessfully!!");
                txtGuestEmail.setText("");
                txtDate.setText("");              
                
        }
        else{
            JOptionPane.showMessageDialog(this, "Some error occurred. Please try again");
        }
        
    }//GEN-LAST:event_btnBookActionPerformed

    private void txtGuestEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGuestEmailFocusLost
        // TODO add your handling code here:
        String emailid = txtGuestEmail.getText();
        GuestQueries Insert= new GuestQueries();
        boolean res=Insert.CheckEmail(emailid);
        if(res==false)
        {
            JOptionPane.showMessageDialog(this, "Email Id entered dosen't exists.");
        }
    
    }//GEN-LAST:event_txtGuestEmailFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JComboBox<String> comboBoxRecreationName;
    private javax.swing.JComboBox<String> comboBoxTime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblActivityName;
    private javax.swing.JLabel lblGuestEmail;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtGuestEmail;
    // End of variables declaration//GEN-END:variables
private void populateRecreationName(){
    RecreationQueries rec = new RecreationQueries();
    
        try {
            for(String rec1: rec.getRecreationName()){
                System.out.println(rec1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRecreationJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        comboBoxRecreationName.setModel(new DefaultComboBoxModel<String>(Recreation.recreationNameList.toArray(new String[0])));
        
    }

}
