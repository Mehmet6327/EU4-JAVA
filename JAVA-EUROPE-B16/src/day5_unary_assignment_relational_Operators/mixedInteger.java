package day5_unary_assignment_relational_Operators;

public class mixedInteger {

	public static void main(String[] args) {
		// integer + integer = olur 
		//fakat interin karsisina daha buyuk bi ver cikarsa buyuk olan yazilir.
		
		int i1 =5;
		int i2 =10;
		float f1 = 15.5f;
		double d1= 20.5;
		
		
		//example 
		int res1 = i1 +i2; //i1 ile i2 bakilir hangisi buyuk ise basa o yazilir.
		float res2 = i1 +f1;
		double res3 = i2 + d1;
				
		// don't forget that ;
		// byte-<short-<int-<long-<float-<double 
		// buyukten kucuge doru siralama bu sekildedir.
		
		short firstNumber =10;
		short secondNumber=20;
		
		int thirdNumber   = firstNumber+secondNumber;
		short thirdNumber2= (short)(firstNumber+secondNumber);
		
		
		
		//byte b1=20;
		//byte b2=2;
		//byte b3= (byte)(b1*b2);
		
		int b1=126;
		int b2=1;
		
		byte res  = (byte)(b1+b2); //CASTING IS REQUIRED.
		byte res4 = 126 + 1; //NO CASTING IS REQUIRED. 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
