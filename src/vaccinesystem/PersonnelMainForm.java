package vaccinesystem;

import java.awt.Color;

public class PersonnelMainForm extends javax.swing.JFrame {

    //for storing the selected function
    private static String function;

    //get set method for function
    public void SetFunction(String function) {
        this.function = function;
    }

    public String GetFunction() {
        return function;
    }

    public PersonnelMainForm() {
        initComponents();
        getContentPane().setBackground(new Color(233, 242, 239)); //set background color
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PmRegisterBut = new javax.swing.JButton();
        PmRecordBut = new javax.swing.JButton();
        PmAppointmentBut = new javax.swing.JButton();
        PmVaccineBut = new javax.swing.JButton();
        PmLogOutBut = new javax.swing.JButton();
        PmBookAppointmentBut = new javax.swing.JButton();
        PmAddVaccineBut = new javax.swing.JButton();
        PmPeopleLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PmCentreBut = new javax.swing.JButton();
        PmAddCentreBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personnel Homepage");
        setPreferredSize(new java.awt.Dimension(530, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PmRegisterBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmRegisterBut.setText("Registration");
        PmRegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmRegisterButActionPerformed(evt);
            }
        });
        getContentPane().add(PmRegisterBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 175, -1));

        PmRecordBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmRecordBut.setText("User Record");
        PmRecordBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmRecordButActionPerformed(evt);
            }
        });
        getContentPane().add(PmRecordBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 175, -1));

        PmAppointmentBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmAppointmentBut.setText("Appointement Record");
        PmAppointmentBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmAppointmentButActionPerformed(evt);
            }
        });
        getContentPane().add(PmAppointmentBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 175, -1));

        PmVaccineBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmVaccineBut.setText("Vaccine Record");
        PmVaccineBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmVaccineButActionPerformed(evt);
            }
        });
        getContentPane().add(PmVaccineBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 175, -1));

        PmLogOutBut.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        PmLogOutBut.setText("Log Out");
        PmLogOutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmLogOutButActionPerformed(evt);
            }
        });
        getContentPane().add(PmLogOutBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 20, -1, -1));

        PmBookAppointmentBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmBookAppointmentBut.setText("Book Appointment");
        PmBookAppointmentBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmBookAppointmentButActionPerformed(evt);
            }
        });
        getContentPane().add(PmBookAppointmentBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 175, -1));

        PmAddVaccineBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmAddVaccineBut.setText("Add Vaccine");
        PmAddVaccineBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmAddVaccineButActionPerformed(evt);
            }
        });
        getContentPane().add(PmAddVaccineBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 175, 30));

        PmPeopleLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmPeopleLab.setText("User");
        getContentPane().add(PmPeopleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Appointment");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Vaccine");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Centre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        PmCentreBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmCentreBut.setText("Centre Record");
        PmCentreBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmCentreButActionPerformed(evt);
            }
        });
        getContentPane().add(PmCentreBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 175, -1));

        PmAddCentreBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PmAddCentreBut.setText("Add Centre");
        PmAddCentreBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmAddCentreButActionPerformed(evt);
            }
        });
        getContentPane().add(PmAddCentreBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 175, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PmLogOutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmLogOutButActionPerformed
        LoginForm lf = new LoginForm();
        lf.SetID("");
        GUI_Helper.switchForm(this, new HomePageForm(), new HomePageForm());
    }//GEN-LAST:event_PmLogOutButActionPerformed

    private void PmRegisterButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmRegisterButActionPerformed
        GUI_Helper.switchForm(this, new RegisterForm(), new RegisterForm());
    }//GEN-LAST:event_PmRegisterButActionPerformed

    private void PmRecordButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmRecordButActionPerformed
        GUI_Helper.switchForm(this, new RecordPeopleForm(), new RecordPeopleForm());
    }//GEN-LAST:event_PmRecordButActionPerformed

    private void PmBookAppointmentButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmBookAppointmentButActionPerformed
        this.SetFunction("add_appointment");
        GUI_Helper.switchForm(this, new AppointmentForm(), new AppointmentForm());
    }//GEN-LAST:event_PmBookAppointmentButActionPerformed

    private void PmAppointmentButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmAppointmentButActionPerformed
        this.SetFunction("appointment_info");
        GUI_Helper.switchForm(this, new RecordAppointmentForm(), new RecordAppointmentForm());
    }//GEN-LAST:event_PmAppointmentButActionPerformed

    private void PmAddVaccineButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmAddVaccineButActionPerformed
        this.SetFunction("add_vaccine");
        GUI_Helper.switchForm(this, new VaccineForm(), new VaccineForm());
    }//GEN-LAST:event_PmAddVaccineButActionPerformed

    private void PmVaccineButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmVaccineButActionPerformed
        this.SetFunction("vaccine_info");
        GUI_Helper.switchForm(this, new RecordVaccineForm(), new RecordVaccineForm());
    }//GEN-LAST:event_PmVaccineButActionPerformed

    private void PmAddCentreButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmAddCentreButActionPerformed
        this.SetFunction("add_centre");
        GUI_Helper.switchForm(this, new CentreForm(), new CentreForm());
    }//GEN-LAST:event_PmAddCentreButActionPerformed

    private void PmCentreButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmCentreButActionPerformed
        this.SetFunction("centre_info");
        GUI_Helper.switchForm(this, new RecordCentreForm(), new RecordCentreForm());
    }//GEN-LAST:event_PmCentreButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PmAddCentreBut;
    private javax.swing.JButton PmAddVaccineBut;
    private javax.swing.JButton PmAppointmentBut;
    private javax.swing.JButton PmBookAppointmentBut;
    private javax.swing.JButton PmCentreBut;
    private javax.swing.JButton PmLogOutBut;
    private javax.swing.JLabel PmPeopleLab;
    private javax.swing.JButton PmRecordBut;
    private javax.swing.JButton PmRegisterBut;
    private javax.swing.JButton PmVaccineBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
