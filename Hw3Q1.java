/*Hale Þahin
  150116841
  Homework3 Question1*/

//Determine the class.
public class Hw3Q1 {
	
	//Use main method for this class.
	public static void main(String[] args) {
		
		
		//Show only 100 palindrome prime numbers.
		int NUMBER_OF_PALPRIMES = 100;                  
        
        //Count will help to make loop 100 times.
        int count = 0;
        
        //Initialize the lowest prime and palindrome number.
        int number = 2;
        
        //Import user for the answer.
        System.out.println("The first 100 palindrome prime numbers are: \n");
        
             //Use while loop for the control prime and palindrome numbers.
             while(count < NUMBER_OF_PALPRIMES) {
        
            //Initialize the first number 2 is boolean true for prime and palindrome.
            boolean prime = true;
            boolean palindrome = true;
        
        
             //If a number have no divisor that its mode(%) is 0, till the half of the number,that means it has no divisorat the other half either.
             //Then that number is prime.
            //For loop to control whether a number is prime.
            for(int divisor = 2; divisor <= number / 2; divisor++){
        
        //if there is at least one divisor for this loop, make boolean false.
        if(number % divisor == 0) {
        prime = false; 
        	break;
        }    
        } //closing bracelet for the for loop.
        
        
        //A palindrome number must be equal the reverse of it.
        //First initialize reverse as 0.
        int reverse = 0;
        int num = number;
        
        
        //In while loop take the reverse of number, by making some calculations.
        while (num > 0) {
        //Find  last digit by taking mode 10 of number.
        int lastdigit = num % 10;
        
        //Reverse function is for each loop ten times of reverse and plus last digit.
        reverse = reverse * 10 + lastdigit;
        //Take the digits of number one by one.
        num = num / 10;
        } //closing bracelet for while loop.
        
        
        //Say if number equals to its reverse palindrome is true, otherwise fale.
        if(number == reverse){
        palindrome = true;
        }else{
        	palindrome = false;
        }
        
        //If number both prime and palindrome, print it and plus one for count.
        if(prime  && palindrome){
        count++;
        System.out.print(number + " ");
        
        
            //If printed numbers exceeds 10, activate this \n in order to go to the next row.
            if(count % 10 == 0){
            System.out.println("\n");
            }
      } 
      	
        //number plus one for each whole while(bigger one) loop.
        number++;
        } //closing bracelet for bigger while loop.
}
}
 


       
