/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.basic;

/**
 *
 * @author Marcelo
 */
public class Main{
public static boolean xor(int x, int y) {
    try {
        int r = 1/(x - y);
    } catch (RuntimeException e) {
        return false;
    }

    return true;
}
    public static void main(String[] args){
        System.out.println(xor(0, 1));
    }
}

