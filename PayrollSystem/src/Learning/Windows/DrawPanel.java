//See description of this problem in Book: Java - How to program 9th edition(By Paul Deitel & Harvey Deitel)
//Page 
package Learning.Windows;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Marcelo
 */
public class DrawPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height=getHeight();
        
        //g.drawLine(0, 0, width/2, height/2);
        //g.drawLine(0, height, width, 0);
        g.drawLine(0, 0, 30, height-30);
        for(int i=0; i<=300; i +=15){
            //starting from the top-left 
            g.drawLine(0, 0, i, height-i);
            //starting from the bottom right
            g.drawLine(width, height, i, height-i);
            //starting from the top-right
            g.drawLine(width, 0, i, i);
            //starting from the bottom-left
            g.drawLine(0, height, i, i);
            
            
            

        }
    }
}
