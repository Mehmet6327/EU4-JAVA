package day27_arrays_part4;

public class Lab4_Question1 {

	public static void main(String[] args) {

		
//		Question1
//		
//		Write a method that accepts an array and return true if 6 appears as either the first
//				Or last element in the array.The array will be length 1 or more.
//				
				
		int[] x = {1,2,6};
		int[] y = {6,1,2,3};
		int[] z = {13,6,1,2,3};
		int[] k = {1};
		
		//calling the method
		System.out.println(firstLast6(x));
		System.out.println(firstLast6(y));
		System.out.println(firstLast6(z));
//		System.out.println(firstLast6(k));
		
        


	}
	
	public static boolean firstLast6(int[] arr) {
		
		if(arr.length<1) {
			return false;
		}
		
		if(arr[0]==6 || arr[arr.length-1]==6) {
			return true;
		}else {
			return false;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
