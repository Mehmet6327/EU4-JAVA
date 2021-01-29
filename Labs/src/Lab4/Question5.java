package Lab4;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {

		int[] x = {17,12,10,8};    		
		System.out.println(Arrays.toString(rotateLeft(x)));

	}
	
	public static int[] rotateLeft(int[] arr) {
		
		int x = arr[0]; //1
		
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = x;
		
		return arr;
		
		
		
		
		
		
		
		
		
		
	}

}
