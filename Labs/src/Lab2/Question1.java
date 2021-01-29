package Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
//		Question-1
//
//		Write a program with a loop that lets the user enter a series of integer numbers. 
//		After all the numbers have been entered, 
//		the program should display the largest and smallest numbers entered.

		
		
		Scanner input = new Scanner(System.in);
		int value;       
		int smallest=3;
		int largest = 26;                                       
		      
		   System.out.print("Enter your first number: ");          
		   value = input.nextInt();
		   smallest = value;
		   while(value != 0){ 
		   System.out.print("Enter your next number: ");          
	       value = input.nextInt();
		   smallest = value;
	       while(value != 0){                     
		   System.out.print("Do you want to enter another number: 0-No, 1-Yes ");                  
		   value = input.nextInt();
		   smallest = value;
		   while(value != 0){ 
		   System.out.print("Enter your next number: ");          
		   value = input.nextInt();
		   smallest = value;
		   while(value != 0){ 
		   System.out.print("Do you want to enter another number: 0-No, 1-Yes ");                  
		   value = input.nextInt();
		   smallest = value;
		   while(value != 0){ 
		   System.out.print("Enter your next number: ");          
		   value = input.nextInt();
		   smallest = value;
		   while(value != 0){  
		System.out.print("Do you want to enter another number: 0-No, 1-Yes ");                  
		value = input.nextInt();
		smallest = value;
		while(value != 0){ 
		System.out.print("Enter your next number: ");          
		value = input.nextInt();
		smallest = value;
		while(value != 0){            
		System.out.print("Do you want to enter another number: 0-No, 1-Yes ");                  
		value = input.nextInt();
		smallest = value;
		while(value != 0){ 
		System.out.print("Enter your next number: ");          
		value = input.nextInt();
		smallest = value;
		while(value != 0){            
		System.out.print("Do you want to enter another number: 0-No, 1-Yes ");                  
		value = input.nextInt();
		smallest = value;
		while(value != 0){ 
		           
					   }
				   }
			   }
		 
		if(value!=-99)
		{
		   if (value > largest){
		   largest = value;
		   }
		   if (value<smallest)
		{
		   smallest = value;                  
		   }      
		   }
		}
		
	System.out.println("Smallest Value: " + smallest);
		System.out.println("Largest Value: " + largest);
		 
		}
	   }
	  }
	 }
	 }
	}
  }
		
		

	}

}
