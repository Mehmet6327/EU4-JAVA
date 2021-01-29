package Assignment3;

public class Question7 {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program that determines the change to be dispensed from a vending machine.
		 * 
		 *  An item in the machine can cost between 25 cents and 1 dollar, 
		 *  in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100),
	      and the machine accepts only a single dollar bill to pay for the item.

	      Sample output

	      Price in cents : 95

	      Your change is 0 quarters, 0 dimes, and 1 nickles
	      
	      
	*/
			int price= 95;
			
			int reminder=100-price;
			
			int quarter,dime,nickle;
			
			quarter=reminder/25;
			reminder%=25;
			dime=reminder/10;
			reminder%=10;
			nickle=reminder/5;
			System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickles");
			
			
			
			

	}

}
