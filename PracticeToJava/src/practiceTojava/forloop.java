package practiceTojava;

import java.util.Scanner;

public class forloop {
public static void main(String[] args) {
	
	
	
	  Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number between 1-12: ");
	  int a = scan.nextInt();
      for(int i=1; i<=10; i++){
			  System.out.println("12 X "+i+ " = " + 12 * i );
     }
	
	
}
}
