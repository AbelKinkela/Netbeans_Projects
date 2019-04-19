/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Windows;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Marcelo
 */
public class DrawRainbow extends JPanel{
    //define indigo and violet
    private final static Color VIOLET= new Color(128, 0, 128);
    private final static Color INDIGO= new Color(75, 0, 130);
    
    //colors to use in the rainbow, starting from the innermost 
    //The two white entries results in an empty arc in the center
    private Color[] colors = {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN,
        Color.YELLOW, Color.ORANGE, Color.RED};
    
    //Constructor
    public DrawRainbow() {
        setBackground(Color.WHITE); //Set background to white when creating DrawRainbow object
    }//end of constructor
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int radius = 20;
        //draw the rainbow near the bottom center
        int centerX = getWidth()/2;
        int centerY = getHeight();
        
        //draws filled arc stating with the outermost
        for(int counter = colors.length; counter > 0; counter--){
            g.setColor(colors[counter-1]);
            
            //fill the arc from 0 to 180 degrees 
            g.fillArc(centerX - counter * radius, 
                    centerY - counter * radius, 
                    counter * radius * 2, 
                    counter * radius *2, 
                    0, 
                    360);
        }//end of for
        
    }//end method paintComponent
    
}//end class DrawRainbow
