package Methodlar;

import java.util.Scanner;

public class MethodWithReturnType {

	public static void main(String[] args) {

		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		
//		int  num = scan.nextInt();
//		System.out.println("You entered " + num);
//		
		
		
		
		
		
//		Create a method that accept one number and return the doubleTheNumber
//				10-->20 
//		
		
		
		int result = doubleTheNumber(100);
		System.out.println("The result is " + result);
		
		boolean result2 = isEligibleForVoting(11);
		System.out.println(result2);
		
	}
	
	public static int doubleTheNumber(int num) {
//		int result = num * 2 ;
//		return result;
		//VEYA BUNUN YERINE DIREK
		return num * 2; // YAPMAN  DA SONUCU DOGRU CIKARACAKTIR.
		
	//***************************************************************//
	
		
	}
	public static boolean isEligibleForVoting(int age) {
		if(age>18) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
