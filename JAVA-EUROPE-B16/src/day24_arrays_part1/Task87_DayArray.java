package day24_arrays_part1;

import java.util.Scanner;

public class Task87_DayArray {

	public static void main(String[] args) {

//		Task87
//		
//		Create an array that holds the days 
//		User should be able to enter the day index and output should be:
//			
//			"Today is Monday"
		
         Scanner sc = new Scanner(System.in);
		
		String [] days = new String[7];
		
		days[0]= "Monday";
		days[1]= "Tuesday";
		days[2]= "Wednesday";
		days[3]= "Thursday";
		days[4]= "Friday";
		days[5]= "Saturday";
		days[6]= "Sunday";
		
		
		System.out.print("Enter your day index:");
		int index = sc.nextInt();
		
		System.out.print("Today is " + days[index]);
		
		
		
		
		
		
		
	}

}
