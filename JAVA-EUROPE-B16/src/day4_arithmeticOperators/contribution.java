package day4_arithmeticOperators;

public class contribution {

	public static void main(String[] args) {
		
	/*This program calculates the amount of pay that will be contributed to a retirement
	 * plan if 5%, 8%, or 10% of monthly pay is withheld
	 */
	//Variables to hold the monthly pay and the amount of the contribution
		
		double monthlyPay = 6000;
		double contribution;
		
		//Calculate and display 5% contribution
		contribution=monthlyPay * 0.05;
		
		System.out.println("5 percent is $  " + contribution + " per month. ");
		
		
		//Calculate and display 8% contribution
				contribution=monthlyPay * 0.08;
				
		System.out.println("8 percent is $  " + contribution + " per month. ");	
		
		//Calculate and display 10% contribution
		contribution=monthlyPay * 0.10;
		
		System.out.println("10 percent is $  " + contribution + " per month. ");	
		
		//Task
		
		int outcome =12+6/3;
		System.out.println(outcome);
		
		int outcomei= 5+2*4;
		int outcomea= 10/2-3;
		int outcomeb= 8+12*2-4;
		int outcomed= 4+17%2-1;
		int outcomec= 6-3*2+7-1;
		
		System.out.println(outcomei);
		System.out.println(outcomea);
		System.out.println(outcomeb);
		System.out.println(outcomec);
		System.out.println(outcomed);
		
		
		
		
		
		
	
		
		
		
	
	}

}
