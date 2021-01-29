package day13_methods_Part1;

public class Task61_AgeCalculator {

	public static void main(String[] args) {

		//Write a method accepts birthyear and displays the age in the console.
		//sample output:
		//calculateAge(2000) -->18
		
       ageCalculator(2020, 1994);
	
	}
	
	private static void ageCalculator(int currentYear, int birthyear ) {
		
		int age = currentYear - birthyear;
		System.out.println(age);
	}

}










