package Assignment6;

public class Question2 {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4 5 6
//		1 2 3 4 5 6 7
//		
//		
		
		
		
		
		for(int j=7; j>=1; j--) {
			  for(int m=1; m<=j; m++) {
				  System.out.print(m+" ");
			  }
			  System.out.println();
		  }
		for(int i=1; i<=7; i++) {
			for(int p=1; p<=i; p++) {
					System.out.print(p+" ");
				
				}	System.out.println();
			}
		
		

	}

}
