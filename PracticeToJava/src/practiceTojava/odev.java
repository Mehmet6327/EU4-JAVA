package practiceTojava;

import java.util.Scanner;

public class odev {

	public static void main(String[] args) {

		
		
		
    Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first year:");
		int f_year=scan.nextInt();
		
		System.out.println(leapYear(f_year));
		
		System.out.println("Enter last year:");
		int l_year=scan.nextInt();
		printLeapYear(f_year,l_year);
	}
	
	public static boolean leapYear(int year) {
		 boolean isLeap=false;
		if(year%4 == 0) {
			if(year%100 == 0) {
				if (year%400 == 0){
					return isLeap=true;
					}else{
						return isLeap=false;
					}
				}else {
					return isLeap=true;
				}
			}else {
				return isLeap=false;
			}
	}
	
	public static void printLeapYear(int f_year, int l_year) {
		boolean isLeap=false;
		
		for(int i=f_year; i<=l_year; i++) {
			
			if(i%4 == 0) {
				if(i%100 == 0) {
					if (i%400 == 0){
						isLeap=true;
						}else{
							 isLeap=false;
						}
					}else {
						 isLeap=true;
					}
				}else {
					isLeap=false;
				}
		    if(isLeap) {
		    	System.out.print(i + ", ");
		    }
		}
		
	}
		
		
	

}
