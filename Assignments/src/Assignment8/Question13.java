package Assignment8;

public class Question13 {

	public static void main(String[] args) {

//		Question-13
//
//		This method calculates a water bill, 
//		the method gets a double and returns a double.
//
//		The more water you use the more it will cost you (as a fine for wasting water).
//
//		for example:
//
//		waterTax(50)
//		returns 30
//
//		waterTax(55)
//		returns 49.5
//
//		waterTax(101)
//		returns 140.9
//
//		waterTax(151)
//		returns 235.9
//
//		the regular calculation under 50 is
//		bill = units * 0.60;
//		above 50 is:
//		bill = units * 0.90;
//
//		above 100 the calculation is like above 50 but with a 50 as fine
//
//		and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the price.
//		
//		
		
		System.out.println(waterTax(151));
	}
	public static double waterTax(double a) {
		if(a<=50) {
			double bill = a*0.60;
			return bill;
		}else if(a>50 && a<=100) {
			double bill = a*0.90;
			return bill;
		}else if(a>100 && a<150) {
			double bill = (a*0.90) + 50;
			return bill;
		}else {
			double bill = (a*0.90) + 100;
			return bill;
		}
	}

}
