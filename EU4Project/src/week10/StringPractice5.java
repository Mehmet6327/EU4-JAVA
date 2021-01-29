package week10;

public class StringPractice5 {

	public static void main(String[] args) {

		/*
		 frequency of one character
		 
		 */
			
		
		
		
		
String str = "aaabbbbcacaaaaaa";
		
		int count = 0;
		
		for(String each : str.split("")) {
			if(each.equals("a")) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
	
	
		
		
		
		
		
		
		
	}

}
