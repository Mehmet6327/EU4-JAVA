package week6;

public class Computer {

	//Attributes....
	//instance field | variable
	double price;
	int screenSize;
	String brand;
	
	// displayInfo
	public void displayInfo() {
		System.out.println("computer-price is " + price );
		System.out.println("computer-brand is " + brand );
		System.out.println("computer-screenSize is " + screenSize );
		
	}
	
	
	//open
	//any method is not static --- known as instance memory
	//to represent behavior of object
	public void open() {
		System.out.println("Computer is opening");
	}
	
	//open // shutdown 
	

		
	
	
	
}
