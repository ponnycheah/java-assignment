package vaccinesystem;

import java.awt.Color;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;

public class ModifyPeopleForm extends javax.swing.JFrame {

    public ModifyPeopleForm() {
        initComponents();
        GUI_Helper.setBackground(this.getContentPane()); //set background color
        PModAddTxtArea.setLineWrap(true); //set address wrap text
        PModAddTxtArea.setWrapStyleWord(true); //set address wrap text
        PModICPLab.setBackground(new Color(240, 240, 240));       
        People.loadPeopleInfo(PModifyLab, this, PModICPLab, PModNameTxt, PModAgeSpin, PModGenderCmb, PModContNoTxt, PModEmailTxt, PModAddTxtArea);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PModModifyBut = new javax.swing.JButton();
        PModifyLab = new javax.swing.JLabel();
        PModNameTxt = new javax.swing.JTextField();
        PModEmailTxt = new javax.swing.JTextField();
        PModICLab = new javax.swing.JLabel();
        PModAddLab = new javax.swing.JLabel();
        PModAgeLab = new javax.swing.JLabel();
        PModNameLab = new javax.swing.JLabel();
        PModAgeSpin = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        PModAddTxtArea = new javax.swing.JTextArea();
        PModContNoLab = new javax.swing.JLabel();
        PModContNoTxt = new javax.swing.JTextField();
        PModGenderLab = new javax.swing.JLabel();
        PModBackBut = new javax.swing.JButton();
        PModGenderCmb = new javax.swing.JComboBox<>();
        PModEmailLab = new javax.swing.JLabel();
        PModICPLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");
        setResizable(false);

        PModModifyBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModModifyBut.setText("Modify");
        PModModifyBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PModModifyButActionPerformed(evt);
            }
        });

        PModifyLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        PModifyLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PModifyLab.setText("User Information (Modifiable)");

        PModNameTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        PModNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PModNameTxtActionPerformed(evt);
            }
        });

        PModEmailTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        PModICLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModICLab.setText("IC/Passport:");

        PModAddLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModAddLab.setText("Address:");

        PModAgeLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModAgeLab.setText("Age:");

        PModNameLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModNameLab.setText("Name:");

        PModAgeSpin.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        PModAgeSpin.setModel(new javax.swing.SpinnerNumberModel(18, 18, 80, 1));
        PModAgeSpin.setToolTipText("");

        PModAddTxtArea.setColumns(20);
        PModAddTxtArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        PModAddTxtArea.setRows(5);
        jScrollPane1.setViewportView(PModAddTxtArea);

        PModContNoLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModContNoLab.setText("Contact No:");

        PModContNoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        PModGenderLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModGenderLab.setText("Gender:");

        PModBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        PModBackBut.setText("<");
        PModBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PModBackButActionPerformed(evt);
            }
        });

        PModGenderCmb.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        PModGenderCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        PModEmailLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PModEmailLab.setText("Email:");

        PModICPLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        PModICPLab.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 452, Short.MAX_VALUE)
                .addComponent(PModBackBut)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PModNameLab)
                                    .addComponent(PModGenderLab)
                                    .addComponent(PModContNoLab))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PModICLab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PModContNoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PModNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(PModGenderCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PModAgeLab)
                                .addGap(18, 18, 18)
                                .addComponent(PModAgeSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PModICPLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PModAddLab)
                            .addComponent(PModEmailLab))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PModModifyBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PModEmailTxt)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PModifyLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PModBackBut)
                .addGap(3, 3, 3)
                .addComponent(PModifyLab)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PModICPLab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PModICLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PModNameLab)
                    .addComponent(PModNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PModGenderLab)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PModGenderCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PModAgeLab)
                        .addComponent(PModAgeSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PModContNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PModContNoLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PModEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PModEmailLab))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PModAddLab)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(PModModifyBut)
                .addGap(25, 25, 25))
        );

        setSize(new java.awt.Dimension(544, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PModNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PModNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PModNameTxtActionPerformed

    private void PModBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PModBackButActionPerformed
        GUI_Helper.switchForm(this, new RecordPeopleForm(), new PeopleMainForm());
    }//GEN-LAST:event_PModBackButActionPerformed

    private void PModModifyButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PModModifyButActionPerformed
        LoginForm lf = new LoginForm();
        RecordPeopleForm rpf = new RecordPeopleForm();

        int error = People.validatePeople("", "0", PModNameTxt.getText(), PModContNoTxt.getText(), PModEmailTxt.getText(), PModAddTxtArea.getText());

        //for people modification
        if (error != 0) {
            JOptionPane.showMessageDialog(this, "Invalid Input\nPlease Check Again", "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                File peoplefile = new File("people.txt");
                Scanner myReader = new Scanner(peoplefile);
                String path = peoplefile.getAbsolutePath();
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    //for user modifying own account
                    if (data.equals(lf.GetID())) {
                        People.modifyPeople(path, myReader.nextLine(), PModNameTxt.getText(), PModICPLab.getText());
                        People.modifyPeople(path, myReader.nextLine(), PModAgeSpin.getValue().toString(), PModICPLab.getText());
                        People.modifyPeople(path, myReader.nextLine(), PModGenderCmb.getSelectedItem().toString(), PModICPLab.getText());
                        People.modifyPeople(path, myReader.nextLine(), PModContNoTxt.getText(), PModICPLab.getText());
                        People.modifyPeople(path, myReader.nextLine(), PModEmailTxt.getText(), PModICPLab.getText());
                        People.modifyPeople(path, myReader.nextLine(), PModAddTxtArea.getText(), PModICPLab.getText());
                        JOptionPane.showMessageDialog(this, "Account Updated Successfully");
                        this.setVisible(false);
                        PeopleMainForm pmf = new PeopleMainForm();
                        pmf.setVisible(true);
                    //for personnel modifying selected user account
                    } else if (data.equals(rpf.GetSelected())) {
                        Personnel.modifyPeople(path, myReader.nextLine(), PModNameTxt.getText(), PModICPLab.getText());
                        Personnel.modifyPeople(path, myReader.nextLine(), PModAgeSpin.getValue().toString(), PModICPLab.getText());
                        Personnel.modifyPeople(path, myReader.nextLine(), PModGenderCmb.getSelectedItem().toString(), PModICPLab.getText());
                        Personnel.modifyPeople(path, myReader.nextLine(), PModContNoTxt.getText(), PModICPLab.getText());
                        Personnel.modifyPeople(path, myReader.nextLine(), PModEmailTxt.getText(), PModICPLab.getText());
                        Personnel.modifyPeople(path, myReader.nextLine(), PModAddTxtArea.getText(), PModICPLab.getText());
                        JOptionPane.showMessageDialog(this, "Account Updated Successfully");
                        this.setVisible(false);
                        RecordPeopleForm nrpf = new RecordPeopleForm();
                        nrpf.setVisible(true);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
            }
        }
    }//GEN-LAST:event_PModModifyButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyPeopleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PModAddLab;
    private javax.swing.JTextArea PModAddTxtArea;
    private javax.swing.JLabel PModAgeLab;
    private javax.swing.JSpinner PModAgeSpin;
    private javax.swing.JButton PModBackBut;
    private javax.swing.JLabel PModContNoLab;
    private javax.swing.JTextField PModContNoTxt;
    private javax.swing.JLabel PModEmailLab;
    private javax.swing.JTextField PModEmailTxt;
    private javax.swing.JComboBox<String> PModGenderCmb;
    private javax.swing.JLabel PModGenderLab;
    private javax.swing.JLabel PModICLab;
    private javax.swing.JLabel PModICPLab;
    private javax.swing.JButton PModModifyBut;
    private javax.swing.JLabel PModNameLab;
    private javax.swing.JTextField PModNameTxt;
    private javax.swing.JLabel PModifyLab;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
