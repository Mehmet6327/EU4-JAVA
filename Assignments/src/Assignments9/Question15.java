package Assignments9;

public class Question15 {

	public static void main(String[] args) {
		
	/*	Question-15

     Print true if the string "cat" and "dog" appear 
     the same number of times in the given string word.

		Sample Output:

		     input: catdog
		     output: true

		     input: catcat
		     output: false

		     input: cat-cheetah-dog-cat
		     output: false

	*/
		
String str = "catcatcatdogdogdog";
		
		int counterCat=0;
		int counterDog=0;
		
		for (int i = 0; i < str.length()-2; i++) {
			
			if(str.substring(i, i+3).equalsIgnoreCase("cat")) {
				
				counterCat++;
			
			}else if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
				
				counterDog++;
			}
			
		}
		
		if(counterCat==counterDog) {
			System.out.println(true);;
		}else {
			System.out.println(false);
		}
		

	}

}
