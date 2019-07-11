/*Hale Þahin
  150116841
  Homework3 Question2*/
  
/*To get an input from the user, import Scaner first.*/
import java.util.Scanner;

/*Determine the class*/
public class Hw3Q2 {

/*Use main method for this problem.*/
public static void main(String[] args) 	{
	
	/*Determine the scanner as input function to use it in the code anywhere.*/
	Scanner input = new Scanner(System.in);
	
	/*Determine the variable types*/
	int a,b,x;
    /* column = a;
       nthrow = b;
       totalrow = x;
    Make assignment in order to make easy to understand of calculations by us.*/
   
    /*Ask user for the size of shape.*/
    System.out.print("Give me an integer for the size of shape: ");
	/*Take the input as inputx.*/
	int inputx = input.nextInt() ;
    /*Convert inputx into x for the total number of rows in shape*/
    x = inputx*2-1;
 
 
 /////////////////////////////////////////////////////////////////////////////////////////////////////////   
    
   
    /*This loop for the upper triangle, b is the number of rows that will loop each time, from 1 to x/2+1(because only first half).*/
    for (b=1;b<=(x/2)+1;b++) {  
	
	   /*a is the column that in each number of b, a will travel from 1 to x-b.*/
	    for (a=1;a<=x-b;a++)
	
	/*It will make spaces at first until the first "*". */
	System.out.print("  ");
       
        /*t is determined to make first "*".For the upper triangle. */
	    for(int t=x;t>=0;t--){
 		   
 		   /*put "*" it just the (x-1)th column.*/
 		   if(t==x-1){
 			   System.out.print("*");
 		   } 
 	   } //closing bracelet for for loop of t.
	    
	       /*This is a for loop for the columns till the 2b+1. This will fill the inside of shape.*/
           for (a=1;a<=(2*b)+1;a++) {
        	       /*Make the second "*" at the other edge of triangle.But not for b=1, bacuse at for it makes second "*". */
        		   if((a==2*b-1) && (b > 1)){
        			   /*If it is in the even number of row, print just "*".*/
        			   if(b%2==0){
        				   System.out.print("*");
        			   }
        			   /*If odd number of row, make three space before "*".*/
        			   else{ 
        				   System.out.print("   *");
        				   
        			   } //closing bracelet for else.
        		   } //closing bracelet for bigger if loop.
        	   
        	   
        	   
	              /*If a=1 or a=2b , then do nothing.*/
	              if((a == 1)&&(a == 2*b)) {
	              	System.out.print("");
	              }
	              /*If a is not equal to 1 or 2b, then enter this loop.*/
	              else{
	              	
	                /*If the nth number of row is eve, lead this way.*/
	                if(b % 2 == 0){
                    
                    /*Make a loop for a till b-1.*/
                    while(a <= (b-1)) {
                   
                   /*For each loop, print one space and one "+" string.*/
                    System.out.print(" " + "+");
                    
                    /*If a<b-1, then print three spaces after the "+" string.*/
                    if(a < (b-1)){
                    System.out.print("  ");
                    }
                    /*But if a equals to b-1, that means it is the last string for this bth  row,print only one space after the string.*/
                    else if(a== b-1){
                    	System.out.print(" ");
                    }
                    /*Increase a with 1, for the loop.*/
                    a++;
	                }
	                 } //closing bracelet for bigger if loop.
	                /*But if number of row is odd, lead this way.*/ 
	                else if (b % 2 != 0) {
                  	
                  	/*Make a loop for columns till the b-2 for odd number of rows.*/
                  	while(a <= (b-2)) {
                    /*Print three spaces and after a string of "+". */               
                  	System.out.print("   " + "+");
                    /*Increase a with 1, for the loop.*/
                    a++;
                  	} //closing bracelet for last while loop.
	                } //closing bracelet for the last else if.
	              } //closing bracelet for the first else loop.
           } //closing bracelet for the last for loop.
    /*After the finish one row, make a new row in general for loop for rows.*/
    System.out.print("\n");
	} //closing bracelet for general for loop for the rows.
	
/////////////////////////////////////////////////////////////////////////	
	
	
          /*This loop for the lower triangle, b is the number of rows that will loop each time, from  x/2 to 1(because its second half).*/
          for (b=x/2;b>=1;b--) {
	          
	          /*a is the column that in each number of b, a will travel from 1 to x-b.*/	
	          for (a=1;a<=x-b;a++)
	          /*It will make spaces at first until the first "*". */
	          System.out.print("  ");
	             
	          /*t is determined to make first "*".For the upper triangle. */
	          for(int t=x;t>=0;t--){
          		   
          		   /*put "*" it just the (x-1)th column.*/
          		   if(t==x-1 ){
          		   System.out.print("*");
          		   }
          	      } //closing bracelet for the for loop of t.
               	
	       /*This is a for loop for the columns till the 2b+1. This will fill the inside of shape.*/
           for (a=1;a<=(2*b)+1;a++) {
        	       /*Make the second "*" at the other edge of triangle.But not for b=1, bacuse at for it makes second "*". */
        		   if((a==2*b-1) && (b > 1)){
        			   /*If it is in the even number of row, print just "*".*/
        			   if(b%2==0){
        				   System.out.print("*");
        			   }
        			   /*If odd number of row, make three space before "*".*/
        			   else{ 
        				   System.out.print("   *");
        				   
        			   } //closing bracelet for else.
        		   } //closing bracelet for bigger if loop.
        	   
        	   
	              /*If a=1 or a=2b , then do nothing.*/
	              if((a == 1)&&(a == 2*b)) {
	              	System.out.print("");
	              }
	              /*If a is not equal to 1 or 2b, then enter this loop.*/
	              else{
	              	
	                /*If the nth number of row is eve, lead this way.*/
	                if(b % 2 == 0){
                    
                    /*Make a loop for a till b-1.*/
                    while(a <= (b-1)) {
                   
                   /*For each loop, print one space and one "+" string.*/
                    System.out.print(" " + "+");
                    
                    /*If a<b-1, then print three spaces after the "+" string.*/
                    if(a < (b-1)){
                    System.out.print("  ");
                    }
                    /*But if a equals to b-1, that means it is the last string for this bth  row,print only one space after the string.*/
                    else if(a== b-1){
                    	System.out.print(" ");
                    }
                    /*Increase a with 1, for the loop.*/
                    a++;
	                }
	                 } //closing bracelet for bigger if loop.
	               
	                /*But if number of row is odd, lead this way.*/ 
	                else if (b % 2 != 0) {
                  	
                  	/*Make a loop for columns till the b-2 for odd number of rows.*/
                  	while(a <= (b-2)) {
                    /*Print three spaces and after a string of "+". */               
                  	System.out.print("   " + "+");
                    /*Increase a with 1, for the loop.*/
                    a++;
                  	} //closing bracelet for last while loop.
	                } //closing bracelet for the last else if.
	              } //closing bracelet for the first else loop.
           } //closing bracelet for the last for loop.
    /*After the finish one row, make a new row in general for loop for rows.*/
    System.out.print("\n");
	} //closing bracelet for general for loop for the rows.
	
            
          

} //closing bracelet for main method.
} //closing bracelet for class.

