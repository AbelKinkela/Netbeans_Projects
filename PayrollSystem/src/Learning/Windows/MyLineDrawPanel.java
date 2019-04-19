/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Windows;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
/**
 *
 * @author Marcelo
 */
public class MyLineDrawPanel extends JPanel{
    private Random randomNumbers = new Random();
    private MyLine [] lines; //array of lines
    
    public MyLineDrawPanel(){
        setBackground(Color.WHITE);
        
        lines = new MyLine[5 + randomNumbers.nextInt(10)];
        
        //create new lines
        for(int count = 0; count < lines.length; count++){
            //generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            
            //generate a random color
            Color myColor = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256));
            
            //add the lines to the list of lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, myColor);
        }//end for
    }//end MyLineDrawPanel constructor
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //draw lines
        for(MyLine line : lines){
            line.draw(g);
        }//end for
    }//end method paintComponent
}//end class MyLineDrawPanel
