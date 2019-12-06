package DataStructure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import BusinessLogic.Grade;
import java.util.LinkedList;

/**
 *
 * @author icbt
 */
public class Queue {
    private LinkedList theList;

    public Queue() {
        theList=new LinkedList();
    }
    
   public void insert(Grade g){
       theList.addLast(g);  // to add last
   }
    
   public Grade remove (){
       return (Grade)theList.removeFirst(); // removes the first item
   }
   
   public boolean isEmpty () {
       return theList.isEmpty();
   }
   
   public Grade peekFront () {
       return (Grade)theList.peekFirst();
   }
   
   public int size () {
       return theList.size();
   }
}
