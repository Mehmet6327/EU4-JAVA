package day13_methods_Part1;

public class Task58_greaterNumber {

	public static void main(String[] args) {
		
		//Write a method that shows the grater number from 2 numbers
		
		findGreater();
		
	}
	
	public static void findGreater() {
		
		int num1= 20;
		int num2= 30;
		
		if(num1>num2) {
			System.out.println("num1 is greater");
		}else if(num2>num1) {
			System.out.println("num2 is greater");
		}else {
			System.out.println("numbers are equal");
		}
		
		  
		
	}

}
