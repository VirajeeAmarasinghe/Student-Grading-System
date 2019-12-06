/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessLogic;

/**
 *
 * @author icbt
 */
public class Grade {
    private String studentID;
    private int unitID;
    private int marks;

    public Grade(String studentID, int unitID, int marks) {
        this.studentID = studentID;
        this.unitID = unitID;
        this.marks = marks;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    
}
