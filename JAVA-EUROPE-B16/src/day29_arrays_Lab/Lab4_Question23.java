package day29_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question23 {

	public static void main(String[] args) {

		
//		Question23
//	Write a method that accepts a number and create and prints a new array of length number,
//	containing the number 0,1,2,.accepts..accepts..accepts number-1 
		
		
		
		System.out.println(Arrays.toString(fizzArray(8)));
	}
	
	public static int[] fizzArray(int x) {
		
		int[] array = new int[x];
		
		for(int i=0;i<array.length;i++) {
			array[i]=i;
		}
		
		return array;
		
		
		
		
	}

}
