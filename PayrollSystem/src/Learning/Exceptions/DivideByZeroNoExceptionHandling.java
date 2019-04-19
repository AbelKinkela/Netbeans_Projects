/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Exceptions;
import java.util.Scanner;
/**
 *
 * @author Marcelo
 */
public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int demominator){
        return numerator / demominator;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter an integer Numerator: ");
        int numerator = s.nextInt();
        System.out.print("Please enter an integer Denominator: ");
        int demominator = s.nextInt();
        
        int result = quotient(numerator, demominator);
        System.out.printf("\nResult: %d : %d = %d\n", numerator,demominator,result);
        
    }
}
