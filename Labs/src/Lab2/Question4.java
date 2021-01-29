package Lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

//		Question-4
//
//		     Write a program that asks user for the number of 
//	     	males and the number of females registered in a class.
//	    	The program should display the percentage of males and females in the class.
		
         Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of females in the class:");
		int f=scan.nextInt();
		System.out.println("Enter number of males in the class:");
		int m=scan.nextInt();
		
		double perFemale, perMale;
		
		perFemale=(f*100)/(f+m);
		perMale=(m*100)/(f+m);
		
		System.out.println(perFemale);
		System.out.println(perMale);
		
		
		
	}

}
