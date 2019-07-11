/* Hale ÞAHÝN
   150116841
   Homework1 */
import javax.swing.JOptionPane;
public class Problem1 {
	public static void main(String[] args) {
		
		/*Now we write a code that calculates the roots of second order polynomial function
		For this purpose we need three inputs as a,b and c.
		Let our function would be like; " a*x*x+b*x+c=0 " . */
	    /*If we get our inputs with JOptionPane , we will get them as Strings
		So they need a convertion into the variable type that we want.*/
		
		String aString = JOptionPane.showInputDialog(null, "Give me a: ");
		double a = Double.parseDouble(aString);
		
		String bString = JOptionPane.showInputDialog(null, "Give me b: ");
		double b = Double.parseDouble(bString);
		
		String cString = JOptionPane.showInputDialog(null, "Give me c: ");
		double c = Double.parseDouble(cString);
		
		//To calculate roots, we assign them as double.
		double x1 = (- b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		double x2 = (- b - Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		
		//We can show the answer as another dialog box.
		String answer = " The roots of the function ax2+bx+c=0 are; x1: " + x1 + " x2: " + x2;
		JOptionPane.showMessageDialog(null, answer);
	}
}