package day4_arithmeticOperators;


public class aritmeticOperators {

	public static void main(String[] args) {
		//Addition Operator +
		System.out.println(55+5);
		int chairs=140;
		
		System.out.println(chairs+2);
		chairs=chairs+2;
		
		int morechairs=chairs+5;
		System.out.println(morechairs);
		
		int tables =130;
		int total= tables+chairs;
		System.out.println(total);
		System.out.println(tables+chairs);
		
		//Subtracion 
		 double balance = 1200.50;
		 double transaction = 56.44;
		 System.out.println(balance-transaction);
		 balance =balance-transaction;
		 System.out.println(balance);
		
		 //Create a variable LinesOfCode and assign 50 and print "Lines of Code 50"
		 //delete 2 lines
		 //decrease the value of linesOfCode by 2 and print "Lines of Code 48"
		 
		 int linesOfCode= 50;
		 System.out.println("Lines of code " + linesOfCode );
		 
		 linesOfCode=linesOfCode-2;
		 System.out.println("Lines of code " + linesOfCode );
		 
		 //Multiplication*
		 System.out.println(22*2);
		 
		 System.out.println(11*0);
		 
		 
		 int classes = 5;
		 System.out.println(linesOfCode * classes);
		 int totalLinesOfCode = linesOfCode * classes;
		 System.out.println("Total Lines of Codes = " + totalLinesOfCode);
         
		 //DIVISION
		 
		 System.out.println(10/2);
		 System.out.println(60/3);
		 
		 //System.out.println(11/0); //throw error while running the code 
		 
		 
		 //REMAINDER %
		 System.out.println(10%2);
		 System.out.println(9%2);
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
