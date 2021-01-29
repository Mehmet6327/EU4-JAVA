package day9_controlFlowStatements_Parts3;

public class ORLogicWithSwitch {

	public static void main(String[] args) {
		
		//TASK-38
		//write a program to display days:
		//1.)Monday
		//2.)Tuesday
		//3.)Wednesday
		//4.)Thursday
		//5.)Friday
		//6.)Saturday
		//7.)Sunday
		
//ASAGIDAKI BIRINCI YONTEM IKINVI YONTEM DE ONUN ALTINDA******************************		
            	//	char grade = 'D';
            		
//		// A or B or C -> pass D or E ->fail
//		
//		switch(grade) {
//		case 'A':
//			System.out.println("pass");
//			break;
//		case 'B':
//			System.out.println("pass");
//			break;
//		case 'C':
//			System.out.println("pass");
//			break;
//		case 'D':
//			System.out.println("pass");
//			break;
//		case 'E':
//			System.out.println("pass");
//			break;
//		}
		
		char grade = 'D';
		
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("pass");
			break;
		case 'D':
		case 'E':
			System.out.println("fail");
			break;
		}
		
		//switch case IS not working with BOOLEAN 
		//SWITCH case working with match
		
		
		
		
		
		
		
		
		
	}

}
