
package payrollsystem;

/**
 *
 * @author Marcelo
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        
        employees[0] = new SalariedEmployee( "John", "Simon", "111-11-1111",800.00);
        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        
        System.out.println( "Employees processed polymorphically:\n" );
        
        for(Employee employee : employees){
            System.out.println(employee);
            // determine whether element is a BasePlusCommissionEmployee

            if(employee instanceof BasePlusCommissionEmployee){
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee baseSalariedemployee = (BasePlusCommissionEmployee)employee;
                baseSalariedemployee.setBaseSalary(1.10 * baseSalariedemployee.getBaseSalary());
                
                System.out.printf("New base salary with 10%% increase is: $%,.2f\n", baseSalariedemployee.getBaseSalary());
            }
            System.out.printf("Earned $%,.2f\n", employee.earnings());
        }
        
        for(Employee employee : employees){
            String classofObject = String.format("%s %s is a %s\n",employee.getFirstName(), employee.getLastName(), employee.getClass().getName());
            System.out.print(classofObject.replace("payrollsystem.", ""));
        
        
    }
}
}
