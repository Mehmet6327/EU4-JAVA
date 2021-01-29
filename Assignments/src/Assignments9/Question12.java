package Assignments9;

public class Question12 {

	public static void main(String[] args) {

	/*	Question-12

		Given a string word, 
		if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X'
		chars, otherwise print the string unchanged.

		Sample output:

		     input: xHiX
		     output: Hi

		     input: apple
		     output: apple

		     input: xUxL
		     output: UxL

		     input: JavaX
		     output: Java
		
		*/
		
		String str = "xHiX";
		String a = str.toLowerCase();
		
		if(a.startsWith("x") || str.endsWith("x")) {
			
			System.out.println(str.substring(1, str.length()-1));
		}else {
			System.out.println(str);
		}
		
		
		
	}

}
