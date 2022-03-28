package vaccinesystem;

import java.awt.Color;
import javax.swing.*;

public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
        CitAddTxtArea.setLineWrap(true); //set address wrap test
        CitAddTxtArea.setWrapStyleWord(true); //set address wrap test
        LoginForm lf = new LoginForm();
        //set background color based on different access method and user type
        if (lf.GetID() != null && lf.GetID().equals("Personnel")) {
            getContentPane().setBackground(new Color(233, 242, 239));
        } else {
            getContentPane().setBackground(new Color(225, 232, 232));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CitBut = new javax.swing.JButton();
        NonCitBut = new javax.swing.JButton();
        CitEnterInformLab1 = new javax.swing.JLabel();
        CitContNoLab = new javax.swing.JLabel();
        CitContNoTxt = new javax.swing.JTextField();
        CitEmailLab = new javax.swing.JLabel();
        CitEmailTxt = new javax.swing.JTextField();
        CitAddLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CitAddTxtArea = new javax.swing.JTextArea();
        CitGenderLab = new javax.swing.JLabel();
        CitGenderCmb = new javax.swing.JComboBox<>();
        CitRegBut = new javax.swing.JButton();
        CitRegLab = new javax.swing.JLabel();
        CitNameLab = new javax.swing.JLabel();
        CitNameTxt = new javax.swing.JTextField();
        CitICPassLab = new javax.swing.JLabel();
        CitICPassTxt = new javax.swing.JTextField();
        CitAgeLab = new javax.swing.JLabel();
        CitAgeSpin = new javax.swing.JSpinner();
        CitBackBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Registration");
        setBackground(new java.awt.Color(255, 226, 226));
        setPreferredSize(new java.awt.Dimension(530, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CitBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitBut.setText("Citizen");
        CitBut.setMaximumSize(new java.awt.Dimension(89, 23));
        CitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitButActionPerformed(evt);
            }
        });
        getContentPane().add(CitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 116, -1));

        NonCitBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        NonCitBut.setText("Non-Citizen");
        NonCitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NonCitButActionPerformed(evt);
            }
        });
        getContentPane().add(NonCitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 115, -1));

        CitEnterInformLab1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitEnterInformLab1.setText("Select Citizenship:");
        getContentPane().add(CitEnterInformLab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        CitContNoLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitContNoLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CitContNoLab.setText("Contact No:");
        getContentPane().add(CitContNoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, -1));

        CitContNoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        getContentPane().add(CitContNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 192, -1));

        CitEmailLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitEmailLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CitEmailLab.setText("Email:");
        getContentPane().add(CitEmailLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, -1));

        CitEmailTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CitEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitEmailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(CitEmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 192, -1));

        CitAddLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitAddLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CitAddLab.setText("Address:");
        getContentPane().add(CitAddLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 830, -1));

        CitAddTxtArea.setColumns(20);
        CitAddTxtArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CitAddTxtArea.setRows(5);
        jScrollPane1.setViewportView(CitAddTxtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 190, -1));

        CitGenderLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitGenderLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CitGenderLab.setText("Gender:");
        getContentPane().add(CitGenderLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, -1));

        CitGenderCmb.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CitGenderCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        CitGenderCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitGenderCmbActionPerformed(evt);
            }
        });
        getContentPane().add(CitGenderCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        CitRegBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitRegBut.setText("Register");
        CitRegBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitRegButActionPerformed(evt);
            }
        });
        getContentPane().add(CitRegBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 100, -1));

        CitRegLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        CitRegLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CitRegLab.setText("Registration Form");
        getContentPane().add(CitRegLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, -1));

        CitNameLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitNameLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CitNameLab.setText("Name:");
        getContentPane().add(CitNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, -1));

        CitNameTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CitNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(CitNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 191, -1));

        CitICPassLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitICPassLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CitICPassLab.setText("IC Number:");
        getContentPane().add(CitICPassLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 130, -1));

        CitICPassTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CitICPassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitICPassTxtActionPerformed(evt);
            }
        });
        getContentPane().add(CitICPassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 191, -1));

        CitAgeLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CitAgeLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CitAgeLab.setText("Age:");
        getContentPane().add(CitAgeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        CitAgeSpin.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CitAgeSpin.setModel(new javax.swing.SpinnerNumberModel(18, 18, 80, 1));
        CitAgeSpin.setToolTipText("");
        getContentPane().add(CitAgeSpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 58, -1));

        CitBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CitBackBut.setText("<");
        CitBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitBackButActionPerformed(evt);
            }
        });
        getContentPane().add(CitBackBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        setSize(new java.awt.Dimension(530, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitButActionPerformed
        CitICPassLab.setText("IC Number:");
        CitICPassTxt.setText("");
    }//GEN-LAST:event_CitButActionPerformed

    private void NonCitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NonCitButActionPerformed
        CitICPassLab.setText("Passport Number:");
        CitICPassTxt.setText("");
    }//GEN-LAST:event_NonCitButActionPerformed

    private void CitGenderCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitGenderCmbActionPerformed

    }//GEN-LAST:event_CitGenderCmbActionPerformed

    private void CitRegButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitRegButActionPerformed
        int error = People.validatePeople(CitICPassLab.getText(), CitICPassTxt.getText(), CitNameTxt.getText(), CitContNoTxt.getText(), CitEmailTxt.getText(), CitAddTxtArea.getText());

        switch (error) {
            case 1:
                JOptionPane.showMessageDialog(this, "Invalid Input\nPlease Check Again", "Message", JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Identification Number Invalid\nPlease Check Again", "Message", JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                {
                    JOptionPane.showMessageDialog(this, "Account Already Registered\nPlease Login", "Message", JOptionPane.ERROR_MESSAGE);
                    GUI_Helper.switchForm(this, new LoginForm(), new LoginForm());
                    break;
                }
            case 0:
                {
                    People.addPeople(CitICPassTxt.getText(), CitNameTxt.getText(), ((Integer) CitAgeSpin.getValue()).toString(), CitGenderCmb.getSelectedItem().toString(), CitContNoTxt.getText(), CitEmailTxt.getText(), CitAddTxtArea.getText());
                    JOptionPane.showMessageDialog(this, "Account Register Successfully");
                    GUI_Helper.switchForm(this, new PersonnelMainForm(), new LoginForm());
                    break;
                }
            default:
                break;
        }
    }//GEN-LAST:event_CitRegButActionPerformed

    private void CitNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitNameTxtActionPerformed

    }//GEN-LAST:event_CitNameTxtActionPerformed

    private void CitICPassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitICPassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitICPassTxtActionPerformed

    private void CitBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitBackButActionPerformed
        GUI_Helper.switchForm(this, new PersonnelMainForm(), new HomePageForm());
    }//GEN-LAST:event_CitBackButActionPerformed

    private void CitEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitEmailTxtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CitAddLab;
    private javax.swing.JTextArea CitAddTxtArea;
    private javax.swing.JLabel CitAgeLab;
    private javax.swing.JSpinner CitAgeSpin;
    private javax.swing.JButton CitBackBut;
    private javax.swing.JButton CitBut;
    private javax.swing.JLabel CitContNoLab;
    private javax.swing.JTextField CitContNoTxt;
    private javax.swing.JLabel CitEmailLab;
    private javax.swing.JTextField CitEmailTxt;
    private javax.swing.JLabel CitEnterInformLab1;
    private javax.swing.JComboBox<String> CitGenderCmb;
    private javax.swing.JLabel CitGenderLab;
    private javax.swing.JLabel CitICPassLab;
    private javax.swing.JTextField CitICPassTxt;
    private javax.swing.JLabel CitNameLab;
    private javax.swing.JTextField CitNameTxt;
    private javax.swing.JButton CitRegBut;
    private javax.swing.JLabel CitRegLab;
    private javax.swing.JButton NonCitBut;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
