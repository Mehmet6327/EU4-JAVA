package Assignment8;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		
//		Question-4
//
//		Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
//			
//			
//		*****
//		*   *
//		*   *
//		*   *
//		*****
//		
//		hint: you will need to use two nested for loops for that, 
//		and an if that checks if its the last or first iteration of the loop 
//		(so you will know whet to print "*" or " ")
//		
//		
		
		
		HollowRect();
	}
	public static void HollowRect() {
		
		
		
	
		int rows,columns;
		    Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows=scan.nextInt();
		System.out.print("Enter the nunber of rows: ");
		columns=scan.nextInt();
		for (int i=1; i<=rows; i++){
		    for (int j=1; j<=columns; j++){
		    if(i==1||i==rows||j==1||j==columns){
		        System.out.print("*");
		    }else{
		        System.out.print(" ");
		    }
		    
		}
		    System.out.print("\n");
		}
		}
		}