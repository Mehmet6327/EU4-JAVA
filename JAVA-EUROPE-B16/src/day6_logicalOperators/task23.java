package day6_logicalOperators;

public class task23 {

	public static void main(String[] args) {
		
		String OutsideWeather;
		int degree;
		OutsideWeather= "Shinny";
		degree = 70;
		
		boolean comp2 = (! (OutsideWeather=="Rainy"||degree==70));
		// (!F||T) = !T = > false 
		
		System.out.println("comp2 = " + comp2 );
		
		
		
		
		
		
		
		

	}

}
