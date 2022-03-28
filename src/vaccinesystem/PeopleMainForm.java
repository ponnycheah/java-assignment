package vaccinesystem;

import java.awt.Color;

public class PeopleMainForm extends javax.swing.JFrame {

    //for storing the selected function
    private static String function;

    //get set method for function
    public void SetFunction(String function) {
        this.function = function;
    }
    
    public String GetFunction() {
        return function;
    }
    
    public PeopleMainForm() {
        initComponents();
        LoginForm lf = new LoginForm();
        PplmWlcLab.setText("Welcome, " + lf.GetName());
        getContentPane().setBackground(new Color(228, 237, 242)); //set background color
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        PplmLogOutBut = new javax.swing.JButton();
        PplmWlcLab = new javax.swing.JLabel();
        PplmBookAppBut = new javax.swing.JButton();
        PplmVaccInformBut = new javax.swing.JButton();
        PplmMyAccBut = new javax.swing.JButton();
        PplmAppInformBut1 = new javax.swing.JButton();
        PplmCenInformBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Homepage");
        setResizable(false);

        PplmLogOutBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        PplmLogOutBut.setText("Log Out");
        PplmLogOutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PplmLogOutButActionPerformed(evt);
            }
        });

        PplmWlcLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        PplmWlcLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PplmWlcLab.setText("Welcome,");

        PplmBookAppBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PplmBookAppBut.setText("Book Appointment");
        PplmBookAppBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PplmBookAppButActionPerformed(evt);
            }
        });

        PplmVaccInformBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PplmVaccInformBut.setText("Vaccine");
        PplmVaccInformBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PplmVaccInformButActionPerformed(evt);
            }
        });

        PplmMyAccBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PplmMyAccBut.setText("My Account");
        PplmMyAccBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PplmMyAccButActionPerformed(evt);
            }
        });

        PplmAppInformBut1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PplmAppInformBut1.setText("My Appointment");
        PplmAppInformBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PplmAppInformBut1ActionPerformed(evt);
            }
        });

        PplmCenInformBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PplmCenInformBut.setText("Centre");
        PplmCenInformBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PplmCenInformButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PplmBookAppBut, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(PplmAppInformBut1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(PplmMyAccBut, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PplmCenInformBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PplmVaccInformBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PplmLogOutBut)
                .addGap(31, 31, 31))
            .addComponent(PplmWlcLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PplmLogOutBut)
                .addGap(23, 23, 23)
                .addComponent(PplmWlcLab)
                .addGap(18, 18, 18)
                .addComponent(PplmMyAccBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PplmAppInformBut1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PplmBookAppBut)
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PplmVaccInformBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PplmCenInformBut)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PplmLogOutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PplmLogOutButActionPerformed
        GUI_Helper.switchForm(this, new HomePageForm(), new HomePageForm());
    }//GEN-LAST:event_PplmLogOutButActionPerformed

    private void PplmVaccInformButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PplmVaccInformButActionPerformed
        GUI_Helper.switchForm(this, new RecordVaccineForm(), new RecordVaccineForm());
    }//GEN-LAST:event_PplmVaccInformButActionPerformed

    private void PplmMyAccButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PplmMyAccButActionPerformed
        GUI_Helper.switchForm(this, new ModifyPeopleForm(), new ModifyPeopleForm());
    }//GEN-LAST:event_PplmMyAccButActionPerformed

    private void PplmBookAppButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PplmBookAppButActionPerformed
        this.SetFunction("");
        GUI_Helper.switchForm(this, new AppointmentForm(), new AppointmentForm());
    }//GEN-LAST:event_PplmBookAppButActionPerformed

    private void PplmAppInformBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PplmAppInformBut1ActionPerformed
        this.SetFunction("info");
        GUI_Helper.switchForm(this, new RecordAppointmentForm(), new RecordAppointmentForm());
    }//GEN-LAST:event_PplmAppInformBut1ActionPerformed

    private void PplmCenInformButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PplmCenInformButActionPerformed
        GUI_Helper.switchForm(this, new RecordCentreForm(), new RecordCentreForm());
    }//GEN-LAST:event_PplmCenInformButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PplmAppInformBut1;
    private javax.swing.JButton PplmBookAppBut;
    private javax.swing.JButton PplmCenInformBut;
    private javax.swing.JButton PplmLogOutBut;
    private javax.swing.JButton PplmMyAccBut;
    private javax.swing.JButton PplmVaccInformBut;
    private javax.swing.JLabel PplmWlcLab;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
