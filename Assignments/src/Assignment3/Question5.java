package Assignment3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		 /*Write a program that outputs the number of hours, 
         * minutes, and seconds that corresponds to input total seconds.

   -Declare int variables inputSeconds, hours, minutes, seconds
   -Initialize the inputSeconds

   -Using %(remainder) and / operators, find out how many whole hours, 
      minutes and seconds are in inputSeconds.
   -Assign values to the hours, minutes, seconds variables
   -Display the result

   Sample Output:

   inputSecond is 3695

  1 hours, 1 minutes, and 35 seconds*/		
	
	
	
	Scanner sc = new Scanner(System.in);
	int second=sc.nextInt();
	int hour;
	int minute;
	//int reminder;
	System.out.println("From total of "+second);
	hour=second/3600;
	second%=3600;
	minute=second/60;
	second%=60;
	
	System.out.println("Hours "+hour+" minute "+minute+" second "+second);
	
	

	}

}
