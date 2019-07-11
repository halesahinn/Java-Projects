//Hale Þahin
//150116841
//Homework2

//Import Scanner for the getting input.	
import java.util.Scanner;
public class HaleSahin {
public static void main(String[] args) {
   //Method for the getting input from Scanner. 
   Scanner input = new Scanner(System.in);
   
   //Let the user choose a shape. 
   System.out.println("Which shape you wonder its area?\nPlease choose a number\n1 for Triangle,\n2 for Rectangle,\n3 for Square,\n4 for Circle. "); 
   
   //Identify a number for specific shapes. And let them be different cases. 
   int shapeNumber = input.nextInt();
   
   //Define area has a double variable type.
   double area;
   
   //Use switch-case command for different cases.It makes you choose a situation.
   switch(shapeNumber) {
   
   //if it is triangle, lead this way.
   	case 1:	
   
   //Take three inputs for the three edge of triangle respectively.
   System.out.println("Give me the edges of triangle as k,l and m: ");
   
   //Define the input variable as double in order to be able to get float point numbers.
   double k = input.nextDouble();
   double l = input.nextDouble();
   double m = input.nextDouble();
   
   //Check if the variables are invalid to be a triangle!.
   if((Math.abs(l - m) < k) && (k < (l + m)) && (Math.abs(k - m)< l) && (l < (k + m)) && (Math.abs(k - l) < m) && (m < (k + l))) {
   
   //A new variable is assigned which is needed for the calculations of area of triangle.
   double p = (k + l + m) / 2;
   
   //Calculate area according to the this formula.Do operations regarding to precedence.
   area = Math.sqrt(p * (p-k) * (p-l) * (p-m));
   
   //Give output with the appropriate string.
   System.out.println("Your area is: " + area);
   }else{
   
   //else means at the if statement, the boolean expression is false, so the values dont form a triangle. Then, output says they are invalid.
   System.out.println("You gave me invalid values. Please check and try again.");
   }
   
   //If at the first input it says 1, then execute case 1 and break till see break.It will not be reexecuted after its done the first time.
   break;
   
   //if it is rectangle, lead this way.
   case 2:
   
   //Ask user for the two inputs as the edges of rectangle.
   System.out.println("Give me the edge values of rectangle as x and y: ");
   
   //Two inputs with the double variable type.
   double x = input.nextDouble();
   double y = input.nextDouble(); 
   
   //Calculate the area by following the formula.
   area = x * y;
   
   //Give output area with the written string.
   System.out.println("Your area is: " + area);
   
   //break the case 2. Go out from switch and continue the next statement if exists.
   break;
   
   //if it is square, lead this way.
   case 3: 
   
   //Take one input for the square.
   System.out.println("Give me one edge of square: ");
   double z = input.nextDouble();
   
   //Calculate the area with the following formula.
   area = z * z;
   System.out.println("Your area is: " + area);
   
   //break this case and out from switch.
   break;
   
   //if it is circle, lead this way.
   case 4: 
   
   //Take one input for the radius.
   System.out.println("Give me the radius of circle: ");
   double r = input.nextDouble();
   
   //Find area with given formula.  The value of PI is given as manual, it is optional.
   area = r * r * 3.14159;
   System.out.println("Your area is: " + area);
   
   //break case 4 and finish switch command.
   break;
   
   //if the input does not fit the cases given, lead the default way.
   default:
   	
   //Import the user that given number does not exist.	
   System.out.println("Error: invalid choice!.");
   
   //Closing bracelet for whole switch.
   }
   
   //This will be executed each run.
   System.out.println("Program ends.\nBye.");
  
  //Closing bracelet for the main method and the following one for the class.
  }  	
}