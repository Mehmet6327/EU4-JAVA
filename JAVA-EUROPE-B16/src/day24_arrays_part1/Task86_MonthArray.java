package day24_arrays_part1;

import java.util.Scanner;

public class Task86_MonthArray {

	public static void main(String[] args) {

//		Task86
//	Create an array that holds 12 months names
//	user should be able to enter month index and output should be:
//		"The month name is <MonthName>"
		Scanner sc = new Scanner(System.in);
		
		String [] myArray = new String[12];
		
		myArray[0]= "January";
		myArray[1]= "February";
		myArray[2]= "March";
		myArray[3]= "April";
		myArray[4]= "May";
		myArray[5]= "June";
		myArray[6]= "July";
		myArray[7]= "August";
		myArray[8]= "September";
		myArray[9]= "October";
		myArray[10]= "November";
		myArray[11]= "December";
		
		System.out.print("Enter your month index number:");
		int index = sc.nextInt();
		
		System.out.println("The month is " + myArray[index]);
	}

}
