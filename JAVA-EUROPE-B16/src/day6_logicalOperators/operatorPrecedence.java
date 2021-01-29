package day6_logicalOperators;

public class operatorPrecedence {

	public static void main(String[] args) {
		
		
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount< OrangesCount || OrangesCount >= PearsCount;
		// 20<30 || 30>=30 = > T || ----- = T
		
		System.out.println("comp = " + comp );
		
		
		
		
		
		
		
		
		
	}

}
