package week6;

public class ComputerFactory {

	public static void main(String[] args) {
         int x =10;
         
		//Computer class is blueprint for computer objects
		Computer c1 = new Computer();
		//assigning value for each field
		c1.brand = "Apple";
		c1.price = 1300 ;
		c1.screenSize = 17;
		
		System.out.println("computer 1 brand is " + c1.brand);
		System.out.println("computer 1 price is " + c1.price);
		System.out.println("computer 1 screenSize is " + c1.screenSize);
		
		Computer c2 = new Computer();
		c2.brand = "Asus";
		c2.price = 500 ;
		c2.screenSize = 15;
		
		System.out.println("computer 2 brand is " + c1.brand);
		System.out.println("computer 2 price is " + c1.price);
		System.out.println("computer 2 screenSize is " + c1.screenSize);
		
		
		Computer c3 = new Computer();
		c3.brand = "Asus";
		c3.price = 500 ;
		c3.screenSize = 15;
		
		System.out.println("computer 3 brand is " + c1.brand);
		System.out.println("computer 3 price is " + c1.price);
		System.out.println("computer 3 screenSize is " + c1.screenSize);
	}

}
