package day29_arrays_Lab;

public class Lab4_Question17 {

	public static void main(String[] args) {

//		Question17
//		Write a method that accepts an array and print the difference between the largest 
//		    and smallest values in the array. 
		
        int[] x = {7,2,10,9};
		
		System.out.println(difference(x));

	}
	
	public static int difference(int[] arr) {
		
		//finding the biggest
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		
		//finding the smallest
		int min = max;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
		}
		
		return max-min;
		
		
		
		
		
		
		
		
		
		
		
	}

}
