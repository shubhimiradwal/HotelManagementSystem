/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.AddRoomsQuery;
import databaseconnection.EmployeeQueries;
import databaseconnection.GuestQueries;
import javax.swing.DefaultComboBoxModel;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Room;
import static model.Room.room_no;

/**
 *
 * @author Shruti
 */
public class BookRoomJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookRoomJPanel
     */
    public BookRoomJPanel() {
        initComponents();
        initDateFields();
        populateRoomNo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblGuestEmail = new javax.swing.JLabel();
        txtGuestEmail = new javax.swing.JTextField();
        lblCheckin = new javax.swing.JLabel();
        txtCheckin = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        comboBoxType = new javax.swing.JComboBox<>();
        lblRoomNo1 = new javax.swing.JLabel();
        lblCheckout = new javax.swing.JLabel();
        txtCheckinout = new javax.swing.JTextField();
        comboBoxRoomNo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblBook.setBackground(new java.awt.Color(255, 153, 51));
        lblBook.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblBook.setForeground(new java.awt.Color(255, 255, 255));
        lblBook.setText("Book");
        lblBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBookActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Book a Room");

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
        txtGuestEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestEmailActionPerformed(evt);
            }
        });

        lblCheckin.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCheckin.setForeground(new java.awt.Color(51, 153, 255));
        lblCheckin.setText("Checkin Date:");

        txtCheckin.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCheckin.setForeground(new java.awt.Color(51, 153, 255));
        txtCheckin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCheckinFocusLost(evt);
            }
        });

        lblType.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblType.setForeground(new java.awt.Color(51, 153, 255));
        lblType.setText("Type:");

        comboBoxType.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        comboBoxType.setForeground(new java.awt.Color(51, 153, 255));
        comboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Delux", "Suite", "Villa", "Presidential Suite" }));
        comboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTypeActionPerformed(evt);
            }
        });

        lblRoomNo1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblRoomNo1.setForeground(new java.awt.Color(51, 153, 255));
        lblRoomNo1.setText("Room No.:");

        lblCheckout.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCheckout.setForeground(new java.awt.Color(51, 153, 255));
        lblCheckout.setText("Checkout Date:");

        txtCheckinout.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCheckinout.setForeground(new java.awt.Color(51, 153, 255));
        txtCheckinout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCheckinoutFocusLost(evt);
            }
        });

        comboBoxRoomNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblGuestEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(lblCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(lblRoomNo1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(comboBoxRoomNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblType)
                                    .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCheckout)
                                    .addComponent(txtCheckinout, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lblBook, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxType, lblCheckin, lblGuestEmail, lblRoomNo1, lblType, txtCheckin});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxType)
                    .addComponent(comboBoxRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCheckin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCheckout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckinout, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addComponent(lblBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxType, lblCheckin, lblGuestEmail, lblRoomNo1, lblType, txtCheckin, txtGuestEmail});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTypeActionPerformed

    private void txtGuestEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestEmailActionPerformed

    private void lblBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBookActionPerformed
      
        String email = txtGuestEmail.getText();
        Pattern emailRegex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4"
                + "}\\b");
        if(email.isBlank() || !emailRegex.matcher(email).matches()){
            JOptionPane.showMessageDialog(null, "Please enter a valid Email ID");
            return;
        }
        String checkin_date = txtCheckin.getText();
        Pattern checkinRegex = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$");
        if(checkin_date.isBlank() || !checkinRegex.matcher(checkin_date).matches()){
            JOptionPane.showMessageDialog(null, "Please enter a valid checkin date in YYYY-MM-DD format ");
            
            return;
        }
        String checkout_date = txtCheckinout.getText();
        Pattern checkoutRegex = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$");
        if(checkout_date.isBlank() || !checkoutRegex.matcher(checkout_date).matches()){
            JOptionPane.showMessageDialog(null, "Please enter a valid checkout date in YYYY-MM-DD format ");
            
            return;
        }
        GuestQueries In= new GuestQueries();
        boolean res=In.CheckEmail(email);
        if(res==false)
        {
            JOptionPane.showMessageDialog(this, "Email Id entered dosen't exists.");
            return;
        }        // TODO add your handling code here:
        String room_type= (String)comboBoxType.getSelectedItem();
        String room_no=(String)(comboBoxRoomNo.getSelectedItem());
        GuestQueries Insert= new GuestQueries();
        boolean result=Insert.bookRoom(email,Integer.parseInt(room_no),room_type,checkin_date, checkout_date);
        if (result==true){
            JOptionPane.showMessageDialog(this, "Room Booked succcessfully!!");
                txtGuestEmail.setText("");
                txtCheckin.setText("");
                txtCheckinout.setText("");
                
                
        }
        else{
            JOptionPane.showMessageDialog(this, "Some error occurred. Please try again");
        }
        
        
        
    }//GEN-LAST:event_lblBookActionPerformed

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

    private void txtCheckinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCheckinFocusLost
        // TODO add your handling code here:
        populateRoomNo();
        
        
    }//GEN-LAST:event_txtCheckinFocusLost

    private void txtCheckinoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCheckinoutFocusLost
        // TODO add your handling code here:
        populateRoomNo();
    }//GEN-LAST:event_txtCheckinoutFocusLost

     
    
    private void initDateFields(){
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");  
    String strDate = formatter.format(date);  
    txtCheckin.setText(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
    txtCheckinout.setText(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
    
    }
    
    
        
                    
     private void populateRoomNo(){
     AddRoomsQuery room= new AddRoomsQuery();
     
        try {
            
            String checkin_date=txtCheckin.getText();
            String checkout_date=txtCheckinout.getText();
           
            for(String room1: room.getRoom_no(checkin_date,checkout_date)){
                System.out.println(room1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        comboBoxRoomNo.setModel(new DefaultComboBoxModel<String>(Room.room_no.toArray(new String[0])));
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxRoomNo;
    private javax.swing.JComboBox<String> comboBoxType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lblBook;
    private javax.swing.JLabel lblCheckin;
    private javax.swing.JLabel lblCheckout;
    private javax.swing.JLabel lblGuestEmail;
    private javax.swing.JLabel lblRoomNo1;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtCheckin;
    private javax.swing.JTextField txtCheckinout;
    private javax.swing.JTextField txtGuestEmail;
    // End of variables declaration//GEN-END:variables
}
