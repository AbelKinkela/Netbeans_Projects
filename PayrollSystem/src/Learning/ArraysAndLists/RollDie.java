/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.ArraysAndLists;
import java.util.Random;
/**
 *
 * @author Marcelo
 */
public class RollDie {
    public static void main(String args[]){
    Random randomNumbers = new Random();//Random Number generator
    int frequency [] = new int[7]; //array of frequency counter
    
    //roll the die 6_000_000 times; use die value as frequency index
    for(int roll=1; roll <=6000000; roll++){
        ++frequency[1 + randomNumbers.nextInt(6)];
    }
    System.out.printf("%s%10s\n", "Face", "Frequency");
    
    for(int face=1; face<frequency.length; face++){
        System.out.printf("%4d%10d\n", face, frequency[face]);//ignoring the index 0 of the array
    }
}
}
