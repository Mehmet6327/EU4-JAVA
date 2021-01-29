package Assignment5;

public class Question11 {

	public static void main(String[] args) {
//		
//		Print the following output using nested for loops.
//
//		4       3       2      1
//
//		     3       2      1
//
//		         2       1
//
//		              1
//		
		for(int row = 4 ; row>= 1 ; row--) {
			
          
		for(int i = 1 ; i<= 4-row ; i++) {
			System.out.print("  ");
			
		}
		
		for(int col = row ; col>= 1 ; col--) {
			System.out.print(col  +  "  " );
		}
		 System.out.println();
		}	
		

	}

}
