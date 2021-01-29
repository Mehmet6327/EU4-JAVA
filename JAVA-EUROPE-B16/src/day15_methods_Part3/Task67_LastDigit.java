package day15_methods_Part3;

public class Task67_LastDigit {

	public static void main(String[] args) {

		
		   //Task67
//		Write a method that accepts 2 numbers and return if they have the same last digit
//				Sample Output
//				lastDigit(7,17)-true
//				lastDigit(6,17)-false
//				lastDigit(3,113)-true
		
		
		if(lastDigit(7,17)) {
			System.out.println("They have the same last night");
		}else {
			System.out.println("They do not have the same last night");
		}
		
	}
              public static boolean lastDigit(int num1, int num2) {
            	  
            	  if((num1%10)==(num2%10)) {
            		  return true;
            	  }else {
            		  return false;
            	  }
              }
}
