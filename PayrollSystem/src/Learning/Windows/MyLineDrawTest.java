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
public class MyLineDrawTest {
    public static void main(String[] args) {
        MyLineDrawPanel panel = new MyLineDrawPanel();
        
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
        
        application = null;
        panel = null;
    }
}
