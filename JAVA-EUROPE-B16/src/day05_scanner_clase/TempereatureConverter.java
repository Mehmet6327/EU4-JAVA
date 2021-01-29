package day05_scanner_clase;

import java.util.Scanner;

public class TempereatureConverter {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("What is the temperataure in F ? ");
		 
		 double fahrenheit = scan.nextDouble();
		 
		 double celcius = (5.0/9) * (fahrenheit - 32 );
		 
		 //fahrenheit 80 is 23 in celcius
		 System.out.println("fahrenheit " + fahrenheit + " is " + celcius + " in celcius");
		
		
		
		
		
		
		
		
		
		
		

	}

}
