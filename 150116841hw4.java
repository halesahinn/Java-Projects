import java.util.Scanner;
public class HW4 {
	
	
	public static void main(String[] args){
			//prompt user to choose a method.
			System.out.println("Choose a property according to the list :)  ");
			System.out.println("1-Contains  \t2-GiveDigits\n3-ReplaceAll  \t4-CompareTo  \t5-Quit");
			Scanner input = new Scanner(System.in);
			//use scanner to get input from user
			int x = input.nextInt();		
            //This is needed for getting string inputs after int inputs.
			input.nextLine();
            //switch-case for all methods usage
			switch(x) {
			
			//In case1 take two inputs as string and print contains method in order to know if s2 exist in s1 and which index is the last occurence.
			case 1:
				
				System.out.println("Enter first string: ");
				String s1 = input.nextLine();
				System.out.println("Enter second string: ");
				String s2 = input.nextLine();		
				System.out.println(contains(s1,s2));
				break;
			
			//In case2 take one input and print the digits that exist in the input
			case 2:
			
			    System.out.println("Enter a string: ");
				String s3 = input.nextLine();
		        System.out.println(giveDigits(s3));
			    break;
			
			//In case3 take three inputs and if input2 exist in input1, then replace it with input3.
			case 3:
				
				System.out.println("Enter first string: ");
				String s4 = input.nextLine();
				System.out.println("Enter second string: ");
				String s5 = input.nextLine();
				System.out.println("Enter second string: ");
				String s6 = input.nextLine();
				System.out.println(replaceAll(s4,s5,s6));
				break;
			
			//In case4 take two inputs and compare them according to the ASCII table.
			case 4:
				
				System.out.println("Enter first string: ");
				String s7 = input.nextLine();
				System.out.println("Enter second string: ");
				String s8 = input.nextLine();
				System.out.println(compareTo(s7,s8));
				break;
			
			//In order to exit.
			case 5:
				System.out.println("Good bye!");
				break;
			//If user enters an input except 1,2,3,4,5, prompt the user.	
			default:
				System.out.println("You entered wrong choice,please control it and try again.");
			}
		}
			 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	   
	   
	//A method for the control if y exist in x.
	public static int contains (String x, String y) { //method will give return int type and tkaes two string type inputs
			
		     int output = 0;    // declare and intialize output.
			 
		     if(y.length() < x.length()) {    //To ensure that y must be in x only.
				
				for(int i=0; i < x.length(); i++) {    //for loop that index i iterates till the length of x.
		            
					if(x.charAt(i) == y.charAt(0)){    //if first equality is found by looking the firs character of y.
					  
		            	for(int j=0; j < y.length();j++){   //Control the other characters of y, if they are equal with an order.
 
                           if(x.charAt(i) == y.charAt(j)){
						     output = i-j; //assign output for the index of occurence
						    }else {
							  output = -1;  // assign output as -1 for not contains conditions.
						      break;
					      }
						  i++;
					   }
		            }
				 }
			  }	
				return output;    //return output as integer value for the index of last occurence
     }     
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
		  
	
             //a method for the get digits from a string
	          public static String giveDigits (String s) {   //method will give String type return and takes one string type input
		       
	        	  String output = ""; //declare and initialize output
		        
		        
		        for(int i = 0 ; i < s.length(); i++){  //for loop for the index i iterate until the length of s.
						
						char c = s.charAt(i);   //assign a new declared c value as the variable character of s.
						
						if( c >= 48 && c <= 57){ //if char c is a digit according to the table numbers
				         output += c; //make string output with all characters of c
				      }
		        }
		        
		        return output; //return output as a string of digits
		  }
			  
			
			 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			  
	         
	          
	          public static String replaceAll(String a, String b,String c){ //method takes three inputs with string type, returns new string
	              
	              String output =""; //declare and initialize as void of output.
	              boolean contains; //declare boolean contains

	              for(int i=0;i<a.length();i++){ //for loop for index i iterate until biggest length of inputs.
	                  contains = true;  //initialize contains
	                  if(a.length()-b.length()+1 == i){  //if i is the point of first character of string b, break the for loop.
	                      break;
	                  }
	                  for(int j = 0; j < b.length();j++){  //for loop for the index j until the length of b.
	                      if(a.charAt(i+j) != b.charAt(j)){ //if the characters of a and b are not equal, make contains function false.
	                          contains = false;
	                          break;
	                      }  
	                  }
	                      if(contains == true){ //we assume contains true at the begin, if it is not assigned as false on the operations, then lead this way.
	                    	   for(int k=0;k < c.length();k++){  //for index k loop until the length of c.
	                    		      output += c.charAt(k);  //make output the kth character of c.
	                    	}
	                      i = i + b.length()-1; //add the length of b to the i in order to next iteration
	                  }
	                  else{
	                      output += a.charAt(i); //if a not contains b for the ith character, then add it in output directly.
	                  }


	              }

	              return output; //return output as the type of string
	          }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			
			//method for the compare strings according to the greater, lesser or egual.
			public static int compareTo(String d, String e){  //method takes two string types inputs and will give one integer type return
				int iteration = 0; //declare and initialize the number of iteration
				int output = 0;  //declare and initialize the output
				
				if (d.length() < e.length())  //make iteration number the smallest length of inputs.
					iteration = d.length();
				else
					iteration = e.length();
				
				for(int i = 0; i < iteration; i++){  //for loop of index times iteration number
					
					if(d.charAt(i) < e.charAt(i)){  //if the ith character of d smaller than the ith character of e make output -1 and break for loop
						output = -1;
						
			         break; 
			        
					}else if(d.charAt(i) > e.charAt(i)){    //if the ith character of d larger than the ith character of e make output 1 and break for loop
						output = 1;
						
						break;
					}else{
						 if (d.length() != e.length())  // if character numbers are equal, control the length numbers, if they are equal too, make output 0, else make output 1
					     output = 1;
			       
				         else
					     output = 0;
						
					}
					
				}
				
				
				return output; //return output as integer type
			}

}
