package Assignments9;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		/*	Question-1

		Create a method called tipCalculator which accepts parameters: 
			boolean isSplit, int numberPeople, double checkAmount, String serviceQuality

		Ask the user to enter each value. 

		User should select service quality that will correspond to tip percent.

		Poor = 5%
		Fair = 10%
		Good = 15%
		Great = 20%
		Excellent = 25%

		The program should display the following information based on the user input:
		Split or No split
		Number of people entered: &&&&
		Service Quality:
		Total to pay:
		Total tip:
		Total per person:
		Tip per person:

		Input:
		Split:Yes
		Number of people:4
		Check amount:476.0
		Service Quality:Excellent

		Output:
		Number of people entered: &&&&
		Total to pay: 595.0
		Total tip: 119.0
		Total per person: 148.75
		Tip per person: 29.75
	*/	
		
		
		
boolean bool;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Split or No Split?: ");
		String a = scan.next();
		if(a.equalsIgnoreCase("Split") || a.equalsIgnoreCase("Yes") || a.equalsIgnoreCase("True")) {
			bool = true;
		}else {
			bool = false;
		}
		
		System.out.print("Number of people: ");
		int nump = scan.nextInt();
		
		System.out.print("Check amount: ");
		double chamo = scan.nextDouble();
		
		System.out.print("Service Quality: ");
		String serqua = scan.next();
		
		
		tipCalculator(bool, nump, chamo, serqua);

	}
	
	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		
		double tipPercent = 0;
		
		switch (serviceQuality) {
		case "Poor":
			tipPercent = (checkAmount/100)*5;
			break;
		case "Fair":
			tipPercent = (checkAmount/100)*10;
			break;
		case "Good":
			tipPercent = (checkAmount/100)*15;
			break;
		case "Great":
			tipPercent = (checkAmount/100)*20;
			break;
		case "Excellent":
			tipPercent = (checkAmount/100)*25;
			break;
		default:
			break;
		}
		
		
		if(isSplit == true) {
			
			System.out.println("Number of people entered: " + numberPeople);
			System.out.println("Total to pay: " + (checkAmount + tipPercent));
			System.out.println("Total tip: " + tipPercent);
			System.out.println("Total per person: " + (checkAmount + tipPercent)/numberPeople);
			System.out.println("Tip per person: " + tipPercent/numberPeople);
			
		}else {
			
			System.out.println("Total to pay: " + (checkAmount + tipPercent));
			System.out.println("Total tip: " + tipPercent);
		}
		
		
		
	
	
	
		
	}
	
	

}
