package vaccinesystem;

import java.awt.Color;
import javax.swing.*;

public class LoginForm extends javax.swing.JFrame {

    //for storing the login user type and id
    private static String id;
    private static String login_name;

    //get set method for id and login_name
    public void SetID(String id) {
        this.id = id;
    }

    public String GetID() {
        return id;
    }

    public void SetName(String login_name) {
        this.login_name = login_name;
    }
    
    public String GetName() {
        return login_name;
    }

    public LoginForm() {
        initComponents();
        getContentPane().setBackground(new Color(225, 232, 232)); //set background color
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginBut = new javax.swing.JButton();
        LoginLab = new javax.swing.JLabel();
        UsernameLab = new javax.swing.JLabel();
        PasswordLab = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        PasswordPass = new javax.swing.JPasswordField();
        LoginBackBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaccine System Login");
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        LoginBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LoginBut.setText("Login");
        LoginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButActionPerformed(evt);
            }
        });

        LoginLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        LoginLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLab.setText("Login");

        UsernameLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        UsernameLab.setText("Name");

        PasswordLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PasswordLab.setText("IC/Passport");

        UsernameTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        PasswordPass.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        LoginBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        LoginBackBut.setText("<");
        LoginBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBackButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UsernameLab)
                        .addGap(71, 71, 71)
                        .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PasswordLab)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordPass, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(722, Short.MAX_VALUE)
                .addComponent(LoginBackBut)
                .addGap(39, 39, 39))
            .addComponent(LoginLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginBackBut)
                .addGap(28, 28, 28)
                .addComponent(LoginLab)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLab)
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLab)
                    .addComponent(PasswordPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(LoginBut)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButActionPerformed
        int error = AuthenticationHelper.login(UsernameTxt.getText(), PasswordPass.getText());
        switch (error) {
            case 1:
                JOptionPane.showMessageDialog(this, "Invalid Name/IC/Passport Number\nPlease Check Again", "Message", JOptionPane.ERROR_MESSAGE);
                UsernameTxt.setText("");
                PasswordPass.setText("");
                break;
            case 2: {
                this.SetName(UsernameTxt.getText());
                this.SetID(PasswordPass.getText());
                GUI_Helper.switchForm(this, new PeopleMainForm(), new PeopleMainForm());
                break;
            }
            case 3: {
                this.SetID("Personnel");
                GUI_Helper.switchForm(this, new PersonnelMainForm(), new PersonnelMainForm());
                break;
            }
            default:
                break;
        }
    }//GEN-LAST:event_LoginButActionPerformed

    private void LoginBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBackButActionPerformed
        GUI_Helper.switchForm(this, new HomePageForm(), new HomePageForm());
    }//GEN-LAST:event_LoginBackButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBackBut;
    private javax.swing.JButton LoginBut;
    private javax.swing.JLabel LoginLab;
    private javax.swing.JLabel PasswordLab;
    private javax.swing.JPasswordField PasswordPass;
    private javax.swing.JLabel UsernameLab;
    private javax.swing.JTextField UsernameTxt;
    // End of variables declaration//GEN-END:variables

    boolean GetID(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
