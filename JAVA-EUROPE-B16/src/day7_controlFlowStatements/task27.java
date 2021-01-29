package day7_controlFlowStatements;

public abstract class task27 {

	public static void main(String[] args) {
		//Write java program to implement following logic using if statement
		//1.)If hour is lees than 12 noon, greet with Good morninig
//2.)If hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
	//3.)If hour is greater than or equal to 3 pm, greet with Good Evening.
		
		
		int hour= 10;
		
		if(hour<12) {
			System.out.println("Good Morning");
		}
		
		if(hour>=12 && hour<15) {
			System.out.println("Good Afternoon");
			
		}
		
		if(hour>=15) {
			System.out.println("Good Evening");
			
		}
		
		
		
		

	}

}
