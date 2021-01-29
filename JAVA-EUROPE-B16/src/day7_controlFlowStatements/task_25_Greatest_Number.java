package day7_controlFlowStatements;

public class task_25_Greatest_Number {

	public static void main(String[] args) {
		
//Write java program that will accepte three numbers and return the greatest number.
		
		//Input:
		//Enter first number:4
		//Enter second number:8
		//Enter third number:1
		
		//Output:
		//The greatest number is :8
		
		
		int num1 = 4;
		int num2 = 8;
		int num3 =1;
		
//numaralardan hangisi buyuk ise o altta otomatik olarak buyuk diye yaziliyor
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("Num1 is the greatest");
		}
		
		if(num2>num1 && num2>num3) {
			System.out.println("Num2 is the greatest");
		}
		
		if(num3>num1 && num3>num2) {
			System.out.println("Num3 is the greatest");
		}
		
	}

}
