package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question14 {

	public static void main(String[] args) {

//		Question14
//		Write a method that accepts 2 arrays and prints a new array containing all their 
//		                        elements
		
		
		
        int[] x = {1,2,3};
		
		int[] y = {3,4,1,1,1,1,1,6,7,8,9};
		
		int[] k = new int[x.length+y.length];
		
		for(int i=0;i<x.length;i++) {
			
			k[i]=x[i];
			
		} 
		
		int a = 0;
		for(int j = x.length;j<k.length;j++) {
			
			k[j]=y[a];
			a++;
		}
		
		System.out.println(Arrays.toString(k));
		
		
		
		
		
		
		
		
		
	}

}
