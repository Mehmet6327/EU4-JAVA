package day38_Inheritance_Part2;

public class FulltimeEmployee extends Employee{

	public void calculatePay(int hours, double rate) {
		double total = (hours*rate)*1.05;
		System.out.println("Fulltimeemployee total pay: " + total);
	}
	
	
	
	
	
}
