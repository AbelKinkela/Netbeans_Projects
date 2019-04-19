/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Marcelo
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        if(wage>=0.0) this.wage=wage;
        else throw new IllegalArgumentException("Wage must be > 0.0");
    }

    public void setHours(double hoursWorked) {
        if((hoursWorked >=0.0)&& (hoursWorked <= 168.0)) hours = hoursWorked;
        else throw new IllegalArgumentException("Hours worked must be <= 168.0");
    }
    
    @Override
    public double earnings(){
        if(getHours() <= 40.0) return  getWage() * getHours();
        else return 40.0* getWage() + (getHours() - 40.0 )* getWage() * 1.5;

    }
    @Override
    public String toString() {
        return String.format("Hourly Employee: %sHours Worked: %,.2f hours\nWage: $%,.2f\n", super.toString(), getHours(), getWage());
    }
    
    
}
