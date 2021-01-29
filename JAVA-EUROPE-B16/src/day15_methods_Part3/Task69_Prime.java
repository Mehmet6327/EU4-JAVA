package day15_methods_Part3;

public class Task69_Prime {

	public static void main(String[] args) {

		
//		       Task69
//	A prime number is a number that is evenly divisible only by itself and 
//	1.For example, the number 5 is prime umber it can be evenly divided only by 1  and 5
//The number 6, however, is not prime number because it can be divided evenly by 1,2,3, and 6
//		
//		
//		Write a method named isPrime which takes an integer as an argument and 
//		returns true if the argument is a prime number, or false otherwise.
//		
//		Note: 0 and 1 are not prime numbers. 
//		The 2 is the only even prime number because all the other even number 
//		can be divided by 2.
//		
		if(isPrime(4)) {
			System.out.println(" 4 is a prime number");
		}else {
			System.out.println("4 is not a prime number");
		}
		
	}

	        public static boolean isPrime(int number) {
	        	
	        	boolean flag =true;
	        	if(number==0 || number ==1) {
	        		
	        		flag=false;
	        		
	        	}else {
	        		for(int i=2;i<number;i++) {
	        			
	        			if(number%i==0) {
	        				flag=false;
	        				
	        				break;
	        				
	        			}
	        		}
	        	}
	        	 
	        	          return flag;
	        	  
	        }
}

                          














