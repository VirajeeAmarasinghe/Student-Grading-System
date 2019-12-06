package DatabaseConnection;

import BusinessLogic.Grade;
import DataStructure.Queue;
import UserInterface.AddMarksUI;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GradeDB {

    private Connection cn;

    public GradeDB() {  // to create connection with the database
        try {
            cn = DriverManager.getConnection("jdbc:ucanaccess://login.accdb");
        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /*
     this method is for inserting new marks record to the Database.
     first it checks whether eneterd student id and unit id are available in the database or not.
     If available error message will come. If not insertion is done.
     */
    public int addNewGrade(Grade g) {
        int result = 0;
        try {
            String select = "select * from Grade where StudentID=? and UnitID=?";
            PreparedStatement p = cn.prepareStatement(select);
            p.setString(1, g.getStudentID());
            p.setInt(2, g.getUnitID());
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Entered Student ID and Unit ID are already available.New Mark Record was not added.");
                return 2;
            } else {
                String insert = "insert into Grade(StudentID,UnitID,Marks) values (?,?,?)";
                PreparedStatement ps = cn.prepareStatement(insert);
                ps.setString(1, g.getStudentID());
                ps.setInt(2, g.getUnitID());
                ps.setInt(3, g.getMarks());
                result = ps.executeUpdate();
                ps.close();
                return result;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(AddMarksUI.btn_save, e.getMessage());
            return 0;
        }

    }

    //this method is for retrieving data from database using student id
    public Queue getGrades(String sID) {
        Queue theQueue = new Queue();
        try {
            String select = "select * from Grade where StudentID = ?";
            PreparedStatement ps = cn.prepareStatement(select);
            ps.setString(1, sID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String studentID = rs.getString("StudentID");
                int unitID = rs.getInt("UnitID");
                int marks = rs.getInt("Marks");
                Grade g = new Grade(studentID, unitID, marks);
                theQueue.insert(g);
            }
            rs.close();
            ps.close();
            return theQueue;
        } catch (SQLException e) {
            e.getStackTrace();
            return theQueue;
        }
    }

    //This method is for retrieving all student mark records
    public ArrayList<Grade> getAllGrades() {   
        ArrayList<Grade> theList = new ArrayList<>();
        try {
            String select = "select * from Grade";
            PreparedStatement ps = cn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String studentID = rs.getString("StudentID");
                int unitID = rs.getInt("UnitID");
                int marks = rs.getInt("Marks");
                Grade g = new Grade(studentID, unitID, marks);
                theList.add(g);
            }
            rs.close();
            ps.close();
            return theList;
        } catch (SQLException e) {
            e.getStackTrace();
            return theList;
        }
    }
}
