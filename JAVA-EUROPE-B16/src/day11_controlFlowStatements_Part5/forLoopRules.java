package day11_controlFlowStatements_Part5;

public class forLoopRules {

	public static void main(String[] args) {
		
		

		//1-Creating an infinite loop 
		//components of the for loop are each optional
	
//	//	for( ; ; ) {
//			System.out.println("Hello");
//	}
//	
//		int a=1;
//		
//		for( ;a<=5;a++) {
//			System.out.println(a);
//		}
//		
//		for( ;  ; a++) {
//			System.out.println(a);
//		}
//		
//		for( ;a<=5;) {
//			System.out.println(a);
//	//	}
		
		
		
		
		
		
		
		
		
		//2.) Adding Multiple Term to the for statement
				int x=0;
				for(long y=0,z=5 ; x<5 && y<10 ; x++, y++) {
					System.out.print(y + " ");
				}
				System.out.println(x);
				
				//3-Redeclaring a variable in the init block
				
//				int x = 0;
//				for(long y=0,x=4; x<5&&y<10; x++,y++) { //does not compile
//					System.out.println("Hello");
//				} 
				
//				int x = 0;
//				long y = 0;
//				
//				for(y=1,x=4 ; x<5 && y<10 ; x++,y++) {
//					System.out.println("Hello");
//				}
				
				
				//4-Using incompatible data types in the init block 
				//the variables in the init block must all be of the same data type
			
//				for(long y=0, int x=0; x<5 && y<10 ; x++,y++) {
//					System.out.println("Hello");
//				}
			
			  //5-Using loop variables outside the loop
				
//				for(long y=0,x=4; x<5&&y<10; x++,y++) {
//					System.out.println("Hello");
//				}
//				System.out.println(x); //does not compile
					
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
