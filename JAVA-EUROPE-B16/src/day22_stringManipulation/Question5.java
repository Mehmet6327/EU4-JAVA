package day22_stringManipulation;

public class Question5 {

	public static void main(String[] args) {
		
//		Question-5
//		Given a string of even length, 
//		return the first half. So the string "WooHoo" yields "Woo".
//				
//		firstHalf("WooHoo") → "Woo"
//		firstHalf("HelloThere") → "Hello"
//		firstHalf("abcdef") → "abc"
		
		
		
		
		

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		
	}
	
	public static String firstHalf(String str) {
		
		int x  = str.length()/2;
		
		return str.substring(0,x);
		
		
		
		
		
		
		
	}

		

}
