/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Arrays class methods and System.arraycopy
package Learning.ArraysAndLists;
import java.util.Arrays; 
/**
 *
 * @author Marcelo
 */
public class ClassArrays {
    public static void main(String[] args) {
        double doubleArray[] = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        
        System.out.printf("\ndoubleArray: ");
        //output the sorted array
        for(double value:  doubleArray){
            System.out.printf("%.1f ", value);
        }
        
        //fill 10-element araray with 7s
        int filledIntArray[] = new int [10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");
        
        //copy array intArray into array intArrayCopy
        int intArray[] = {1,2,3,4,5,6,7};
        int intArrayCopy[] = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");
        
        //compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy", (b ? "==":"!="));
        
        
        //compare intArray and filledIntArray for equality
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("\nintArray %s filledIntArray\n", (b ? "==":"!="));
        
        //Search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);
        
        if(location >=0){
            System.out.printf("Found 5 at element %d in intArray\n", location);
        }else{
            System.out.println("5 not found in intArray\n");
        }
        
        //Search intArray for the value 8763
        location = Arrays.binarySearch(intArray, 8763);
        System.out.printf("%s", (location >=0 ? "Found 8763 in intArray\n" : "8763 not found in intArray\n"));
              
    }//end of main
    
    public static void displayArray(int array[], String description){
        
        System.out.printf("\n%s: ", description);
        //output the sorted array
        for(int value:  array){
            System.out.printf("%d ", value);
        }
    }
    
}//end of ClassArrays
