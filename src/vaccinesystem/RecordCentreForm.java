package vaccinesystem;

import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RecordCentreForm extends javax.swing.JFrame {

    //for storing the selected row
    private static String selected;

    //get set method for selected row
    public void SetSelected(String selected) {
        this.selected = selected;
    }

    public String GetSelected() {
        return selected;
    }

    public RecordCentreForm() {
        initComponents();
        LoginForm lf = new LoginForm();
        GUI_Helper.setBackground(this.getContentPane()); //set background color
        CentreTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //only allow selection of single row
        CentreTable.setFocusable(false); //not allowing focus selection on single cell
        CentreTable.getColumnModel().getColumn(1).setPreferredWidth(50); //set table column size
        CentreTable.getColumnModel().getColumn(2).setPreferredWidth(100); //set table column size
        if (lf.GetID().equals("Personnel") == false) {
            this.setLayout(null);
            CenViewModBut.setLocation(200, 340);
            CenViewModBut.setText("View");
            CenRemoveBut.hide();
        }
        Centre.loadCentreTable((DefaultTableModel) CentreTable.getModel());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenRemoveBut = new javax.swing.JButton();
        CenNameTxt = new javax.swing.JTextField();
        CenNameLab = new javax.swing.JLabel();
        CenBackBut = new javax.swing.JButton();
        CenViewModBut = new javax.swing.JButton();
        CenSearchBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CentreTable = new javax.swing.JTable();
        CentreRecLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centre");
        setPreferredSize(new java.awt.Dimension(530, 450));
        setResizable(false);

        CenRemoveBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenRemoveBut.setText("Remove");
        CenRemoveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenRemoveButActionPerformed(evt);
            }
        });

        CenNameTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        CenNameLab.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenNameLab.setText("Centre Name:");

        CenBackBut.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CenBackBut.setText("<");
        CenBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenBackButActionPerformed(evt);
            }
        });

        CenViewModBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenViewModBut.setText("View/Modify");
        CenViewModBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenViewModButActionPerformed(evt);
            }
        });

        CenSearchBut.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CenSearchBut.setText("Search");
        CenSearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenSearchButActionPerformed(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        CentreTable.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CentreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Centre Name", "Contact No.", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CentreTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(CentreTable);
        if (CentreTable.getColumnModel().getColumnCount() > 0) {
            CentreTable.getColumnModel().getColumn(0).setResizable(false);
            CentreTable.getColumnModel().getColumn(1).setResizable(false);
            CentreTable.getColumnModel().getColumn(2).setResizable(false);
        }

        CentreRecLab.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        CentreRecLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CentreRecLab.setText("Centre Records");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(CenBackBut))
            .addComponent(CentreRecLab, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CenNameLab)
                        .addGap(25, 25, 25)
                        .addComponent(CenNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CenSearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(CenViewModBut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(CenRemoveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(CenBackBut)
                .addGap(10, 10, 10)
                .addComponent(CentreRecLab)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CenNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CenNameLab)
                    .addComponent(CenSearchBut))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CenViewModBut)
                    .addComponent(CenRemoveBut))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CenBackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenBackButActionPerformed
        GUI_Helper.switchForm(this, new PersonnelMainForm(), new PeopleMainForm());
    }//GEN-LAST:event_CenBackButActionPerformed

    private void CenViewModButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenViewModButActionPerformed
        String selected_message = AuthenticationHelper.checkSelected(CentreTable);
        if(selected_message.equals("Please select a record")){
            JOptionPane.showMessageDialog(this, selected_message, "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            this.SetSelected(selected_message);
            GUI_Helper.switchForm(this, new CentreForm(), new CentreForm());
        }
    }//GEN-LAST:event_CenViewModButActionPerformed

    private void CenRemoveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenRemoveButActionPerformed
        String selected_message = AuthenticationHelper.checkSelected(CentreTable);
        if(selected_message.equals("Please select a record")){
            JOptionPane.showMessageDialog(this, selected_message, "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            this.SetSelected(selected_message);
            String newFile = Centre.removeCentre();
            try {
                File centrefile = new File("centre.txt");
                FileWriter writer = new FileWriter(centrefile);
                writer.write(newFile);
                writer.close();
            } catch (IOException e) {
            } finally {
                JOptionPane.showMessageDialog(this, "Centre Removed Successfully");
                GUI_Helper.switchForm(this, new RecordCentreForm(), new RecordCentreForm());
            }
        }
    }//GEN-LAST:event_CenRemoveButActionPerformed

    private void CenSearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenSearchButActionPerformed
        String message = GUI_Helper.search(CenNameTxt.getText(), (DefaultTableModel) CentreTable.getModel(), CentreTable);
        if(message.equals("") == false){
            JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CenSearchButActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordCentreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CenBackBut;
    private javax.swing.JLabel CenNameLab;
    private javax.swing.JTextField CenNameTxt;
    private javax.swing.JButton CenRemoveBut;
    private javax.swing.JButton CenSearchBut;
    private javax.swing.JButton CenViewModBut;
    private javax.swing.JLabel CentreRecLab;
    private javax.swing.JTable CentreTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
