package Assignments9;

public class Question9 {

	public static void main(String[] args) {

		
	/*	Question-9

		In this task, you need to swap the first name with the last name in the email. 
		If the email doesn't contain underscore - do not anything.

		Sample Output:
		     input: mike_tyson@gmail.com
		     output: tyson_mike@gmail.com

		     input: barakobama@gmail.com
		     output: barakobama@gmail.com
		
		
	*/	
		
    
		
//		String firstName = str.substring(0, str.indexOf("_"));
//        
//		String lastName = str.substring(str.indexOf("_")+1 ,str.indexOf("@"));
//		
//		if(str.contains("_")) {
//			
//			System.out.println(lastName+"_"+firstName+"@gmail.com");
//		}else {
//			System.out.println(str);
//		}
		
		String str = "mike_tyson@gmail.com";
		String [] strFirstArray=str.split("@");
		String [] strSecondArray= strFirstArray[0].split("_");
		String newName = strSecondArray[1]+"_"+strSecondArray[0]+ "@"+strFirstArray[1];
		System.out.println(newName);
		
		
		
		
		
	}

}
