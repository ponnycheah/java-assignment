package vaccinesystem;

import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RecordVaccineForm extends javax.swing.JFrame {

    private static String selected;

    public void SetSelected(String selected) {
        this.selected = selected;
    }

    public String GetSelected() {
        return selected;
    }

    public RecordVaccineForm() {
        initComponents();
        LoginForm lf = new LoginForm();
        GUI_Helper.setBackground(this.getContentPane()); //set background color
        VaccineTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //only allow selection of single row
        VaccineTable.setFocusable(false); //not allowing focus selection on single cell
        VaccineTable.getColumnModel().getColumn(0).setPreferredWidth(1); //set table column size
        
        if (lf.GetID().equals("Personnel") == false) {
            this.setLayout(null);
            VacViewModBut.setLocation(200, 380);
            VacViewModBut.setText("View");
            VacRemoveBut.hide();
        }
        Vaccine.loadVaccineTable((DefaultTableModel) VaccineTable.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VacViewModBut = new javax.swing.JButton();
        VacSearchBut = new javax.swing.JButton();
        VacRemoveBut = new javax.swing.JButton();
        VacIDTxt = new javax.swing.JTextField();
        VacIDLab = new javax.swing.JLabel();
        VacBackBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        VaccineTable = new javax.swing.JTable();
        VacRecLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaccine ");
        setResizable(false);

        VacViewModBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacViewModBut.setText("View/Modify");
        VacViewModBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacViewModButActionPerformed(evt);
            }
        });

        VacSearchBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacSearchBut.setText("Search");
        VacSearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacSearchButActionPerformed(evt);
            }
        });

        VacRemoveBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacRemoveBut.setText("Remove");
        VacRemoveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacRemoveButActionPerformed(evt);
            }
        });

        VacIDTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        VacIDLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VacIDLab.setText("Vaccine ID/Name:");

        VacBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VacBackBut.setText("<");
        VacBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacBackButActionPerformed(evt);
            }
        });

        VaccineTable.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccine ID", "Name", "Origin", "Centre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VaccineTable.setToolTipText("");
        VaccineTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(VaccineTable);
        if (VaccineTable.getColumnModel().getColumnCount() > 0) {
            VaccineTable.getColumnModel().getColumn(0).setResizable(false);
            VaccineTable.getColumnModel().getColumn(1).setResizable(false);
            VaccineTable.getColumnModel().getColumn(2).setResizable(false);
            VaccineTable.getColumnModel().getColumn(3).setResizable(false);
        }

        VacRecLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        VacRecLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VacRecLab.setText("Vaccine Records");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(VacBackBut)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(VacIDLab)
                                .addGap(27, 27, 27)
                                .addComponent(VacIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(VacSearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(VacViewModBut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(VacRemoveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(VacRecLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VacBackBut)
                .addGap(13, 13, 13)
                .addComponent(VacRecLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VacIDLab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VacIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VacSearchBut))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VacViewModBut)
                    .addComponent(VacRemoveBut))
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VacBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacBackButActionPerformed
        GUI_Helper.switchForm(this, new PersonnelMainForm(), new PeopleMainForm());
    }//GEN-LAST:event_VacBackButActionPerformed

    private void VacViewModButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacViewModButActionPerformed
        String selected_message = AuthenticationHelper.checkSelected(VaccineTable);
        if(selected_message.equals("Please select a record")){
            JOptionPane.showMessageDialog(this, selected_message, "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            this.SetSelected(selected_message);
            GUI_Helper.switchForm(this, new VaccineForm(), new VaccineForm());
        }
    }//GEN-LAST:event_VacViewModButActionPerformed

    private void VacSearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacSearchButActionPerformed
        String message = GUI_Helper.search(VacIDTxt.getText(), (DefaultTableModel) VaccineTable.getModel(), VaccineTable);
        if(message.equals("") == false){
            JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VacSearchButActionPerformed

    private void VacRemoveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacRemoveButActionPerformed
        String selected_message = AuthenticationHelper.checkSelected(VaccineTable);
        if(selected_message.equals("Please select a record")){
            JOptionPane.showMessageDialog(this, selected_message, "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            this.SetSelected(selected_message);
            String newFile = Vaccine.removeVaccine();
            try {
                File vaccinefile = new File("vaccine.txt");
                FileWriter writer = new FileWriter(vaccinefile);
                writer.write(newFile);
                writer.close();
            } catch (IOException e) {
            } finally {
                JOptionPane.showMessageDialog(this, "Vaccine Removed Successfully");
                GUI_Helper.switchForm(this, new RecordVaccineForm(), new RecordVaccineForm());
            }
        }
    }//GEN-LAST:event_VacRemoveButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordVaccineForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VacBackBut;
    private javax.swing.JLabel VacIDLab;
    private javax.swing.JTextField VacIDTxt;
    private javax.swing.JLabel VacRecLab;
    private javax.swing.JButton VacRemoveBut;
    private javax.swing.JButton VacSearchBut;
    private javax.swing.JButton VacViewModBut;
    private javax.swing.JTable VaccineTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
