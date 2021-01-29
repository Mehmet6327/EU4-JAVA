package day29_arrays_Lab;

public class Lab4_Question16 {

	public static void main(String[] args) {

		
//		Question16
//	Write a method that accepts an array and prints the number of even numbers in the array 
		
		
int[] x = {2,1,2,3,7};
		
		System.out.println(countEvens(x));
		
	}
	
	public static int countEvens(int[] arr) {
		
		int counter = 0;
		
		for(int value : arr) {
			
			if(value%2==0) {
				
				counter++;
				
			}
		}
		
		return counter;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
