package Methodlar;

public class MethodWithParameter1 {

	public static void main(String[] args) {
    
		
		checkVotingEligibility(12);
		checkVotingEligibility(30);
		countFrom1toN(50);
		
	}
	public static void checkVotingEligibility(int age) {
		if(age>18) {
			System.out.println("Oyunu Kullan");
		}else {
			System.out.println("Oyunu kullanamazsin");
		}
		System.out.println();
	}
   public static void countFrom1toN(int endingNumber) {
	   for (int i = 0; i <=endingNumber; i++) {
		   System.out.print(i + " ");
		
	}
   }
}













