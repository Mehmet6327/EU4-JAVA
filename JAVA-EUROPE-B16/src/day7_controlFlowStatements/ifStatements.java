package day7_controlFlowStatements;

public class ifStatements {

	public static void main(String[] args) {
		
		// if onerisinde eger score karsisindakinden yanli ise asagiya bi sey yazmaz.
		// mesela  	
		//int score = 25;
		 //if (score>70) {
	   	//	 
		 //}
		// burda gordugunuz uzere score 70 buyulk diyor ama yanli yazildigi icin 
		//asagiya error vermez ve hic bir sey yazmaz. kusmus garibim..args.ahahha
		
		// ve en onemlisi acilis ve kapanis curly yani {} isareleri olmaz ise olmuyor.
		
		
		
		
		
		
		int score = 80;
		 if (score>70) {
			 
	System.out.println("Excellent");
	System.out.println("You passed with grade A");

		
		
		 }
		
		
		
		
		
		System.out.println("*****************************************");
		
		
		/////////////////////////////////////////////////////////////////////
		
		int sales, bonus;
		double commisionRate,salary;
		
		sales=52000;
		salary=10000;
		
		if(sales>5000) {
			bonus=500;
			commisionRate=1.12;
			
			salary=salary*commisionRate+bonus;
			
		
		}
		
		System.out.println("Salary = " + salary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
