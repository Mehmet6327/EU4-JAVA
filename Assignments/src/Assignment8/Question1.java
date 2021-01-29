package Assignment8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

//		Question-1
//
//		Create a method called "plus", its return is void and it gets no arguments.
//
//		It asks the user to input two numbers, then it will add them and print the result.
//		Create a scanner within the plus method.
//
//		Example:
//
//		enter first number:
//		1
//		enter second number:
//		2
//		result: 3
		
		plus();
	}
	    public static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = scan.nextInt();
		System.out.print("Enter second number:");
		int b = scan.nextInt();
		int result = a + b;
		System.out.println("Result is: " + result);
	}
}
