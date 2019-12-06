package UserInterface;

import BusinessLogic.Grade;
import DataStructure.Queue;
import DatabaseConnection.GradeDB;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GradeUI extends javax.swing.JFrame {

    private GradeDB gDB = null;
    private Queue theQueue = null;
    private DefaultTableModel tblModel = null;
    Validator v = null;

    public GradeUI() {
        initComponents();
        setLocationRelativeTo(this);

        gDB = new GradeDB();  // create new GradeDB object
        theQueue = null;

        tblModel = new DefaultTableModel();
        tblModel.addColumn("Student ID");
        tblModel.addColumn("Unit ID");
        tblModel.addColumn("Marks");

        v = new Validator();
    }

    private void clearFields() {  //this method is for clearing text fields
        txt_StuID.setText("");
        txt_avg.setText("");
        txt_fnlGrade.setText("");
        txt_tot.setText("");
    }

    private boolean isValidForm() { //this method is for validation
        Validator v = new Validator();
        if (!v.isPresent(txt_StuID, "Student ID")) {
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_StuID = new javax.swing.JTextField();
        txt_tot = new javax.swing.JTextField();
        txt_avg = new javax.swing.JTextField();
        txt_fnlGrade = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrade = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Marks:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Average Marks:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Final Grade:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel3.add(txt_StuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, -1));

        txt_tot.setEditable(false);
        txt_tot.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 160, -1));

        txt_avg.setEditable(false);
        txt_avg.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_avg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 160, -1));

        txt_fnlGrade.setEditable(false);
        txt_fnlGrade.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_fnlGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, -1));

        btn_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/database_del.png"))); // NOI18N
        btn_ok.setMnemonic('O');
        btn_ok.setText("Ok");
        btn_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 30));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close_but.gif"))); // NOI18N
        btn_cancel.setMnemonic('C');
        btn_cancel.setText("Cancel");
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        btn_close.setMnemonic('E');
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 30));

        tblGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Unit ID", "Marks"
            }
        ));
        jScrollPane1.setViewportView(tblGrade);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 390, 160));

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        btn_clear.setMnemonic('L');
        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 80, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 430));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearFields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if (isValidForm()) {
            String sid = txt_StuID.getText();
            theQueue = gDB.getGrades(sid);
            int tot = 0; //this variable is for storing total marks of the student
            double avg = 0.00; //this variable is for storing the average mark
            int count = 0;
            if (!theQueue.isEmpty()) {
                count = theQueue.size();   // gives the size of the queue (returns the number of items in the queue)
            }

            tblModel.setRowCount(0);

            if (theQueue != null && !theQueue.isEmpty()) {
                while (!theQueue.isEmpty()) {
                    Grade g = theQueue.remove();   // first item in the queue will be removed in every iteration

                    String stdid = g.getStudentID();
                    int unitid = g.getUnitID();
                    int marks = g.getMarks();

                    tblModel.addRow(new Object[]{stdid, unitid, marks});  // Add student ID, unit ID and marks to the table
                    tot = tot + marks;
                }

                avg = (double) tot / count;  // calculate the average marks

            }
            if (count > 0) {
                txt_tot.setText(String.valueOf(tot));

                NumberFormat nm = new DecimalFormat("0.##"); //format the Average value

                txt_avg.setText(nm.format(avg));

                //student must get an overall average of 50 or above to get the certificate
                if (avg >= 50) {    //check the average mark to get final grade
                    txt_fnlGrade.setText("Pass");
                } else {
                    txt_fnlGrade.setText("Fail");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Entered Student ID is not Available in the Database!!!");
                txt_StuID.grabFocus();
            }
            tblGrade.setModel(tblModel);
        }
    }//GEN-LAST:event_btn_okActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGrade;
    private javax.swing.JTextField txt_StuID;
    private javax.swing.JTextField txt_avg;
    private javax.swing.JTextField txt_fnlGrade;
    private javax.swing.JTextField txt_tot;
    // End of variables declaration//GEN-END:variables
}
