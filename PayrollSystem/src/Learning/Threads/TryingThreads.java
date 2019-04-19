/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Threads;

/**
 *
 * @author Marcelo
 */
public class TryingThreads {
    public static void main(String[] args) {
        int a = 1;
        while(a < 10){
            System.out.println("Hello there "+ a);
            a--;
        }
    }
}
