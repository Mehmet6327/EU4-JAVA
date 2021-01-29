package Assignments9;

public class Question6 {

	public static void main(String[] args) {

		
	/*	Question-6

		Write a program that will reverse a string. 
		Your program should reverse a string only 5 characters long. 
		If the word is shorter, display message: "Too short!".
		If the word is longer, display the message: "Too long!". 
		Otherwise, reverse this word and print out the result into the console.

		Sample Output:

		     input: cat
		     output: Too short!


		     input: singularity
		     output: Too long!


		     input: apple
		     output: elppa
		
		
		*/
		
		
       String str = "abcde";
		
		if(str.length()==5) {
			
			for (int i = str.length()-1; i >= 0; i--) {
				
				System.out.print(str.charAt(i));
			}
		}else if(str.length()>5) {
			System.out.println("Too long");
		}else {
			System.out.println("Too short");
		}
		
		
	}

}
