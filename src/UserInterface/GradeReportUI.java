package UserInterface;

import BusinessLogic.Grade;
import DataStructure.Queue;
import DatabaseConnection.GradeDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GradeReportUI extends javax.swing.JFrame {

    private DefaultTableModel tblmodel;
    private GradeDB gDB;
    private ArrayList<Grade> mkList;
    private Queue q=null;

    public GradeReportUI() {
        initComponents();
        tblmodel = new DefaultTableModel();
        tblmodel.addColumn("Student ID");
        tblmodel.addColumn("Unit ID");
        tblmodel.addColumn("Marks");
     
        tbl_marks.setModel(tblmodel);
        gDB = new GradeDB(); //creating new GradeDB object
        
        setLocationRelativeTo(this);        
    }
    
    private void loadData(){
            mkList = gDB.getAllGrades(); //initializing Arraylist object
        for (Grade g : mkList) {
            String sID = g.getStudentID();
            int unitId = g.getUnitID();
            int marks = g.getMarks();
            tblmodel.addRow(new Object[]{sID, unitId, marks});  // Add student ID, unit ID and marks to the table

            setLocationRelativeTo(this);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_marks = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_stID = new javax.swing.JButton();
        btn_uId = new javax.swing.JButton();
        btn_marks = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_loadData = new javax.swing.JButton();
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

        tbl_marks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Unit ID", "Marks"
            }
        ));
        jScrollPane1.setViewportView(tbl_marks);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 330));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 350));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_stID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_but.gif"))); // NOI18N
        btn_stID.setMnemonic('S');
        btn_stID.setText("Sort By Student ID");
        btn_stID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_stID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stIDActionPerformed(evt);
            }
        });
        jPanel4.add(btn_stID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        btn_uId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_but.gif"))); // NOI18N
        btn_uId.setMnemonic('U');
        btn_uId.setText("Sort By Unit ID");
        btn_uId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_uId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uIdActionPerformed(evt);
            }
        });
        jPanel4.add(btn_uId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, -1));

        btn_marks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_but.gif"))); // NOI18N
        btn_marks.setMnemonic('M');
        btn_marks.setText("Sort By Marks");
        btn_marks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_marks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marksActionPerformed(evt);
            }
        });
        jPanel4.add(btn_marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, -1));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find-icon.png"))); // NOI18N
        btn_search.setMnemonic('T');
        btn_search.setText("Search By Student ID");
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel4.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, -1));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close_but.gif"))); // NOI18N
        btn_cancel.setMnemonic('C');
        btn_cancel.setText("Cancel");
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel4.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));

        btn_loadData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/database_del.png"))); // NOI18N
        btn_loadData.setMnemonic('L');
        btn_loadData.setText("Load Data ");
        btn_loadData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDataActionPerformed(evt);
            }
        });
        jPanel4.add(btn_loadData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 30));

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel4.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, 170, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 190, 350));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_stIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stIDActionPerformed
        //Insertion Sort
        if(mkList!=null&&tbl_marks.getRowCount()>0){
           Object[] a = mkList.toArray();
        int nElems = a.length;
        int in, out;
        for (out = 1; out < nElems; out++) {
            Grade temp = (Grade) a[out];
            in = out;
            while (in > 0 && ((Grade) a[in - 1]).getStudentID().compareTo(temp.getStudentID()) > 0) {
                a[in] = a[in - 1];
                --in;

            }
            a[in] = temp;
        }
        //
        mkList.clear();
        //adding sorted elements to the ArrayList
        for (int i = 0; i < a.length; i++) {
            mkList.add((Grade) a[i]);
        }
        tblmodel.setRowCount(0);

        //Adding data to the table
        for (Grade g : mkList) {
            String sID = g.getStudentID();
            int unitId = g.getUnitID();
            int marks = g.getMarks();
            tblmodel.addRow(new Object[]{sID, unitId, marks});
        }     
        }else{
          JOptionPane.showMessageDialog(btn_stID,"First Load the Data");
        }
        
    }//GEN-LAST:event_btn_stIDActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        Object[] a = mkList.toArray(); //Returns an array containing all of the elements in this list in proper sequence (from first to last element).  
        String stdId = JOptionPane.showInputDialog("Enter the student ID");
        boolean result = recBinarySearch(stdId, a, 0, a.length - 1);
        
        if (result == true) {
            JOptionPane.showMessageDialog(rootPane, stdId + " Is found");
            tblmodel.setRowCount(0);
            //loading the records which are belong to the entered student id
            q = gDB.getGrades(stdId);
            if (q != null && !q.isEmpty()) {
                while (!q.isEmpty()) {
                    Grade g = q.remove();   // first item in the queue will be removed in every iteration

                    String stdid = g.getStudentID();
                    int unitid = g.getUnitID();
                    int marks = g.getMarks();
                    
                    tblmodel.addRow(new Object[]{stdid, unitid, marks});  // Add student ID, unit ID and marks to the table                    
                }
            }
            
            tbl_marks.setModel(tblmodel);
        } else {
            JOptionPane.showMessageDialog(rootPane, stdId + " Is not found");
            tblmodel.setRowCount(0);
        }        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDataActionPerformed
      loadData();
    }//GEN-LAST:event_btn_loadDataActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       tblmodel.setRowCount(0);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_uIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uIdActionPerformed
        //Insertion Sort
        if(mkList!=null&&tbl_marks.getRowCount()>0){
        Object[] a = mkList.toArray();
        int nElems = a.length;
        int in, out;
        for (out = 1; out < nElems; out++) {
            Grade temp = (Grade) a[out];
            in = out;
            while (in > 0 && ((Grade) a[in - 1]).getUnitID() >= temp.getUnitID()) {
                a[in] = a[in - 1];
                --in;

            }
            a[in] = temp;
        } 
        //
        mkList.clear();
        //adding sorted elements to the ArrayList
        for (int i = 0; i < a.length; i++) {
            mkList.add((Grade) a[i]);
        }
        tblmodel.setRowCount(0);
        //Adding data to the table
        for (Grade g : mkList) {
            String sID = g.getStudentID();
            int unitId = g.getUnitID();
            int marks = g.getMarks();
            tblmodel.addRow(new Object[]{sID, unitId, marks});

        }
        }else{
          JOptionPane.showMessageDialog(btn_uId,"First Load the Data");
        }
    }//GEN-LAST:event_btn_uIdActionPerformed

    private void btn_marksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marksActionPerformed
        //Insertion Sort
        if(mkList!=null&&tbl_marks.getRowCount()>0){
        Object[] a = mkList.toArray();
        int nElems = a.length;
        int in, out;
        for (out = 1; out < nElems; out++) {
            Grade temp = (Grade) a[out];
            in = out;
            while (in > 0 && ((Grade) a[in - 1]).getMarks() >= temp.getMarks()) {
                a[in] = a[in - 1];
                --in;

            }
            a[in] = temp;
        }
        //
        mkList.clear();
        //adding sorted elements to the ArrayList
        for (int i = 0; i < a.length; i++) {
            mkList.add((Grade) a[i]);
        }
        tblmodel.setRowCount(0);
        //Adding data to the table
        for (Grade g : mkList) {
            String sID = g.getStudentID();
            int unitId = g.getUnitID();
            int marks = g.getMarks();
            tblmodel.addRow(new Object[]{sID, unitId, marks});

        }
        }else{
          JOptionPane.showMessageDialog(btn_stID,"First Load the Data");
        }
    }//GEN-LAST:event_btn_marksActionPerformed

    // recursive binary search
    private boolean recBinarySearch(String stdId, Object[] a, int lower, int upper) {

        int nElem = a.length; // returns the number of elements in the array list and it is assigned to the nElems

        int curIn;
        curIn = (lower + upper) / 2;//calculate the mispoint of the current array
        if (((Grade) a[curIn]).getStudentID().equals(stdId)) { //found it!return from the method
            return true;
        } else if (lower > upper) {
            return false;
        } else {
            if (((Grade) a[curIn]).getStudentID().compareTo(stdId) < 0) { //value is in in upper half,if at all
                return recBinarySearch(stdId, a, curIn + 1, upper);
            } else { //value is in lower half,if at all
                return recBinarySearch(stdId, a, lower, curIn - 1);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(GradeReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeReportUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeReportUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_loadData;
    private javax.swing.JButton btn_marks;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_stID;
    private javax.swing.JButton btn_uId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_marks;
    // End of variables declaration//GEN-END:variables
}
