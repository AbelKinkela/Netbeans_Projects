/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ClassesAndObjects;

/**
 *
 * @author Marcelo
 */
public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        
        //output string representation of time
        System.out.print("The inicial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The inicial standard-time is: ");
        System.out.println(time); //whenever the object is called where string is needed Java automatically calls the toString() method
        
        
        //change time and output the updated time
        
        time.setTime(13, 27, 6);
        System.out.print("The updated universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The updated standard-time is: ");
        System.out.println(time);
        
        //atempt to set the time with invalid input
        
        try {
            time.setTime(12, 30, 61);
        }
        catch( IllegalArgumentException e ) {
            System.out.printf("Exception: %s\n", e.getMessage());
        }
        
        
        
        
        
    }
}
