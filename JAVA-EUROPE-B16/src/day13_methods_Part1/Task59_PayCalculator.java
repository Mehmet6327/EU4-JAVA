package day13_methods_Part1;

public class Task59_PayCalculator {

	public static void main(String[] args) {


		
		//Write a method that accepts number of hours and hourly 
		//pay and show your pay for those hours in the console.
		
		
		payCalculator(80, 20);
		
		

	}
	     public static void payCalculator(double hours, double hourlyPay) {
	    	 
	    	 double pay = hours * hourlyPay;
	    	 
	    	 System.out.println(pay);
	    	 
	    	 
	    	 
		
	}

}
