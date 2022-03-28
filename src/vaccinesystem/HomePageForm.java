package vaccinesystem;

import java.awt.Color;

public class HomePageForm extends javax.swing.JFrame {

    public HomePageForm() {
        initComponents();
        getContentPane().setBackground(new Color(225, 232, 232)); //set background color
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        HpWelLab = new javax.swing.JLabel();
        HpRegisterBut = new javax.swing.JButton();
        HpLoginBut = new javax.swing.JButton();
        HpAccLab = new javax.swing.JLabel();
        HpSystemLab = new javax.swing.JLabel();
        HpExitBut = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page Form");
        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        HpWelLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        HpWelLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HpWelLab.setText("Welcome to Malaysia Vaccine System");

        HpRegisterBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        HpRegisterBut.setText("Register");
        HpRegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HpRegisterButActionPerformed(evt);
            }
        });

        HpLoginBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        HpLoginBut.setText("Login");
        HpLoginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HpLoginButActionPerformed(evt);
            }
        });

        HpAccLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        HpAccLab.setText("Please Login/Register to access more functions:");

        HpSystemLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        HpSystemLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HpSystemLab.setText("<html><p align = \"justify\">COVID-19 vaccines are being deployed in countries around the world, giving the worldwide pandemic a new lease on life. WHO, UNICEF, Gavi, and a number of other organisations are collaborating to help nations prepare for the launch of the COVID-19 vaccine. <br><br>With this platform, we ensure that all infrastructures are well prepared to safely deliver COVID-19 vaccines to all Malaysians and foreigners. \n<p style=\"font-size:90%;\">contact: +60-172078787<br/>email: my_covidvaccine@gmail.com</html>");
        HpSystemLab.setToolTipText("");

        HpExitBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        HpExitBut.setText("Exit");
        HpExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HpExitButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HpExitBut)
                .addGap(34, 34, 34))
            .addComponent(HpWelLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HpAccLab)
                        .addGap(18, 18, 18)
                        .addComponent(HpLoginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HpRegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HpSystemLab, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(HpExitBut)
                .addGap(20, 20, 20)
                .addComponent(HpWelLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HpSystemLab, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HpLoginBut)
                    .addComponent(HpRegisterBut)
                    .addComponent(HpAccLab))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HpRegisterButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HpRegisterButActionPerformed
        GUI_Helper.switchForm(this, new RegisterForm(), new RegisterForm());
    }//GEN-LAST:event_HpRegisterButActionPerformed

    private void HpLoginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HpLoginButActionPerformed
        GUI_Helper.switchForm(this, new LoginForm(), new LoginForm());
    }//GEN-LAST:event_HpLoginButActionPerformed

    private void HpExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HpExitButActionPerformed
        System.exit(0);
    }//GEN-LAST:event_HpExitButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HpAccLab;
    private javax.swing.JButton HpExitBut;
    private javax.swing.JButton HpLoginBut;
    private javax.swing.JButton HpRegisterBut;
    private javax.swing.JLabel HpSystemLab;
    private javax.swing.JLabel HpWelLab;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
