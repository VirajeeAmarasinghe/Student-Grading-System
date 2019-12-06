package UserInterface;

import DataStructure.TheStack;

public class Encryption {

    public static String encrypt(String pwd) {  // This method is to encrypt the password
        TheStack ts = new TheStack();  //create new Stack object

        for (int i = 0; i < pwd.length(); i++) {   // iterates acording to the number of characters of the String
            ts.push(pwd.charAt(i)); /* to return the character of the specified index and
             picks the character and pushes it to the end of the stack
             */

        }
        char[] encryptPwd = new char[pwd.length()]; //create an array,array size is length of the password
        int k = 0;  //this variable is for controlling the iteration of while loop
        while (!ts.isEmpty()) {  // this loop iterates until it becomes empty
            encryptPwd[k] = ts.pop();   /* return the value on the top of the stack and 
             assign that value to the specific index of the array
             */

            k++;
        }

        return String.valueOf(encryptPwd);
    }
}
