package practiceTojava;

import java.util.Scanner;

public class LoopileScannerbirlikte {

	public static void main(String[] args) {

		
		
//		1 cevap 
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = scan.nextInt();
//		
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <=i ; j++) {
//				System.out.print(j + " ");
//			}
//			
//			System.out.println();
//			
//		}

         
		
//		exercise 2
//		6:47
//		int num =6;
//				
//				
//				for (int i = 0; i <= num; i++) {
//					for (int j = 1; j <= num-i ; j++) {
//						System.out.print(j + " ");
//					}
//					
//					System.out.println();
//				}
//		

//		int rows = 6;
//		
//		for (int i = 1; i <=rows; i++) {
//			for (int j = rows; j>i; j--) {
//				System.out.print("  ");
//			}
//			for (int k = i; k >=1; k--) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
//		}
//		
//		
		
		
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter one number for getting your fancy shape");
		int rows = scan.nextInt();
		
		
		shape(rows);
		shape(7);
		shape(3);
		shape(8);
		
	}
	public static void shape(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		
		
		
         
	}

}
