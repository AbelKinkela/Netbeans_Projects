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
public class EmployeeStaticTest {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d\n", EmployeeStatic.getCount());
        
        //create 2 employees, count should be 2
        EmployeeStatic employee1 = new EmployeeStatic("Abel", "Kinkela");
        EmployeeStatic employee2 = new EmployeeStatic("John", "Simon");
        
        //show that count is 2 after creating 2 employees
        System.out.print("\nEmployees after instantiation: \n");
        System.out.printf("via employee1.getCount(): %d\n", employee1.getCount());
        System.out.printf("via employee2.getCount(): %d\n", employee2.getCount());
        
        
        employee1 = null;
        employee2 = null;
    }
}
