package vaccinesystem;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class AppointmentForm extends javax.swing.JFrame {

    public AppointmentForm() {
        initComponents();
        GUI_Helper.setBackground(this.getContentPane()); //set background color
        LoginForm lf = new LoginForm();
        PersonnelMainForm pmf = new PersonnelMainForm();
        PeopleMainForm pplmf = new PeopleMainForm();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 3);//3 day after
        Date min = cal.getTime();
        cal.add(Calendar.MONTH, 3);//3 month after        
        Date max = cal.getTime();
        AppDate.setDate(min);
        AppDate.setSelectableDateRange(min, max);

        //for view/modify appointment information
        if (pmf.GetFunction() != null && pmf.GetFunction().equals("appointment_info") && lf.GetID().equals("Personnel") || pplmf.GetFunction() != null && pplmf.GetFunction().equals("info") && lf.GetID().equals("Personnel") == false) {
            AppFormLab.setText("Appointment Information (Modifiable)");
            this.setTitle("Appointment");
            AppRegBut.setText("Modify");
            AppICTxt.setEditable(false);
            AppICTxt.setBorder(null);
            AuthenticationHelper.viewModAppointment(AppICTxt, AppDate, AppTimeCmb, AppVenueCmb, AppVacCmb);
            //for add appointment
        } else {
            //setting user ID for login user
            if (lf.GetID().equals("Personnel") == false) {
                AppICTxt.setText(lf.GetID());
                AppICTxt.setEditable(false);
                AppICTxt.setBorder(null);
            }
            AppVenueCmb.addItem("");
            AppVenueCmb.setSelectedItem("");
            AppVacCmb.addItem("");
            AppVacCmb.setSelectedItem("");
            AuthenticationHelper.loadCentre(AppVenueCmb);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppFormLab = new javax.swing.JLabel();
        AppBackBut = new javax.swing.JButton();
        AppDate = new com.toedter.calendar.JDateChooser();
        AppTimeCmb = new javax.swing.JComboBox<>();
        AppRegBut = new javax.swing.JButton();
        AppICTxt = new javax.swing.JTextField();
        AppICLab = new javax.swing.JLabel();
        AppDateLab = new javax.swing.JLabel();
        AppTimeLab = new javax.swing.JLabel();
        AppVenueLab = new javax.swing.JLabel();
        AppVaccLab = new javax.swing.JLabel();
        AppVacCmb = new javax.swing.JComboBox<>();
        AppVenueCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appointment Registration");

        AppFormLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        AppFormLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppFormLab.setText("Appointment Booking Form");

        AppBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        AppBackBut.setText("<");
        AppBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppBackButActionPerformed(evt);
            }
        });

        AppDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        AppTimeCmb.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        AppTimeCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Session 1 (8am ~ 1pm)", "Session 2 (2pm ~ 7pm)" }));
        AppTimeCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppTimeCmbActionPerformed(evt);
            }
        });

        AppRegBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        AppRegBut.setText("Book");
        AppRegBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppRegButActionPerformed(evt);
            }
        });

        AppICTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        AppICLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppICLab.setText("IC/Passport:");

        AppDateLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppDateLab.setText("Date:");

        AppTimeLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppTimeLab.setText("Time:");

        AppVenueLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppVenueLab.setText("Centre:");

        AppVaccLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppVaccLab.setText("Vaccine:");

        AppVacCmb.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        AppVacCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppVacCmbActionPerformed(evt);
            }
        });

        AppVenueCmb.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        AppVenueCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppVenueCmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AppBackBut)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppICLab)
                    .addComponent(AppVaccLab)
                    .addComponent(AppVenueLab)
                    .addComponent(AppDateLab)
                    .addComponent(AppTimeLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppRegBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AppVenueCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AppTimeCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AppDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AppICTxt)
                        .addComponent(AppVacCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
            .addComponent(AppFormLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppBackBut)
                .addGap(39, 39, 39)
                .addComponent(AppFormLab)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppICTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppICLab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppDateLab)
                    .addComponent(AppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppTimeLab)
                    .addComponent(AppTimeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppVenueLab)
                    .addComponent(AppVenueCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppVaccLab)
                    .addComponent(AppVacCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(AppRegBut)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AppBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppBackButActionPerformed
        GUI_Helper.switchFormComplex(this, new PersonnelMainForm(), new RecordAppointmentForm());
    }//GEN-LAST:event_AppBackButActionPerformed

    private void AppTimeCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppTimeCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppTimeCmbActionPerformed

    private void AppRegButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppRegButActionPerformed
        if (AppRegBut.getText().equals("Book")) {
            int error = Appointment.validateAppointment(AppICTxt.getText(), AppVenueCmb.getSelectedItem().toString(), AppVacCmb.getSelectedItem().toString());
            switch (error) {
                case 1:
                    JOptionPane.showMessageDialog(this, "Invalid IC/Passport", "Message", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Appointment Already Booked", "Message", JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(this, "Please select a centre/vaccine", "Message", JOptionPane.ERROR_MESSAGE);
                    break;
                default:
                    Appointment.addAppointment(AppDate.getDate(), AppICTxt.getText(), AppTimeCmb.getSelectedItem().toString(), AppVenueCmb.getSelectedItem().toString(), AppVacCmb.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(this, "Appointment Booked Successfully");
                    GUI_Helper.switchForm(this, new PersonnelMainForm(), new PeopleMainForm());
                    break;
            }
        } else {
            String newFile = Appointment.modifyAppointment(AppDate.getDate(), AppTimeCmb.getSelectedItem().toString(), AppVenueCmb.getSelectedItem().toString(), AppVacCmb.getSelectedItem().toString());
            try {
                File appointmentfile = new File("appointment.txt");
                FileWriter writer = new FileWriter(appointmentfile);
                writer.write(newFile);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                JOptionPane.showMessageDialog(this, "Appointment Updated Successfully");
                GUI_Helper.switchForm(this, new RecordAppointmentForm(), new RecordAppointmentForm());
            }
        }
    }//GEN-LAST:event_AppRegButActionPerformed

    private void AppVacCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppVacCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppVacCmbActionPerformed

    private void AppVenueCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppVenueCmbActionPerformed
        AppVacCmb.removeAllItems();
        try {
            File vaccinefile = new File("vaccine.txt");
            Scanner myReader = new Scanner(vaccinefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String temp_vaccine = myReader.nextLine();
                data = myReader.nextLine() + myReader.nextLine() + myReader.nextLine() + myReader.nextLine();
                data = myReader.nextLine();
                if (data.equals(AppVenueCmb.getSelectedItem())) {
                    AppVacCmb.addItem(temp_vaccine);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }//GEN-LAST:event_AppVenueCmbActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppBackBut;
    private com.toedter.calendar.JDateChooser AppDate;
    private javax.swing.JLabel AppDateLab;
    private javax.swing.JLabel AppFormLab;
    private javax.swing.JLabel AppICLab;
    private javax.swing.JTextField AppICTxt;
    private javax.swing.JButton AppRegBut;
    private javax.swing.JComboBox<String> AppTimeCmb;
    private javax.swing.JLabel AppTimeLab;
    private javax.swing.JComboBox<String> AppVacCmb;
    private javax.swing.JLabel AppVaccLab;
    private javax.swing.JComboBox<String> AppVenueCmb;
    private javax.swing.JLabel AppVenueLab;
    // End of variables declaration//GEN-END:variables
}
