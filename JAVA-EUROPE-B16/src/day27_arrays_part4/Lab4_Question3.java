package day27_arrays_part4;

import javax.lang.model.element.Element;

public class Lab4_Question3 {

	public static void main(String[] args) {

//		Question3
//		
//		Write a method that accepts 2 arrays and checks the lengths of the arrays first.
//		If lengths are more than 1, it print true if the arrays have the same first element or 
//		they have the same last Element .
//		If the length of the array is not more than 1,
//		prints the array1 is not a valid array or array2 is not a valid array.
		
		int[] a = {1,2,3};
		int[] b = {7,3};
		
		System.out.println(commonEnd(a, b));

	}
	
	public static String commonEnd(int[] x, int[] y) {
		
		if(!(x.length>1)) {
			return "Array 1 is not valid";
		}
		if(!(y.length>1)) {
			return "Array 2 is not valid";
		}
		
		
		if(x[0]==y[0] || x[x.length-1]==y[y.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
		
		
		
		
	}

}
