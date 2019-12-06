package DataStructure;

import java.util.LinkedList;

public class TheStack {

    private LinkedList theList;

    public TheStack() {
        theList = new LinkedList(); //creating new object of LinkedList
    }

    public void push(char c) {  //This method is for Pushing an element onto the stack.
        theList.push(c);
    }

    public char pop() { /*This method is for Popping an element from the stack/
         removing and returning the first element of the stack
         */

        return (char) theList.pop();
    }

    public boolean isEmpty() {  //This method returns true if stack contains no elements.
        return theList.isEmpty();
    }

    /*This method is for Retrieving, but not removing, 
     the first element of the stack, or returns null if the stack is empty */
    public char peep() {
        return (char) theList.peekFirst();
    }
}
