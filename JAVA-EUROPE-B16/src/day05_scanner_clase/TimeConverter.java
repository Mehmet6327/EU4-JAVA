package day05_scanner_clase;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		
		/*
		Task-3:
		
		   Create an interactive program to ask user for day
		   and generate minute that day have
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many days are you going to drive ? ");
		int workDay =scan.nextInt();
		int minute  =workDay*60*24;
		System.out.println("Your going to drive for " + minute + " minute ");

		

		
       
		
		
		
		
		
		
	}

}
