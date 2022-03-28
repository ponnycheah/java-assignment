package vaccinesystem;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class RecordPeopleForm extends javax.swing.JFrame {

    //for storing the selected row
    private static String selected;

    //get set method for selected row
    public void SetSelected(String selected) {
        this.selected = selected;
    }

    public String GetSelected() {
        return selected;
    }

    public RecordPeopleForm() {
        initComponents();
        getContentPane().setBackground(new Color(233, 242, 239)); //set background color
        PeopleTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //only allow selection of single row
        PeopleTable.setFocusable(false); //not allowing focus selection on single cell
        PeopleTable.getColumnModel().getColumn(0).setPreferredWidth(60); //set table column size
        PeopleTable.getColumnModel().getColumn(1).setPreferredWidth(120); //set table column size
        PeopleTable.getColumnModel().getColumn(2).setPreferredWidth(50); //set table column size
        Personnel.loadPeopleTable((DefaultTableModel) PeopleTable.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecViewModBut = new javax.swing.JButton();
        RecSearchBut = new javax.swing.JButton();
        RecICTxt = new javax.swing.JTextField();
        RecICLab = new javax.swing.JLabel();
        RecBackBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PeopleTable = new javax.swing.JTable();
        RecUserLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");
        setResizable(false);

        RecViewModBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        RecViewModBut.setText("View/Modify");
        RecViewModBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecViewModButActionPerformed(evt);
            }
        });

        RecSearchBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        RecSearchBut.setText("Search");
        RecSearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecSearchButActionPerformed(evt);
            }
        });

        RecICTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        RecICLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        RecICLab.setText("IC/Passport/Name:");

        RecBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        RecBackBut.setText("<");
        RecBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecBackButActionPerformed(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        PeopleTable.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PeopleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IC/Passport", "Name", "Contact No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PeopleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(PeopleTable);
        if (PeopleTable.getColumnModel().getColumnCount() > 0) {
            PeopleTable.getColumnModel().getColumn(0).setResizable(false);
            PeopleTable.getColumnModel().getColumn(1).setResizable(false);
            PeopleTable.getColumnModel().getColumn(2).setResizable(false);
        }

        RecUserLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        RecUserLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RecUserLab.setText("User Records");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RecBackBut)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(RecViewModBut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RecICLab)
                                .addGap(18, 18, 18)
                                .addComponent(RecICTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RecSearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(RecUserLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RecBackBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RecUserLab)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecICTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecICLab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecSearchBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(RecViewModBut)
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RecBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecBackButActionPerformed
        GUI_Helper.switchForm(this, new PersonnelMainForm(), new PersonnelMainForm());
    }//GEN-LAST:event_RecBackButActionPerformed

    private void RecViewModButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecViewModButActionPerformed
        String selected_message = AuthenticationHelper.checkSelected(PeopleTable);
        if(selected_message.equals("Please select a record")){
            JOptionPane.showMessageDialog(this, selected_message, "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            this.SetSelected(selected_message);
            GUI_Helper.switchForm(this, new ModifyPeopleForm(), new ModifyPeopleForm());
        }
    }//GEN-LAST:event_RecViewModButActionPerformed

    private void RecSearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecSearchButActionPerformed
        String message = GUI_Helper.search(RecICTxt.getText(), (DefaultTableModel) PeopleTable.getModel(), PeopleTable);
        if(message.equals("") == false){
            JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RecSearchButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordPeopleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PeopleTable;
    private javax.swing.JButton RecBackBut;
    private javax.swing.JLabel RecICLab;
    private javax.swing.JTextField RecICTxt;
    private javax.swing.JButton RecSearchBut;
    private javax.swing.JLabel RecUserLab;
    private javax.swing.JButton RecViewModBut;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
