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
public class SalariedEmployee extends Employee {
    
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        setWeeklySalary(weeklySalary);
    }

    public double getWeeklySalary() {
        return this.weeklySalary;
    }

    //-set salary
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary >= 0)this.weeklySalary = weeklySalary;
        else throw new IllegalArgumentException ("Weekly salary must be > 0.0");
    }//end of method setWeeklySalary

    @Override
    public double earnings(){
        return getWeeklySalary();
    }
    
    @Override
    public String toString(){
        return String.format("Salaried Employee: %sWeekly Salary: $%,.2f\n", super.toString(), getWeeklySalary());
    }
}
