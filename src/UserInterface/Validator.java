package UserInterface;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class Validator {

    //this method is for mandatory field validation
    public boolean isPresent(JTextComponent c, String FieldName) {  
        if (c.getText().length() == 0) {
            JOptionPane.showMessageDialog(c, FieldName + " should not be empty!!!!");
            c.requestFocusInWindow();
            return false;
        }
        return true;
    }    

    //this method is for validate integer values
    public boolean isInteger(JTextComponent c, String fieldName) {  
        try {
            int i = Integer.parseInt(c.getText());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(c, fieldName + " must be an Integer");
            c.requestFocusInWindow();
            return false;
        }
    }          
}
