package Assignments9;

public class Question5 {

	public static void main(String[] args) {

	/*	 Question-5

		You have 2 words, both of them have 3 characters.
        If either of them does not have exactly 3 characters,
        print "cannot merge" Merge their characters one by one and print together like below:

		Sample Output:

		     aok
		     lol
		     alookl

		     ear
		     pie
		    epaire

		    java
		    wow
		    cannot merge
		
	*/	
		
		
		String str1 = "ace";
		String str2 = "bdf";
		 
        printMiddleCharacter(str1, str2);

	}
	
	public static void printMiddleCharacter(String str1, String str2) {
		
		if(str1.length()==3 && str2.length()==3) {
			
			for (int i = 0; i < str1.length(); i++) {
				
				System.out.print(str1.charAt(i));
				System.out.print(str2.charAt(i));
			}
			
		}else {
			System.out.println("cannot merge");
		}

		
		
		
	}

}
