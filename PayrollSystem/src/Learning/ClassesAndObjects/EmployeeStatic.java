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
public class EmployeeStatic {
    private String firstName;
    private String lastName;
    private static int count=0;

    public EmployeeStatic(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count; //increment static count of Employee, to track the number of objects created
        System.out.printf("Employee constructor: %s %s; Count = %d\n", firstName, lastName, count);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count; //return the number of employees created so far
    }
    
    
    
    
    
}
