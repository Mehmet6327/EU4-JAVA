package Lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//		Question-2
//
//		A bag of cookies holds 40 cookies. 
//		The calorie information on the bag claims that there are 10 serving in the bag 
//		and that a serving equals 300 calories.
//		write a program that lets the user enter the number of cookies he or 
//		she actually ate and then reports the number of total calories consumed.
		
		
		// in 1 bag 40 cookies
				// in bag 10 serving 40/10=4 in each serving has 4 cookies=300 calories
				// each cookie has 300/4=75 calories
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the number of cookies");
				int cookies=scan.nextInt();
				
				int calories=cookies*75;
				System.out.println(calories);
		
		
		
		
		
		
		
	}

}
