package day9_controlFlowStatements_Parts3;

public class task39_trafficLightSelector {

	public static void main(String[] args) {
	
		//Task-39
		//Write a program to display traffic light colors using following logic:
		//if code (R/r)-->"Red"
		//if code (O/o)-->"Orange"
		//if code (G/g)-->"Green"
		
		
        char colors = 'R';
		
		switch(colors) {
		case 'R':
		case 'r':
			System.out.println("Red Light");
			break;
		case 'O':
		case 'o':
			System.out.println("Orange Light");
			break;
		case 'G':
		case 'g':
			System.out.println("Green Light");
			break;
	    default:
	    	System.out.println("Invalid Light");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
