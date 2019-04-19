package Learning.Algorithms;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class MergeSortTest {
    public static void main(String[] args) {
        // create object to perform merge sort
        MergeSort sortArray = new MergeSort(10);

        // print unsorted array 
        System.out.println("Unsorted:" + sortArray + "\n");

        sortArray.sort(); // sort array

        // print sorted array
        System.out.println("Sorted: " + sortArray);
    } // end main
} // end class MergeSortTest
