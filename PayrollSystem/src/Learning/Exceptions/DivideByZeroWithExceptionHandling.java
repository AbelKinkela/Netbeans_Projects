/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Marcelo
 */
public class DivideByZeroWithExceptionHandling {
    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int demominator) throws ArithmeticException{
        return numerator / demominator; // possible division by zero
    }//end of method quotient
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed
        
        do{
            try{ // read two numbers and calculate quotient
                System.out.print("Please enter an integer Numerator: ");
                int numerator = s.nextInt();
                System.out.print("Please enter an integer Denominator: ");
                int demominator = s.nextInt();

                int result = quotient(numerator, demominator);
                System.out.printf("\nResult: %d : %d = %d\n", numerator,demominator,result);
                continueLoop = false; // input successful; end looping
            }//end try
            catch(InputMismatchException inputMismatchException){
                System.err.printf("\nException: %s\n", inputMismatchException);
                s.nextLine(); //discard input so user can try again
                System.out.println("You must enter integers. Please try again.\n");
            }//end catch

            catch(ArithmeticException arithmeticException){
                System.err.printf("\nException: %s\n", arithmeticException);
                System.out.println("Zero is an invalid Denominator\n");
            }//end catch
        }while(continueLoop);//end do...while
    }
}
