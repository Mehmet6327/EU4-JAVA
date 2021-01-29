package practiceTojava;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		
		
		 int[] number = new int[5];
		    number[2] = 50;
		    number[0] = 10;
		    number[4] = 40;
		    number[3] = 20;
		    number[1] = 30;
		    System.out.println(Arrays.toString(number));
		    String[] theNamesOfGroup16 = {"Anisa", "Mahri", "Sümeyra", "Dilek"};//4
		    System.out.println(theNamesOfGroup16.length);//4
		    System.out.println("=========================================");
		    for (String stringName : theNamesOfGroup16) {
		        System.out.println(stringName);
		    }
		    System.out.println("===========================================");
		    for (int i = theNamesOfGroup16.length-1; i >=0; i--) {
		        System.out.println(theNamesOfGroup16[i]);
		    }
		    System.out.println(Arrays.toString(theNamesOfGroup16));
		

		
		
		
		
		
		
		
		
	}

}
