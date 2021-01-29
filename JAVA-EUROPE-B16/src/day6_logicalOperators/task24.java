package day6_logicalOperators;

public class task24 {

	public static void main(String[] args) {
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		// b in memory : 2= > 3 = > 2 = > 1
		// res         : 3== 2 || 2 ===2 && 1 == 2;
		// F || T && F // T && F // F
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
	}

}
