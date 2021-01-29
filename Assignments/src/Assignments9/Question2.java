package Assignments9;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

	/*	Question-2

		Write a program that will calculate laptop price based on the components.

		First, ask user for screen size. If screen size equals to 13.3, 
		add $200 to the laptop price. If screen size equals to 15.0 - add $300 to the laptop price.
		If screen size equals to 17.3 - add $400 to the laptop price.

		Then ask the user for CPU type. If CPU type equals to i3, add $150 to the laptop price. 
		If CPU type equals to i5, add $250 to the laptop price. 
		\If CPU type equals to i7, add $350 to the laptop price.

		Then ask the user for RAM size. Add $50 for every 4GB of ram to the laptop price.

		Then, ask the user for the storage type. 
		There are 2 options: SSD and HDD. 
		If it's HDD - add $50 to the laptop price for every 500gb. 
		If it's SSD - add $100 to the laptop price for every 500GB.

		Then ask the user for screen resolution. 
		There are 2 options: FULLHD and 4K.
		Add $100 if it's FULLHD screen and $200 if it's 4K screen.

		Sample Output:

		Display message: Select screen size:
		input: 13.3
		Display message: Select CPU type:
		input: i7
		Display message: Select RAM size:
		input: 8
		Display message: Select storage type:
		input: SSD
		Display message: Enter memory size:
		input: 1000
		Display message: Enter screen resolution:
		input: 4K
		Display message: Laptop price is: $1050.0
		Example #2

		Display message: Select screen size:
		input: 13.3
		Display message: Select CPU type:
		input: i3
		Display message: Select RAM size:
		input: 4
		Display message: Select storage type:
		input: HDD
		Display message: Enter memory size:
		input: 500
		Display message: Enter screen resolution:
		input: FULLHD
		Display message: Laptop price is: $550.0
		
		
		*/
		
      Scanner scan = new Scanner(System.in);
		
		double sum = 0;
		
		System.out.print("Select screen size: ");
		double screenSize = scan.nextDouble();
		if(screenSize==13.3) {
			sum+=200;
		}else if(screenSize==15.0) {
			sum+=300;
		}else if(screenSize==17.3) {
			sum+=400;
		}
		
		System.out.print("Select CPU type: ");
		String CPU = scan.next();
		if(CPU.equalsIgnoreCase("i3")) {
			sum+=150;
		}else if(CPU.equalsIgnoreCase("i5")) {
			sum+=250;
		}else if(CPU.equalsIgnoreCase("i7")) {
			sum+=350;
		}
		
		System.out.print("Select RAM size: ");
		int RAM = scan.nextInt();
		if(RAM%4==0) {
			sum+=(RAM/4)*50;
		}
		
		System.out.print("Select storage type: ");
		String storage = scan.next();
		
		System.out.print("Enter memory size: ");
		int memory = scan.nextInt();
		
		
		if(storage.equalsIgnoreCase("HDD")) {
			if(memory%500==0) {
				sum+=(memory/500)*50;
			}
		}else if(storage.equalsIgnoreCase("SSD")) {
			if(memory%500==0) {
				sum+=(memory/500)*100;
			}
		}
		
		System.out.print("Enter screen resolution: ");
		String screenSol = scan.next();
		if(screenSol.equalsIgnoreCase("FULLHD")) {
			sum+=100;
		}else if(screenSol.equalsIgnoreCase("4K")) {
			sum+=200;
		}
		
		System.out.println("Laptop price is: $" + sum);
		
	}

}
