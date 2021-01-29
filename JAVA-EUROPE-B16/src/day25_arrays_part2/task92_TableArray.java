package day25_arrays_part2;

import java.security.DrbgParameters.Instantiation;
import java.util.Arrays;

import javax.lang.model.util.Elements;

import day24_arrays_part1.Array;

public class task92_TableArray {

	public static void main(String[] args) {

//		Task92
//		Write a java program to store numbers 1 to 10 in an array using data Instantiation.
//		Then write a for loop multipliy each member of above array by 19, 
//		this way you will get table off 19 stored in the above Array.
//		Finally write another for loop to print all the array Elements.
//		
//		You should get the following output:
//			19,38,57,76,95,114,133,152,171,190 
		
		
        int[]  numbers = new int[10];
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] = i+1;
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i] * 19);
		}
		System.out.println(Arrays.toString(numbers));
		
		
		
		
		
		
		
		
	}

}
