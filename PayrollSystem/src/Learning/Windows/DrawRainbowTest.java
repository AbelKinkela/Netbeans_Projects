/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Windows;
import javax.swing.JFrame;

/**
 *
 * @author Marcelo
 */
public class DrawRainbowTest {
    public static void main(String[] args) {
    DrawRainbow rainbow = new DrawRainbow();
    JFrame application = new JFrame();
    
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(rainbow);
    
    application.setSize(400, 450);
    application.setVisible(true);
    }//end main

}//end class DrawRainbowTest
