package day10_controlFlowStatements_Part4;

public class task42_SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		
		         //Task-42
      //Write a program that display sum of even and odd numbers 
	     	//betweeen  1 and 100 excluding 100
		
		  
		 int sumEven=0;
		 int sumOdd=0;
		 
		 for(int i=1;i<100;i++) {
			 
			 if(i%2==0) {
				sumEven=sumEven+i;
			 }else {
				 sumOdd=sumOdd+i; 
				 
			 }
			 
		 }
		
		System.out.println("Sum of even number " + sumEven);
		System.out.println("Sum of even number " + sumOdd );
		
		
		
		
		
		
		
		

	}

}
