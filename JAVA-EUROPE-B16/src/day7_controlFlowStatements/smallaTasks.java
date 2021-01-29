package day7_controlFlowStatements;

public class smallaTasks {

	public static void main(String[] args) {
		
	
		
		//1-Write an if statement that asssigns 5 to x when y is equal to 20 
		int x,y;
		y=20;
		x=5;
		
		if (y==20) {
			x=5;
			
		}
			System.out.println(" x= " + x + " y = " + y);
		
		
		//***************************************************************************
			
			//Write an if statements that multiplies payrate by 1.5 if hours  
			// is greater than 40 
			
	
			
			double payrate= 1000;
			int hours=40;
			
			if (hours>40) {
				payrate=payrate*1.5;
			}
			
			System.out.println(" payrate is " + payrate );
			
		
		
/// 3.) Write an if statement that sets the variable fees to 50 if the boolean 
			//variable max is true?
			
			
	boolean max = false;
	int fee=20;
	
	if(max==true) {
		fee=50;
		
	}
		System.out.println("Fee is " + fee);
		
//4.) Write an if statement that assigns 20 to the variable a if variable b is 50 and 
		//c is greater and equal to 100?
		
		
		int a = 100;
		int b = 20;
		int c =30;
		
		if (b==50 && c>=100) {
			
		}
				
		
		System.out.println("a = " + a);
		
		
	//5.)Write an if statement that prints "Ideal Temp" if the temp is between 
	///	70 and 80	
		
		
		int temp =65; // eger burasi 75 olursa sagidaki iki islem output yazilir.
		// 65 olursa eger sadece alttaki yazilir..
		if(temp>=70 && temp<=80){
			
			System.out.println("Ideal Temp");
			
		}
		
		   System.out.println("Not Ideal Temp");
		
	
	}

}
