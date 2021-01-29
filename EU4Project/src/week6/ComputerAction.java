package week6;

public class ComputerAction {

	public static void main(String[] args) {

		Computer c1 = new Computer();
		c1.brand = "Apple";
		c1.price = 1500 ;
		c1.screenSize = 20;
		
		Computer c2 = c1;
		
		System.out.println(c1.brand);
		System.out.println(c1.price);
		System.out.println(c1.screenSize);
		
		c2.screenSize = 20;
		System.out.println(c1.screenSize);
		
		
	}

}
