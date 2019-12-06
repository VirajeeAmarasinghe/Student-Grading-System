package DatabaseConnection;

import BusinessLogic.User;
import UserInterface.ChangePassword;
import UserInterface.NewUserRegistration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserDB {

    private Connection cn;

    public UserDB() {   // to establsh the connection to the database
        try {
            cn = DriverManager.getConnection("jdbc:ucanaccess://login.accdb");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    //this method is for retrieving login details according to user name
    public User getPassword(String username) {
        User u = null;  //object of User class
        try {
            String select = "select * from user where username=?";
            PreparedStatement ps = cn.prepareStatement(select);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String userName = rs.getString("username");
                String pwd = rs.getString("password");
                String userlevel = rs.getString("userlevel");
                u = new User(userName, pwd, userlevel); // passing arguments to the constructor
            }
            rs.close();
            ps.close();
            return u;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return u;
        }
    }

    /*
     this method is for updating passwords.
     first it checks whether eneterd user name is available in the database or not.
     If available updating is done. If not error message will come.
     */
    public int updatePassword(User u) {
        try {
            String selectSt = "select * from user where username=?";
            PreparedStatement ps = cn.prepareStatement(selectSt);
            ps.setString(1, u.getUsername());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String updateSt = "update user set password=? where username=?";
                PreparedStatement ps2 = cn.prepareStatement(updateSt);
                ps2.setString(1, u.getPassword());
                ps2.setString(2, u.getUsername());
                int result = ps2.executeUpdate();
                ps.close();
                ps2.close();
                return result;
            } else {
                JOptionPane.showMessageDialog(ChangePassword.btn_ok, "Entered User Name is not available.Password is not updated.");
                return 2;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return 0;
        }
    }

    /*
     this method is for deleting user.
     first it checks whether eneterd user name is available in the database or not.
     If available deleting is done. If not error message will come.
     */
    public int deleteUser(String userName) {
        try {
            String select = "select * from user where username=?";
            PreparedStatement p = cn.prepareStatement(select);
            p.setString(1, userName);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                String deleteSt = "delete * from user where username=?";
                PreparedStatement ps = cn.prepareStatement(deleteSt);
                ps.setString(1, userName);
                int result = ps.executeUpdate();
                ps.close();
                return result;
            } else {
                JOptionPane.showMessageDialog(null, "Entered User Name is not available.User was not Deleted.");
                return 2;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
    }

    /*
     this method is for inserting new user login details to the Database.
     first it checks whether eneterd user name is available in the database or not.
     If available error message will come. If not insertion is done.
     */
    public int addLoginData(User u) {
        try {
            String select = "select * from user where username=?";
            PreparedStatement p = cn.prepareStatement(select);
            p.setString(1, u.getUsername());
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Entered User Name is already available.New User was not added.");
                return 2;
            } else {
                String insertSt = "insert into user(username,password,userlevel)values(?,?,?)";
                PreparedStatement ps = cn.prepareStatement(insertSt);

                ps.setString(1, u.getUsername());
                ps.setString(2, u.getPassword());
                ps.setString(3, u.getUserLevel());

                int result = ps.executeUpdate();
                ps.close();
                return result;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(NewUserRegistration.btn_save, e.getMessage());
            return 0;
        }
    }
}
