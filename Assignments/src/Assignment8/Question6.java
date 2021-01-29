package Assignment8;

public class Question6 {

	public static void main(String[] args) {
	
//		Question-6
//
//		Create a method called next3 . 
//		This method gets an int argument and prints the next 3 numbers after that number. 
//		Call the method from main method and pass num to it.
//
//		enter number
//		1
//		next 3 are:
//		2 3 4
//
//		(put a space between numbers)

   

	next3(1);
}
	
	public static void next3(int a) {
		
		for (int i=(a+1); i<=(a+3); i++ ) {
			System.out.print(i + " ");
	
		}
		
	}
}
