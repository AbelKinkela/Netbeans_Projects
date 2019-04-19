/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ArraysAndLists;

/**
 *
 * @author Marcelo
 */
public class VariableLength {
    public static double average(double...numbers){
        double total = 0.0;
        
        //variable length double...numbers is treated as an array
        //so we use an enhanced for loop to calculate its total
        for(double d: numbers){
            total += d;
        }
        return total/numbers.length;
    }//end of average()
    
    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
        
        System.out.printf("d1= %.1f\nd2= %.1f\nd3= %.1f\nd4= %.1f\n\n", d1,d2,d3,d4);
        
        //Call average with different number of parameters
        System.out.printf("Average of d1 and d2 is %.1f\n", average(d1, d2));
        System.out.printf("Average of d1, d2 and d3 is %.1f\n", average(d1, d2, d3));
        System.out.printf("Average of d1, d2, d3 and d4 is %.1f\n", average(d1, d2, d3, d4));
    }
}
