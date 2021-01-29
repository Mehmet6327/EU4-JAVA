package Methodlar;

public class MethodwithCount {

	public static void main(String[] args) {
     
		  //Count from  1 to 10 print that bro
		
		
		countFrom1To10();
		countFrom1To50();
		countEvenNumberFrom1to50();
		counOddNumberFrom1to50();
		counOddNumberFrom1to55();
	}
	public static void countFrom1To10() {
		for (int i = 0; i <10 ; i++) {
			System.out.print(i + " ");
			
		}
		
			System.out.println();	
			}
	
	public static void countFrom1To50() {
		
		for (int i = 0; i <50 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
     public static void countEvenNumberFrom1to50() {
    	 for (int i = 0; i < 50; i++) {
    		 if(i%2==0) {
    			 System.out.print(i + " ");
    		 }
			
		}
    	 System.out.println();
     }
     public static void counOddNumberFrom1to50() {
    	 for (int i = 0; i < 50; i++) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}
    	 System.out.println();
     }
     public static void counOddNumberFrom1to55() {
    	 for (int i = 1; i <50; i++) {
    		 if(i%2!=0) {
    			 System.out.print(i + " ");
    			 
    		 }
			
		}
     }
}
