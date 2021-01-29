package Assignments9;

public class Question4 {

	public static void main(String[] args) {

		
	/*	Question-4

		You have a word, do the following:

		If the word has odd number of characters and has 5 or more characters, print the middle three characters of the word. Otherwise, print "invalid".

		Sample Output:

		       fifteen ==> fte
		       apple ==> ppl
		       hey ==> invalid
		       java ==> invalid
		      whatsup ==> ats
		      $ ==> invalid
		*/
		
		
		String str = "name";
		 
        printMiddleCharacter(str);

	}
	
	public static void printMiddleCharacter(String str) {
		
		int len = str.length();
		
		if(len>=5 && len%2==1) {
			int middle = len / 2;
	        System.out.println(str.substring(len/2-1, len/2+2));
		}else {
			System.out.println("invalid");
		}

	
		
	}

}
