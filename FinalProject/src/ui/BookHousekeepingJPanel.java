/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.EmployeeQueries;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BookHouseKeeping;
import static model.BookHouseKeeping.bookedhousekeeper;
import model.Employee;
import model.Guest;

/**
 *
 * @author Shruti
 */
public class BookHousekeepingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookHousekeepingJPanel
     */
    public BookHousekeepingJPanel() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txthousekeepingemail = new javax.swing.JTextField();
        txtguestemail = new javax.swing.JTextField();
        lblguestname = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        housekeeperrole = new javax.swing.JTextField();
        txthousekeepername = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lbl_housekeepingemail = new javax.swing.JLabel();
        lblrole = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Role", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Book Housekeeping");

        lblguestname.setText("Guest email");

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblname.setText("House Keeping email");

        lbl_housekeepingemail.setText("HouseKeepername");

        lblrole.setText("role");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblguestname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname)
                            .addComponent(lbl_housekeepingemail)
                            .addComponent(lblrole))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtguestemail)
                            .addComponent(txthousekeepingemail)
                            .addComponent(housekeeperrole, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txthousekeepername))))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthousekeepingemail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblguestname)
                    .addComponent(txtguestemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthousekeepername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_housekeepingemail))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housekeeperrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrole))
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String housekeepemail = txthousekeepingemail.getText();
        String guest_email = txtguestemail.getText();
        String guest_housekeepername = txthousekeepername.getText();
        String guest_housekeeper_role = housekeeperrole.getText();

        String role=housekeeperrole.getText();
                
         // String city = lp.getCacity();
//         if(email.equals("")||guest_name.equals("")||guest_email.equals("")||role.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please add mandatory feild....");
//            return;
//        }
        
        bookedhousekeeper.add(new BookHouseKeeping(guest_housekeepername,housekeepemail,guest_email,guest_housekeeper_role));//String name, String email, String guest_name, String role
        
        JOptionPane.showMessageDialog(this, "Room Booked Successfully!!");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployees.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();

        Employee selectedGuest = (Employee) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedGuest);

        txthousekeepingemail.setText(selectedGuest.getEmailAddress());
        txthousekeepername.setText(selectedGuest.getName());
        housekeeperrole.setText(selectedGuest.getRole());
        
    }//GEN-LAST:event_tblEmployeesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField housekeeperrole;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_housekeepingemail;
    private javax.swing.JLabel lblguestname;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblrole;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtguestemail;
    private javax.swing.JTextField txthousekeepername;
    private javax.swing.JTextField txthousekeepingemail;
    // End of variables declaration//GEN-END:variables

public void populateTable()  {
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
        EmployeeQueries emp= new EmployeeQueries();
        
        try {
            for(Employee emp1: emp.getEmp()){
                if(emp1.getRole().equalsIgnoreCase("HouseKeeping"))
                {
                Object[] row = new Object[3];
                row[0] = emp1;
                row[1] = emp1.getRole();
                row[2] = emp1.getEmailAddress();
                model.addRow(row);
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}


