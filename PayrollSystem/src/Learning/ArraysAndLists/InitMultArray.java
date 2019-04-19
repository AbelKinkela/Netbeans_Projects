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
public class InitMultArray {
    //output rows and columns of a two-dimentional array
    public static void outputArray(int [][] array){
        
        //loop through array's rows
        for( int[] array1 : array ) {
            //loop through array's columns
            for( int column = 0; column < array1.length; column++ ) {
                System.out.printf("%d  ", array1[column]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] array1 = {{1,2,3}, {4,5,6}};
        int [][] array2 = {{1,2},{3},{4,5,6}};
        
        System.out.println("\nValues of array1 by row are:");
        outputArray(array1);
        
        System.out.println("\nValues of array2 by row are:");
        outputArray(array2);
        
        
    }
}
