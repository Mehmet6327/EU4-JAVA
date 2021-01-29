package Assignments9;

public class Question10 {

	public static void main(String[] args) {

		
	/*	Question-10

		Write a program that will print out information about the user based on email. 
		Print first and last name from the upper case.

		Sample Output:
		     Input: craig_federighi@apple.com
		    Output:
		           First name: Craig
		           Last name: Federighi
		           Domain: apple
		           Top-Level Domain: com
		
	*/	
		
		
      String str = "mike_tyson@gmail.com";
		
		String[] sentence = str.split("@");
		String[] firstPart = sentence[0].split("_");
		
		String secondPart1 = str.substring(str.indexOf("@")+1 ,str.indexOf("."));
		String secondPart2 = str.substring(str.indexOf(".")+1 ,str.length());
		
		
		System.out.println("First Name: " + firstPart[0].toUpperCase());
		System.out.println("Last Name: " + firstPart[1].toUpperCase());
		System.out.println("Domain: " + secondPart1);
		System.out.println("Top-Level Domain: " + secondPart2);
		
		
		
		
	}

}
