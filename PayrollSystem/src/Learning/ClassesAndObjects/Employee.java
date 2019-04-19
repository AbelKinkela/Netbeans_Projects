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
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }//end of Employee constructor
    
    public String toString(){
        return String.format("%s %s, Hired: %s, Birthdate: %s", firstName, lastName, birthDate, hireDate);
    }//end of method toString
    
    
}//end of class Employee
