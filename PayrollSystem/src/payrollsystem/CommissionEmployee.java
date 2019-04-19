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
public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales ) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        if((rate>0.0)&& (rate < 1.0)) commissionRate = rate;
        else throw new IllegalArgumentException("Commission rate must be <= 1.0");
    }

    public void setGrossSales(double sales) {
        if(sales>=0.0) grossSales = sales;
        else throw new IllegalArgumentException("Gross sales must be > 0.0");
    }
    
    /**
     *
     * @return
     */
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString(){
        return String.format("Commission Employee: %sCommission Rate: %,.2f\nGross Sales: $%,.2f\n", super.toString(), getCommissionRate(), getGrossSales());
    }
}

