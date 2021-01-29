package day05_scanner_clase;

import java.util.Scanner;

public class TheScannerWay {

	public static void main(String[] args) {
	
		
		/*ask user for name
		 * and capture the result
		 * print your name is is 
		 * 
		 * ask user for birth year
		 * and capture the result
		 * print the age!!
		 * 
		 * ask user for height
		 * and capture the result
		 * print the height!!!
		 * 
		 * 
		 */
		
		//Create scanner object
		//YOU CAN PUT HERE name your variable whatever  you want
		//in below case we are calling it SCAN
//*******Scanner is DATA TYPE, scan is the NAME , new Scanner(System.in) is the VALUE here....************
		
		Scanner scan = new Scanner(System.in);   //(SCANNER OBJECT HERE)		
		System.out.println("What is your name ? ");
		//String name = "Mehmet";
		String name = scan.next();
		System.out.println("Your name is : " + name);
		
		
		 //Example
		 //ask user for birth year
		 // and capture the result
		 //print the age!!
		
	         	//int birthYear   = 1994;
				//int currentYear = 2020;
				//int age         = currentYear - birthYear;
		
		System.out.println("What is your birth year ? ");
		int birthYear = scan.nextInt();
		int age = 2020 - birthYear;
		
		System.out.println("Your age is : " + age );
		
		//simdide kiloya gectik 
		
		
		System.out.println("What is your height ?");
		double height = scan.nextDouble();
		System.out.println(" Your height : " + height);
		
		
		//Dipnot en son kilo kismini int ile de yaptim oluyor fark etmez lakin 
		//DOUBLE ile yaptigin zaman daha guzel oluyor kilo icin 
		//Cunku kiloda kisurat oldugu icin mesela 65.50 gibi./.....
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
