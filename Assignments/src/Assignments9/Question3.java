package Assignments9;

public class Question3 {

	public static void main(String[] args) {

	/*	Question-3

		You have a word, do the following:

		1. When word has odd number of characters and:
		     - 3 or more characters, print middle letter
		              oak ==> a
		              javav ==> v
		     - Single character, print that character 3 times
		             # ==> ###
		             q ==> qqq

		2. When word has even number of characters and:
		     - 4 or more characters, print middle 2
		            java ==> av
		            apples ==> pl
		            #$%^&* ==> %^
		    - 2 characters, print those 2 characters twice
		           @@ ==>@@@@
		           $$ ==>$$$$
		           hi ==> hihi
		
		*/
		
		String str = "jj";
		 
        printMiddleCharacter(str);

	}
	
	public static void printMiddleCharacter(String str) {
		
		int len = str.length();
		
		if(len>=3 && len%2==1) {
			int middle = len / 2;
	        System.out.println(str.charAt(middle));
		
		}else if(len==1) {
			System.out.println(str.repeat(3));
		
		}else if(len>=4 && len%2==0) {
			System.out.println(str.substring(len/2-1, len/2+1));
		
		}else if(len==2) {
			System.out.println(str.repeat(2));
		}
		
		
		
		
		
		
		
	}

}
