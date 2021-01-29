package Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

//		Write a program that will ask the user to enter the amount of a purchase. 
//		The program should then compute the state and county tax sales tax.
//		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
//		The program should display the amount of the purchase , the state sales tax, 
//		the county sales tax, the total sales tax, 
//		and the total of the 
//		sale (which is the sum of the amount of purchase plus the total sales tax)
		
		
		final double state_rate = 0.04;
		final double county_rate=0.02;
		
		double purchase;
		double stateTax;
		double countyTax;
		
		double totalTax;
		double totalCost;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the purchase amount: ");
		purchase = scan.nextDouble();
		
		stateTax = purchase * state_rate;
		countyTax = purchase * county_rate;
		totalTax = stateTax + countyTax;
		totalCost = purchase + totalTax;
		
		System.out.println("Purchase amount: $" + purchase);
		System.out.println("State tax: $" + stateTax);
		System.out.println("County tax: $" + countyTax);
		System.out.println("Total tax: $" + totalTax);
		System.out.println("Total cost: $" + totalCost);
		
		
		
		
	}

}
