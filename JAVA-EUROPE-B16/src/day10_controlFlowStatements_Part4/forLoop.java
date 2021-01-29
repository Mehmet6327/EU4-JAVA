package day10_controlFlowStatements_Part4;

public class forLoop {

	public static void main(String[] args) {
		
		//print 5 times hello 
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		//////************OR************************************
		
		
		for(int i=0 ; i<5 ; i++ ) {
			System.out.println("Mehmet");
			
		}
		
		
		
		// i     condition       action          increment(i++)  i=i+1
		// 0      TRUE          Print Hello            1
		//        TRUE          pRINT hELLO            2
		//        TRUE          print HELLO            3
		//        TRUE          print hello            4
		//        TRUE          print hello            5
		
		//        FALSE olana kadar devam eder...
		// YANI ANLAYACAGIN ISLEM DOGRUYSA HEPSINI YAZAAR YANLIS OLANA KADAR
		
		
	/*******************************************************************************/
		
		for(int i =1; i<=10; i++ ) {
			System.out.println("i = " + i);
		}
		
		
	/************************************************************************************/
		for(int a=5; a<=10; a++) {
			System.out.println(" a = " + a);
		}
	
		
	/************************************************************************************/
		
		for(int num=20; num>=10; num--) {
			System.out.println("num = " + num);
		}
		
	/****************************************************************************************/
		
	//	for(int Adem=50; Adem>41; Adem++ ) {
	//		System.out.println("Adem  = " + Adem);
	//	}
		
	/****************************************************************************************/
		for( int z=0; z<=100; z+=10) {
			System.out.println("z = " + z);
		}
	/***************************************************************************************/	
		
		for(int b=50; b>=0; b-=5) {
			System.out.println("b = " + b);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
