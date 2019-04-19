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
public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1990);
        Date hire = new Date(3, 12, 2010);
        Employee employee = new Employee("Bob", "Christopher", birth, hire);
        System.out.printf("%s\n", employee);
    }
}
