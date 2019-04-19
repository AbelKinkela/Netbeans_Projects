//See description of this problem in Book: Java - How to program 9th edition(By Paul Deitel & Harvey Deitel)
//Page 
package Learning.Windows;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcelo
 */
public class EnteringTextInADialogue {
    public static void main(String args[]){
        String number1=
                JOptionPane.showInputDialog(null, "Number1:?");
        String number2=
                JOptionPane.showInputDialog(null, "Number2:?");
        int n1= parseInt(number1);
        int n2= parseInt(number2);
        String message=
                String.format("%d + %d = %d", n1, n2, n1+n2 );
        JOptionPane.showMessageDialog(null, message);
        
    }
}
