/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Windows;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
/**
 *
 * @author Marcelo
 */
public class LabelDemo {
    public static void main(String[] args) {
        //create a label with plain text
        JLabel north = new JLabel("Abel Kinkela");
        
        //create an Icon from an image so we can put it on a JLabel
        ImageIcon img = new ImageIcon("abel.png");
        JLabel centerLabel = new JLabel(img);
        JLabel southLabel = new JLabel(img);
        
        southLabel.setText("You are in the south");
        
        //Create a frame to display the labels
        JFrame application = new JFrame("Images");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(north, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);
        
        application.setSize(500, 500);
        application.setVisible(true);
       
    }
}
