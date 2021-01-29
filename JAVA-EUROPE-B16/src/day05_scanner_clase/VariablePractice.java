package day05_scanner_clase;

public class VariablePractice {

	public static void main(String[] args) {
		
		//Task1:
		
		// 8 primitive
		
		/*
		 Block comment, everything in between will be seen as comment
		 
		  Whole Number        : byte, short, int, long
		  Fractioanal Numbers : float, double 
		  Logical   	      : boolean (true, false)
		  Character           : char (single character in single quote)
		 
		 usually by default for WHOLE numbers        : JUST USE INT 
		 usually by default for  FRACTIOANAL numbers : JUST USE DOUBLE
		 
		 
		 IS String part of Primitive types?  :  NOOOOOOO!!!!!!
		 String is sequence of character
		
		
		 */
		
		//Task 1: Age calculator
		//Given birth ear, please calculate the age 
		
		int birthYear   = 1994;
		int currentYear = 2020;
		int age         = currentYear - birthYear;
		
		
		// I was born in year 1994, and I am 26 years old;
  //System.out.println("I was born in year " + 1994 + " , and I am " + (2020-1994) + " years old ");
		
	System.out.println(" I was born in year " + birthYear + " , and I am " + age + " years old");	
		
	
	//********************************************************************************************
	
	         // Task 2:  you are speeding today
	// speed limit is some number ,  and your current speed is this
	//generate this output of : You are driving 50 mph more than speed limit 
	
	//speedLimit as int, currentSpeed as int, overTheLimit as int

	
		int speedLimit   = 150;
		int currentSpeed = 100;
		int overTheLimit = speedLimit - currentSpeed;
		
System.out.println(" You are driving " + overTheLimit +  " " + "mph" + " more than speed limit" );
 System.out.println(" You are driving " + overTheLimit +  " mph more than speed limit");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
