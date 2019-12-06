package UserInterface;

import BusinessLogic.Grade;
import DatabaseConnection.GradeDB;
import javax.swing.JOptionPane;

public class AddMarksUI extends javax.swing.JFrame {
    
    GradeDB gdb = null;
    
    public AddMarksUI() {
        initComponents();
        setLocationRelativeTo(this);
        gdb = new GradeDB();
        setAccessPrivileges();
    }
    
    private void clearFields() {  //this method is for clearing text fields
        txt_stdId.setText("");
        combo_unitID.setSelectedIndex(0);
        txt_marks.setText("");
    }

    //this method is for establishing access privileges
    private void setAccessPrivileges() {
        if (!UserLevel.userLevel.equals("super user")) {
            btn_save.setEnabled(false);
        }
    }
    
    private boolean isValidForm() { //this method is for validation
        Validator v = new Validator();
        if (!v.isPresent(txt_stdId, "Student ID")) {
            return false;
        }
        if (!v.isPresent(txt_marks, "Marks")) {
            return false;
        }
        if (!v.isInteger(txt_marks, "Marks")) {
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
        btn_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_stdId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combo_unitID = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_marks = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
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

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        btn_close.setMnemonic('E');
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txt_stdId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_stdIdKeyPressed(evt);
            }
        });
        jPanel3.add(txt_stdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unit ID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        combo_unitID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jPanel3.add(combo_unitID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marks:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txt_marks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_marksKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_marksKeyTyped(evt);
            }
        });
        jPanel3.add(txt_marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 160, -1));

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/database_del.png"))); // NOI18N
        btn_save.setMnemonic('S');
        btn_save.setText("Save");
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 30));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close_but.gif"))); // NOI18N
        btn_cancel.setMnemonic('C');
        btn_cancel.setText("Cancel");
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        btn_clear.setMnemonic('L');
        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 250));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void txt_stdIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stdIdKeyPressed
        if (evt.getKeyCode() == 10) {
            txt_marks.grabFocus();
        }
        if (evt.getKeyCode() == 40) {
            txt_marks.grabFocus();
        }
    }//GEN-LAST:event_txt_stdIdKeyPressed

    private void txt_marksKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_marksKeyPressed
        if (evt.getKeyCode() == 38) {
            txt_stdId.grabFocus();
        }
    }//GEN-LAST:event_txt_marksKeyPressed

    private void txt_marksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_marksKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt_marks.getText().length() > 2) {  //The maximum length of the valid mark is 3
            evt.consume();
        }
    }//GEN-LAST:event_txt_marksKeyTyped

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearFields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if (isValidForm()) {
            int mark = Integer.parseInt(txt_marks.getText());
            if (mark <= 100 && mark >= 0) { //check entered mark is valid or not
                Grade g = new Grade(txt_stdId.getText(), Integer.parseInt(combo_unitID.getSelectedItem().toString()), Integer.parseInt(txt_marks.getText()));
                int result = gdb.addNewGrade(g);
                if (result == 1) {    // if added 
                    JOptionPane.showMessageDialog(btn_save, "New Grade is Added Successfully");
                } else {    // if not added
                    JOptionPane.showMessageDialog(btn_save, "New Grade is not Added.Some Error Occurred.");
                }
            } else {
                JOptionPane.showMessageDialog(txt_marks, "Marks should be between 0-100!!");
                txt_marks.grabFocus();
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(AddMarksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMarksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMarksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMarksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMarksUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    public static javax.swing.JButton btn_save;
    private javax.swing.JComboBox combo_unitID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_marks;
    private javax.swing.JTextField txt_stdId;
    // End of variables declaration//GEN-END:variables
}
