/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Windows;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author Marcelo
 */
public class MyLine {
    private int x1;//x-coordinate of first endpoint
    private int y1;//y-coordinate of first endpoint
    private int x2;//x-coordinate of second endpoint
    private int y2;//y-coordinate of second endpoint
    private Color myColor; //color of this shape

    public MyLine(int x1, int y1, int x2, int y2, Color myColor) {
        this.x1 = x1;// set x-coordinate of first endpoint
        this.y1 = y1;// set y-coordinate of first endpoint
        this.x2 = x2;// set x-coordinate of second endpoint
        this.y2 = y2;// set y-coordinate of second endpoint
        this.myColor = myColor; //set color of this shape
    }//end MyLine constructor
    
    //draw the line in the specified color
    public void draw(Graphics g){
        g.setColor(myColor);    
        g.drawLine(x1, y1, x2, y2);
    }//end method draw
    
    
}//end class MyLine
