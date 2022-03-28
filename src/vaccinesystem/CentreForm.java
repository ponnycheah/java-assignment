package vaccinesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CentreForm extends javax.swing.JFrame {

    public CentreForm() {
        initComponents();
        LoginForm lf = new LoginForm();
        GUI_Helper.setBackground(this.getContentPane()); //set background color
        CenAddressTxtArea.setLineWrap(true); //set address wrap text
        CenAddressTxtArea.setWrapStyleWord(true); //set address wrap text
        //for changing button text based on the user type and selected funtion
        if (lf.GetID().equals("Personnel")) {
            PersonnelMainForm pmf = new PersonnelMainForm();
            if (pmf.GetFunction().equals("add_centre")) {
                CenRegBut.setText("Register");
            } else if (pmf.GetFunction().equals("centre_info")) {
                CenLab.setText("Centre Information (Modifiable)");
                this.setTitle("Centre Record");
                CenRegBut.setText("Modify");
                Centre.formatCentre(CenNameTxt, CenAddressTxtArea, jScrollPane1);
                Centre.loadCentreInfo(CenNameTxt, CenContTxt, CenAddressTxtArea);
            }
        } else {
            CenLab.setText("Centre Information");
            this.setTitle("Centre Information");
            CenRegBut.hide();
            CenContTxt.setEditable(false);
            CenContTxt.setBorder(null);
            Centre.formatCentre(CenNameTxt, CenAddressTxtArea, jScrollPane1);
            Centre.loadCentreInfo(CenNameTxt, CenContTxt, CenAddressTxtArea);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenContLab = new javax.swing.JLabel();
        CenAddressLab = new javax.swing.JLabel();
        CenNameLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CenAddressTxtArea = new javax.swing.JTextArea();
        CenRegBut = new javax.swing.JButton();
        CenContTxt = new javax.swing.JTextField();
        CenBackBut = new javax.swing.JButton();
        CenNameTxt = new javax.swing.JTextField();
        CenLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centre Registration");
        setPreferredSize(new java.awt.Dimension(530, 450));
        setResizable(false);

        CenContLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenContLab.setText("Contact No:");

        CenAddressLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenAddressLab.setText("Address:");
        CenAddressLab.setToolTipText("");

        CenNameLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenNameLab.setText("Centre Name:");

        CenAddressTxtArea.setColumns(20);
        CenAddressTxtArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CenAddressTxtArea.setRows(5);
        jScrollPane1.setViewportView(CenAddressTxtArea);

        CenRegBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenRegBut.setText("Register");
        CenRegBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenRegButActionPerformed(evt);
            }
        });

        CenContTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        CenBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CenBackBut.setText("<");
        CenBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenBackButActionPerformed(evt);
            }
        });

        CenNameTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        CenLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        CenLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenLab.setText("Centre Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CenNameLab)
                    .addComponent(CenContLab)
                    .addComponent(CenAddressLab))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(CenContTxt)
                    .addComponent(CenNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CenRegBut))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addComponent(CenBackBut)
                .addGap(33, 33, 33))
            .addComponent(CenLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CenBackBut)
                .addGap(4, 4, 4)
                .addComponent(CenLab)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CenNameLab)
                    .addComponent(CenNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CenContLab)
                    .addComponent(CenContTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CenAddressLab)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(CenRegBut)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CenRegButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenRegButActionPerformed
        //determine register or modify function based on button text
        if (CenRegBut.getText().equals("Register")) {
            int error = Centre.validateCentre(CenNameTxt.getText(), CenContTxt.getText(), CenAddressTxtArea.getText());

            switch (error) {
                case 1:
                    JOptionPane.showMessageDialog(this, "Invalid Input\nPlease Check Again", "Message", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Centre Already Registered", "Message", JOptionPane.ERROR_MESSAGE);
                    CenNameTxt.setText("");
                    CenContTxt.setText("");
                    CenAddressTxtArea.setText("");
                    break;
                default:
                    Centre.addCentre(CenNameTxt.getText(), CenContTxt.getText(), CenAddressTxtArea.getText());
                    JOptionPane.showMessageDialog(this, "Centre Register Successfully");
                    GUI_Helper.switchForm(this, new PersonnelMainForm(), new PersonnelMainForm());
                    break;
            }
        } else if (CenRegBut.getText().equals("Modify")) {
            String olddata = CenNameTxt.getText();
            int error = AuthenticationHelper.validateModCentre(CenContTxt.getText());

            if (error != 0) {
                JOptionPane.showMessageDialog(this, "Invalid Input\nPlease Check Again", "Message", JOptionPane.ERROR_MESSAGE);
            } else {
                String newFile = Centre.modifyCentre(CenContTxt.getText(), olddata);
                File centrefile = new File("centre.txt");

                try {
                    FileWriter writer = new FileWriter(centrefile);
                    writer.write(newFile);
                    writer.close();
                } catch (IOException e) {
                } finally {
                    JOptionPane.showMessageDialog(this, "Centre Updated Successfully");
                    GUI_Helper.switchForm(this, new RecordCentreForm(), new RecordCentreForm());
                }
            }
        }
    }//GEN-LAST:event_CenRegButActionPerformed

    private void CenBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenBackButActionPerformed
        GUI_Helper.switchFormComplex(this, new PersonnelMainForm(), new RecordCentreForm());
    }//GEN-LAST:event_CenBackButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CenAddressLab;
    private javax.swing.JTextArea CenAddressTxtArea;
    private javax.swing.JButton CenBackBut;
    private javax.swing.JLabel CenContLab;
    private javax.swing.JTextField CenContTxt;
    private javax.swing.JLabel CenLab;
    private javax.swing.JLabel CenNameLab;
    private javax.swing.JTextField CenNameTxt;
    private javax.swing.JButton CenRegBut;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
