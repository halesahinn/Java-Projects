//Hale Þahin
//150116841
//Homework2

//Import to use JOptionPane in this class.
import javax.swing.JOptionPane;
public class HaleSahin2 {
	public static void main(String[] args) {

	//First, take three inputs. Use JOptionPane, take string and convert it into double variable type.
	String inputx = JOptionPane.showInputDialog(null, " Give me the first edge: ");
	double x = Double.parseDouble(inputx);
	
	String inputy = JOptionPane.showInputDialog(null, " Give me the second edge: ");
	double y = Double.parseDouble(inputy);
	
	String inputz = JOptionPane.showInputDialog(null, " Give me the third edge: "); 
	double z = Double.parseDouble(inputz);
	
    //Use if statement for the condition and if condition true its loop will execute, if not it skips the end of loop.
	if((Math.abs(y-z) < x) && (x < (y+z)) && (Math.abs(x-z) < y) && (y < (x+z)) && (Math.abs(x-y) < z) && (z < (x+y))) {
	
	//Define a double value p as perimeter of triangle. Write its formula.
	double per = x + y + z;
	
	//Give output of area with the string written.
	JOptionPane.showMessageDialog(null,"The perimeter of the triangle is: " + per);
    //Closing bracelet for if statement.
	}
	//else statement for the condition that the boolean expresion in if statement is false.
	else{
    
    //Give output string that the values do not form a triangle.
	JOptionPane.showMessageDialog(null,"You entered invalid numbers.");	
	}
//Closing bracelets for method and class.
}
}