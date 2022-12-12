/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.GuestQueries;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import model.Booking;
import static model.Booking.guestRoomBooking;
import model.Guest;
import model.RecreationBooking;
import model.ShowRoomBookingsAmount;

/**
 *
 * @author Shruti
 */
public class GuestBookingTransactionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GuestTransactionJPanel
     */
    MainJFrame login = new MainJFrame();
    public GuestBookingTransactionJPanel() {
        initComponents();
        populateTable();
        populateRoomTable();
        populateRecreationTable();
    }
    public void populateTable()  {
        DefaultTableModel model = (DefaultTableModel) tblGuest.getModel();
        model.setRowCount(0);
        GuestQueries q= new GuestQueries();
        String usernameEmail = login.getUsernameEmail();
        
        try {
            for(Guest g1: q.getEachGuestDetails(usernameEmail)){
                Object[] row = new Object[4];
                row[0] = g1;
                row[1] = g1.getEmailAddress();
                row[2] = g1.getAddress();
                row[3] = g1.getPhoneNumber();
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            // Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public void populateRoomTable()  {
        DefaultTableModel model = (DefaultTableModel) tblRoomBookings.getModel();
        model.setRowCount(0);
        GuestQueries q= new GuestQueries();
        String usernameEmail = login.getUsernameEmail();
        
        try {
            for(Booking g1: q.getEachGuestRoomBoking(usernameEmail)){
                Object[] row = new Object[4];
                
                row[0] = g1.getGuestName();
                row[1] = g1.getCheck_in_date();
                row[2] = g1.getCheck_out_date();
                row[3] = g1.getPrice();
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            // Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public void populateRecreationTable()  {
        DefaultTableModel model = (DefaultTableModel) tblRecreationBook.getModel();
        model.setRowCount(0);
        GuestQueries q= new GuestQueries();
        String usernameEmail = login.getUsernameEmail();
        
        try {
            for(RecreationBooking g1: q.getEachGuestRecreationBoking(usernameEmail)){
                Object[] row = new Object[4];
                
                row[0] = g1.getGuestName();
                row[1] = g1.getRecreationName();
                row[2] = g1.getRecreationTime();
                row[3] = g1.getPrice();
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            // Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGuest = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRoomBookings = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecreationBook = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("My Recreation Booking");

        tblGuest.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblGuest.setForeground(new java.awt.Color(255, 153, 51));
        tblGuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Address", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblGuest);

        tblRoomBookings.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblRoomBookings.setForeground(new java.awt.Color(255, 153, 51));
        tblRoomBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "CheckIn Date", "CheckOut Date", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblRoomBookings);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("My Transactions");

        tblRecreationBook.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblRecreationBook.setForeground(new java.awt.Color(255, 153, 51));
        tblRecreationBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Recreation Name", "Recreation Time", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecreationBook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblGuest;
    private javax.swing.JTable tblRecreationBook;
    private javax.swing.JTable tblRoomBookings;
    // End of variables declaration//GEN-END:variables
}
