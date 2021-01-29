package Assignment8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

//		Question-8
//
//		Complete a method fib() that will compute Fibonacci numbers
//		In fibonacci series, next number is the sum of previous two numbers 
//		for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... 
//		The first two numbers of fibonacci series are 0 and 1.
//		Given a number num, print n-th Fibonacci Number.
//
//		Input : 2
//		Output : 1
//
//		Input : 9
//		Output : 21
//		
//		
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		fib(a);
	}
	
	public static void fib(int n) {
		int num1=0, num2=1;
		System.out.println("Fibonacci series of "+ n + " numbers");
		
		for(int i=1; i<=n; i++) {
			System.out.print(num1+" ");
			int sumOfPrevTwo=num1+num2;
			num1=num2;
			num2=sumOfPrevTwo;
			
		}
	}
}
		
		
		
	
