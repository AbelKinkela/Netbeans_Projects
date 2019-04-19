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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, ssn, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if(salary >= 0.0) baseSalary = salary;
        else throw new IllegalArgumentException("Base salary must be >= 0.0");
    }
    
    
    
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
    
    @Override
    public String toString(){
        return String.format("Base - Salaried %sBase Salary: $%,.2f\n", super.toString(), getBaseSalary());
    }
}
