package day9_controlFlowStatements_Parts3;

public class laptopModels {

	public static void main(String[] args) {
		
		//Write  program that lets useer to enter apple, dell, acer, laptop models
		//if it is apple show "Apple-no virus"
		//if it is dell show "Tough one"
		//if it is acer show "Not recommended"
		//Else "do not buy that one!"
		
		String computer= "apple";
		
		switch(computer) {
		
		case "apple":
			System.out.println("no virus");
			break; 
		case "dell":
			System.out.println("Tough one");
			break;
		case "acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("do not buy that one!");
	
		}
		
		
		
		
		
		
		

	}

}
