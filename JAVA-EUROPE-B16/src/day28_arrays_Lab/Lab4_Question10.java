package day28_arrays_Lab;

public class Lab4_Question10 {

	public static void main(String[] args) {

//		Question10
//		
//		Write a method that accepts an array and prints true if the array contains 
//		2 twice or 3 twice
		
		
		int[] x  = {2,2,2,2,3};
		int[] y  = {2,3};
		
		System.out.println(double23(x));
		System.out.println(double23(y));


	}
	
	public static boolean double23(int[] arr) {
		
		int counter2 = 0;
		int counter3 = 0 ;
		
		for(int value : arr) {
			if(value==2) {
				counter2++;
			}else if(value == 3) {
				counter3++;
			}
		}
		
		if(counter2 == 2 || counter3 == 2) {    
			return true;
		}else {
			return false;
		}
		
		
		
		
		
		
		
		
	}

}
