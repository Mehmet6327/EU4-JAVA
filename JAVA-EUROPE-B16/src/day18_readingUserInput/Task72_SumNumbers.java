
package day18_readingUserInput;

import java.util.Scanner;

public class Task72_SumNumbers {

	public static void main(String[] args) {

		
		//Task72
		//Write a program that ask user to enter 3 numbers and shows the total of numbers.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		int num4 =sc.nextInt();
		int num5 =sc.nextInt();
		int num6 = sc.nextInt();
		
		int sum = num4+num5+num6;
		
		System.out.println("Sum of numbers: + sum");
		
		////HOCA KISA OLAN YUKARIDAKINI YAPTI BENDE ASAGIDAKI GIBI YAPTIM 
		
		
		System.out.print("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number:");
		int num2 = sc.nextInt();
		
		System.out.print("Enter thirty number:");
		int num3 = sc.nextInt();
		
	    int Total = (num1+num2+num3);
		
		
		System.out.print("Total" + "=" + (num1+num2+num3));
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
