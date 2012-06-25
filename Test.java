/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Owner
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("yo yo yo");
        // TODO code application logic here
        
        double someNum = 4;
        test2 Bob = new test2(someNum);
        someNum=Bob.result;
        System.out.println("Your result is: " + someNum);
        double otherNum = Bob.divide(55);
        System.out.println("The other result is: " + otherNum);
        
        
    }
}
