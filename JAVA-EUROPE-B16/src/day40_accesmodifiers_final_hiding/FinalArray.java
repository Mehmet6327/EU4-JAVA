package day40_accesmodifiers_final_hiding;

public class FinalArray {

	public static void main(String[] args) {


		final int[] TEAMS = {11,11};
		
		System.out.println(TEAMS[0]);
		
		TEAMS[0]=15;
		
		System.out.println(TEAMS[0]);
		
		int nums[] = new int[]{20,20,40};
		
		nums = new int [] {20,25,200};
		
		final int [] finalNuma = {23,66,44};
		
	//	finalNums = new int[] {1,2,3,4};
		
		final int A=5;
		final int B=4;
		final int[] XXX = {A,B};
		
		XXX[0] = 10;
		System.out.println(XXX[0]);
		
		
		
		
		
		
		
		
		
	}

}
