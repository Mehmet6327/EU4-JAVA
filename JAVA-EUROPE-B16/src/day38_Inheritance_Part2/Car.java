package day38_Inheritance_Part2;

public class Car extends Vehicle{

	
	int maxSpeed = 180;
	
	public void display() {
	System.out.println("Maxium speed:" + super.maxSpeed);
		System.out.println("Maxium speed:" + maxSpeed);
		
		
	}
	
	
	
}
