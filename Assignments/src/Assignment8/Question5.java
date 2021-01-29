package Assignment8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		
//		Question-5
//
//		Create a method called sign.  It gets a number and tells you if its positive, 
		//negative or zero.
//
//		for example :
//		sign(5) => 1
//		sign(-30)=> -1
//		sign(0) => 0
//
//		sign gets an int parameter.
//
//		print out 1,-1 or 0 depending on the input
//
//		the parameter should be entered by user (create a scanner object)
//		
		
	sign();
	}
	public static void sign() {
		
		int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0) {
            System.out.println(number+" is a positive number");
        }else if(number < 0) {
            System.out.println(number+" is a negative number");
        }else{
            System.out.println(number+" is neither positive nor negative");
	}
	}
	
}
