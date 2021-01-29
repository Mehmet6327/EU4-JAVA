package Assignments9;

public class Question7 {

	public static void main(String[] args) {

	/*	Question-7

		Write a program that will print out the first half of the word twice.

		Sample Output:

		     input: java
		     output: jaja
		*/
		
      String str = "barbaria";
		
		int len = str.length();
		
		String firsHalf =  str.substring(0, len/2);
		
		System.out.println(firsHalf.repeat(2));
		
		
		
	}

}
