package day10_controlFlowStatements_Part4;

public class task47 {

	public static void main(String[] args) {
		
		//Task47
		//Write a program that the user to declare a positive integer.
		//It should then print the multiplication table of that number
		
		//Multiplication table for 7
		//---------------------------
		//7*1=7
		//7*2=14
		//7.....
		//7......
		//7*10=70
		
		
		int num=7;
		
		System.out.println("MultiplicaTION table for " + num );
		System.out.println("------------------------------------");
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
