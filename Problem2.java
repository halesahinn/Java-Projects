/* Hale ÞAHÝN
   150116841
   Homework1*/
import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		
		//Take two inputs from the user by using scanner class.
		Scanner input = new Scanner(System.in);
		System.out.println("Give me two inputs: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		//Do the calculations and assign them in a variable.
		int x = a + b;
		int y = a - b;
		int z = a * b;
		int t = a / b;
		double u = a / b;
		int k = a % b;
		int m = b % a;
		
		//Want outputs from the program as you wish.
		System.out.println("a+b: " + x);
		System.out.println("a-b: " + y);
		System.out.println("a*b: " + z);
		System.out.println("a/b: " + t);
		System.out.println("a/b with floating-point: " + u);
		System.out.println("a%b: " + k);
		System.out.println("b&a: " + m);
	}
}