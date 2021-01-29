package Methodlar;

public class MethodWIthParameter {

	public static void main(String[] args) {
          
		/*
		 * Some Action need external data
		 * Some method calls need more information
		 * 
		 * We can add parameter to the methods
		 * and provide the data while calling the method
		 */
		
		
		sayHello("Mehmet");
		sayHello("Buyukertas");
		addNumbers(250, 250);
		
	}
	public static void sayHello( String name) {
		System.out.println("Hello " + name);
		System.out.println("Welcome to Cybertek");
	}
	public static void addNumbers(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("The sum of two numbers is " + sum);
	}
	
}