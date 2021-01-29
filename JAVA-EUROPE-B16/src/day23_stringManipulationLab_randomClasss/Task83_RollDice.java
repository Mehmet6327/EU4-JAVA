package day23_stringManipulationLab_randomClasss;

import java.util.*;


public class Task83_RollDice {

	public static void main(String[] args) {

//		Task83
//   Dr.Kimura teaches an introductory statics class and has asked you to write a program 
//    that he can use in class to simulate the rolling dice.The program should randomly
//    generate two numbers in the range of 1 through 6 and display them.
//    In your interview with Dr.Kimura, you learn that he would like to use the program to
//    simulate several rolls of the dice, one after the other.
		
		
		int dice1;
		int dice2;
		String again="y";
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		while(again.equalsIgnoreCase("y")) {
			
			
			System.out.println("Rolling the dice....");
			dice1=rn.nextInt(6)+1; 
			dice2=rn.nextInt(6)+1;
			
			System.out.println("Their values are:");
			System.out.println(dice1 + " " + dice2);
			
			System.out.print("Roll them again (y=yes)?");
			again = sc.nextLine(); //y Y n
			
		}

		
		
		
		
		
		
	}

}
