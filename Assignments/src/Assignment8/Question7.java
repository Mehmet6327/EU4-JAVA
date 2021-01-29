package Assignment8;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	
//		Question-7
//
//		Complete a method isPalindrome() that will check if the number is a palindrome. 
//		Print your result as a boolean (true or false).
//		Do not convert int into a string!
//		Example:
//		input: 1001
//		output: true
//
//		Example:
//		input: 1234
//		output: false
//		
//		
		System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }      
		isPalindrome(25);
	}
	 public static boolean isPalindrome(int number) {
	        int palindrome = number; 
	        int reverse = 0;
	        while (palindrome >0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }
	        if (number == reverse) {
	          return true;
	        }
	          return false;
	}
}
