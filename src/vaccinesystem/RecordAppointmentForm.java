package vaccinesystem;

import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class RecordAppointmentForm extends javax.swing.JFrame {

    //for storing the selected id and date
    private static String selected;
    private static String selected_date;

    //get set method for selected id and date
    public void SetSelected(String selected) {
        this.selected = selected;
    }

    public String GetSelected() {
        return selected;
    }

    public void SetSelectedDate(String selected_date) {
        this.selected_date = selected_date;
    }
    
    public String GetSelectedDate() {
        return selected_date;
    }

    public RecordAppointmentForm() {
        initComponents();
        LoginForm lf = new LoginForm();
        GUI_Helper.setBackground(this.getContentPane()); //set background color
        AppointmentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //only allow selection of single row
        AppointmentTable.setFocusable(false); //not allowing focus selection on single cell
        AppointmentTable.getColumnModel().getColumn(0).setPreferredWidth(90); //set table column size
        AppointmentTable.getColumnModel().getColumn(1).setPreferredWidth(70); //set table column size
        AppointmentTable.getColumnModel().getColumn(2).setPreferredWidth(60); //set table column size
        //different access functionality of form based on user type
        if (lf.GetID().equals("Personnel")) {
            Appointment.loadAppointmentTable((DefaultTableModel) AppointmentTable.getModel());
        } else {
            AppICLab.setText("***past appointment could not be modify or remove");
            AppICLab.setForeground(new Color(102, 102, 102));
            AppIDTxt.hide();
            AppSearchBut.hide();
            TableColumn removeCol = AppointmentTable.getColumnModel().getColumn(0);
            AppointmentTable.removeColumn(removeCol);
            Appointment.loadUserAppointmentTable((DefaultTableModel) AppointmentTable.getModel());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppSearchBut = new javax.swing.JButton();
        AppIDTxt = new javax.swing.JTextField();
        AppICLab = new javax.swing.JLabel();
        AppBackBut = new javax.swing.JButton();
        AppViewModBut = new javax.swing.JButton();
        AppRemoveBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appointment");
        setPreferredSize(new java.awt.Dimension(530, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AppSearchBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppSearchBut.setText("Search");
        AppSearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppSearchButActionPerformed(evt);
            }
        });
        getContentPane().add(AppSearchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, -1));

        AppIDTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        getContentPane().add(AppIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 30));

        AppICLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppICLab.setText("<html>IC/Passport/Date:<br/> (ex: 31-01-21)</html>");
        getContentPane().add(AppICLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 360, 38));

        AppBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        AppBackBut.setText("<");
        AppBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppBackButActionPerformed(evt);
            }
        });
        getContentPane().add(AppBackBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 11, -1, -1));

        AppViewModBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppViewModBut.setText("View/Modify");
        AppViewModBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppViewModButActionPerformed(evt);
            }
        });
        getContentPane().add(AppViewModBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 120, -1));

        AppRemoveBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppRemoveBut.setText("Remove");
        AppRemoveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppRemoveButActionPerformed(evt);
            }
        });
        getContentPane().add(AppRemoveBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, -1));

        AppointmentTable.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IC/Passport", "Date", "Time", "Centre", "Vaccine"
            }
        ));
        jScrollPane2.setViewportView(AppointmentTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 470, 150));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment Record");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 43, 540, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AppViewModButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppViewModButActionPerformed
        LoginForm lf = new LoginForm();
        String selected_message = AuthenticationHelper.checkSelected(AppointmentTable);

        if(selected_message.equals("Please select a record")){
            JOptionPane.showMessageDialog(this, selected_message, "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            int row = AppointmentTable.getSelectedRow();
            //setting selected id and date based on different user type
            if (lf.GetID().equals("Personnel")) {
                this.SetSelected(AppointmentTable.getValueAt(row, 0).toString());
                this.SetSelectedDate(selected_date = AppointmentTable.getValueAt(row, 1).toString());
            } else {
                this.SetSelected(lf.GetID());
                this.SetSelectedDate(AppointmentTable.getValueAt(row, 0).toString());
            }
            int error = AuthenticationHelper.checkModAppointmentDate(this.GetSelected(), this.GetSelectedDate());
            if (error == 1) {
                JOptionPane.showMessageDialog(this, "Appointment not able to modify", "Message", JOptionPane.ERROR_MESSAGE);
            } else {
                this.setVisible(false);
                AppointmentForm vf = new AppointmentForm();
                vf.setVisible(true);
            }
        }  
    }//GEN-LAST:event_AppViewModButActionPerformed

    private void AppBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppBackButActionPerformed
        GUI_Helper.switchForm(this, new PersonnelMainForm(), new PeopleMainForm());
    }//GEN-LAST:event_AppBackButActionPerformed

    private void AppSearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppSearchButActionPerformed
        String message = GUI_Helper.search(AppIDTxt.getText(), (DefaultTableModel) AppointmentTable.getModel(), AppointmentTable);
        if(message.equals("") == false){
            JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AppSearchButActionPerformed

    private void AppRemoveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppRemoveButActionPerformed
        LoginForm lf = new LoginForm();
        String selected_message = AuthenticationHelper.checkSelected(AppointmentTable);

        if(selected_message.equals("Please select a record")){
            JOptionPane.showMessageDialog(this, selected_message, "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            int row = AppointmentTable.getSelectedRow();
            //setting selected id and date based on different user type
            if (lf.GetID().equals("Personnel")) {
                this.SetSelected(AppointmentTable.getValueAt(row, 0).toString());
                this.SetSelectedDate(selected_date = AppointmentTable.getValueAt(row, 1).toString());
            } else {
                this.SetSelected(lf.GetID());
                this.SetSelectedDate(AppointmentTable.getValueAt(row, 0).toString());
            }

            String newFile = Appointment.removeAppointment(selected, selected_date);

            if (newFile.equals("Appointment not able to cancel")) {
                JOptionPane.showMessageDialog(this, newFile, "Message", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    JOptionPane.showMessageDialog(this, "Appointment Cancelled Successfully");
                    File appointmentfile = new File("appointment.txt");
                    FileWriter writer = new FileWriter(appointmentfile);
                    writer.write(newFile);
                    writer.close();
                    this.setVisible(false);
                    RecordAppointmentForm raf = new RecordAppointmentForm();
                    raf.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(RecordAppointmentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_AppRemoveButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordAppointmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppBackBut;
    private javax.swing.JLabel AppICLab;
    private javax.swing.JTextField AppIDTxt;
    private javax.swing.JButton AppRemoveBut;
    private javax.swing.JButton AppSearchBut;
    private javax.swing.JButton AppViewModBut;
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
