package vaccinesystem;

import java.awt.Color;
import java.io.*;
import javax.swing.*;

public class VaccineForm extends javax.swing.JFrame {

    public VaccineForm() {
        initComponents();
        VacMacLab.setBackground(new Color(240, 240, 240)); //set background color
        VacExpLab.setBackground(new Color(240, 240, 240)); //set background color
        VacQttLab.setBackground(new Color(240, 240, 240)); //set background color
        VacCNLab.setBackground(new Color(240, 240, 240)); //set background color
        LoginForm lf = new LoginForm();
        PersonnelMainForm pmf = new PersonnelMainForm();
        GUI_Helper.setBackground(this.getContentPane()); //set background color
        AuthenticationHelper.loadCentre(CenNameCmb);
        //for changing button text based on the user type and selected funtion
        if (lf.GetID().equals("Personnel")) {
            if (pmf.GetFunction().equals("add_vaccine")) {
                Vaccine.setVaccineDateRange(VacMacDate, VacExpDate);
            } else if (pmf.GetFunction().equals("vaccine_info")) {
                VacLab.setText("Vaccine Information (Modifiable)");
                this.setTitle("Vaccine Record");
                AddVacRegBut.setText("Modify");
                CenNameCmb.setVisible(false);
                Vaccine.formatVaccine(VacIDTxt, VacNameTxt, VacOriginTxt, VacMacDate, VacExpDate);
                Vaccine.loadModVaccineInfo(VacIDTxt, VacNameTxt, VacOriginTxt, VacMacLab, VacExpLab, VacQuantitySpin, VacCNLab);
            }
        } else {
            VacLab.setText("Vaccine Information");
            this.setTitle("Vaccine Information");
            AddVacRegBut.hide();        
            VacQuantitySpin.setVisible(false);
            CenNameCmb.setVisible(false);
            Vaccine.formatVaccine(VacIDTxt, VacNameTxt, VacOriginTxt, VacMacDate, VacExpDate);
            Vaccine.loadVaccineInfo(VacIDTxt, VacNameTxt, VacOriginTxt, VacMacLab, VacExpLab, VacQttLab, VacCNLab);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VacOriginLab = new javax.swing.JLabel();
        AppVaccLab = new javax.swing.JLabel();
        VacIDTxt = new javax.swing.JTextField();
        VacQuantitySpin = new javax.swing.JSpinner();
        VacBackBut = new javax.swing.JButton();
        VacLab = new javax.swing.JLabel();
        AddVacRegBut = new javax.swing.JButton();
        VacMacDate = new com.toedter.calendar.JDateChooser();
        VacExpDateLab = new javax.swing.JLabel();
        VacExpDate = new com.toedter.calendar.JDateChooser();
        VacMaDateLab = new javax.swing.JLabel();
        VacNameLab = new javax.swing.JLabel();
        VacIDLab = new javax.swing.JLabel();
        VacOriginTxt = new javax.swing.JTextField();
        VacNameTxt = new javax.swing.JTextField();
        VacQuantityLab = new javax.swing.JLabel();
        VacMacLab = new javax.swing.JLabel();
        VacExpLab = new javax.swing.JLabel();
        VacQttLab = new javax.swing.JLabel();
        CenNameCmb = new javax.swing.JComboBox<>();
        VacCNLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaccine Registration");
        setMinimumSize(new java.awt.Dimension(530, 450));
        setPreferredSize(new java.awt.Dimension(530, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VacOriginLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacOriginLab.setText("Origin Country:");
        getContentPane().add(VacOriginLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 162, -1, -1));

        AppVaccLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AppVaccLab.setText("Centre Name:");
        getContentPane().add(AppVaccLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        VacIDTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        VacIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacIDTxtActionPerformed(evt);
            }
        });
        getContentPane().add(VacIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 94, 160, -1));

        VacQuantitySpin.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        VacQuantitySpin.setModel(new javax.swing.SpinnerNumberModel(100, 100, 2000, 50));
        getContentPane().add(VacQuantitySpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 160, -1));

        VacBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VacBackBut.setText("<");
        VacBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacBackButActionPerformed(evt);
            }
        });
        getContentPane().add(VacBackBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 11, -1, -1));

        VacLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        VacLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VacLab.setText("Vaccine Registration");
        getContentPane().add(VacLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, -1));

        AddVacRegBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AddVacRegBut.setText("Register");
        AddVacRegBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVacRegButActionPerformed(evt);
            }
        });
        getContentPane().add(AddVacRegBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 352, -1, -1));

        VacMacDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        getContentPane().add(VacMacDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 196, 160, -1));

        VacExpDateLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacExpDateLab.setText("Expired Date:");
        getContentPane().add(VacExpDateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 105, -1));

        VacExpDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        getContentPane().add(VacExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 227, 160, -1));

        VacMaDateLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacMaDateLab.setText("Manufacture Date:");
        VacMaDateLab.setToolTipText("");
        getContentPane().add(VacMaDateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 196, -1, -1));

        VacNameLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacNameLab.setText("Vaccine Name:");
        getContentPane().add(VacNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 129, -1, -1));

        VacIDLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacIDLab.setText("Vaccine ID:");
        getContentPane().add(VacIDLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 97, -1, 14));

        VacOriginTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        getContentPane().add(VacOriginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 162, 160, -1));

        VacNameTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        getContentPane().add(VacNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 129, 160, -1));

        VacQuantityLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacQuantityLab.setText("Quantity: ");
        getContentPane().add(VacQuantityLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        VacMacLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        VacMacLab.setOpaque(true);
        getContentPane().add(VacMacLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 160, 20));

        VacExpLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        VacExpLab.setOpaque(true);
        getContentPane().add(VacExpLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 160, 20));

        VacQttLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        VacQttLab.setOpaque(true);
        getContentPane().add(VacQttLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 160, 20));

        CenNameCmb.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        getContentPane().add(CenNameCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 160, -1));

        VacCNLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        VacCNLab.setOpaque(true);
        getContentPane().add(VacCNLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 160, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VacIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VacIDTxtActionPerformed

    private void VacBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacBackButActionPerformed
        GUI_Helper.switchFormComplex(this, new PersonnelMainForm(), new RecordVaccineForm());
    }//GEN-LAST:event_VacBackButActionPerformed

    private void AddVacRegButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVacRegButActionPerformed
        if (AddVacRegBut.getText().equals("Register")) {
            int error = Vaccine.validateVaccine(VacIDTxt.getText(), VacNameTxt.getText(), VacOriginTxt.getText());
            switch (error) {
                case 1:
                    JOptionPane.showMessageDialog(this, "Invalid Input\nPlease Check Again", "Message", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Vaccine Already Registered", "Message", JOptionPane.ERROR_MESSAGE);
                    break;
                default:
                    Vaccine.addVaccine(VacMacDate.getDate(), VacExpDate.getDate(), VacIDTxt.getText(), VacNameTxt.getText(), VacOriginTxt.getText(), VacQuantitySpin.getValue().toString(), CenNameCmb.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(this, "Vaccine Register Successfully");
                    GUI_Helper.switchForm(this, new PersonnelMainForm(), new PersonnelMainForm());
                    break;
            }
        } else if (AddVacRegBut.getText().equals("Modify")) {
            String newFile = Vaccine.modifyVaccine(VacIDTxt.getText(), VacQuantitySpin.getValue().toString(), CenNameCmb.getSelectedItem().toString());
            try {
                File vaccinefile = new File("vaccine.txt");
                FileWriter writer = new FileWriter(vaccinefile);
                writer.write(newFile);
                writer.close();
                JOptionPane.showMessageDialog(this, "Vaccine Updated Successfully");
                GUI_Helper.switchForm(this, new RecordVaccineForm(), new RecordVaccineForm());
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddVacRegButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccineForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVacRegBut;
    private javax.swing.JLabel AppVaccLab;
    private javax.swing.JComboBox<String> CenNameCmb;
    private javax.swing.JButton VacBackBut;
    private javax.swing.JLabel VacCNLab;
    private com.toedter.calendar.JDateChooser VacExpDate;
    private javax.swing.JLabel VacExpDateLab;
    private javax.swing.JLabel VacExpLab;
    private javax.swing.JLabel VacIDLab;
    private javax.swing.JTextField VacIDTxt;
    private javax.swing.JLabel VacLab;
    private javax.swing.JLabel VacMaDateLab;
    private com.toedter.calendar.JDateChooser VacMacDate;
    private javax.swing.JLabel VacMacLab;
    private javax.swing.JLabel VacNameLab;
    private javax.swing.JTextField VacNameTxt;
    private javax.swing.JLabel VacOriginLab;
    private javax.swing.JTextField VacOriginTxt;
    private javax.swing.JLabel VacQttLab;
    private javax.swing.JLabel VacQuantityLab;
    private javax.swing.JSpinner VacQuantitySpin;
    // End of variables declaration//GEN-END:variables
}
