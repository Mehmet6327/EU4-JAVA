package ArithmeticOperators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
	int n1 =20;
	int n2 =10;
	
	 int Assignmet       = n1 = n2; //Assignment demek yani esittir demektir.
	 int Addition        = n1 + n2; // Addition demek yani toplamaktir.
	 int Subtraction     = n1 - n2; //Subtraction demek yani cikarmaktir.
	 int Multiplication  = n1 * n2; //Multiplication demek carpmaktir.
	 int Division        = n1 / n2; //division demek bolmektir.
	 int Remainder       = n1 % n2; //Remainder demek yuzdeliktir...

	 System.out.println(Assignmet + "," + Addition + "," + Subtraction + "," + Multiplication + "," + Division + "," + Remainder);          

	 
	 
	 //****************************************************
	 
	 int num1 = 4 + 3 * 2;
	 System.out.println(num1);
	 
	 
	 //****************************************************8******
	 
	 
	 num1 = (4 + 3) * 2;
	 System.out.println(num1);
	 
	 //**************************************************************************
	 
	 num1 = (4 +3) * 2 + 4 / 2;
	 System.out.println(num1);
	 
	 //**************************************************************************
	 
	 byte   b = 10;
	 short sh = 20;
	 //short total = b + sh; will not compile yani int olmasi gerekiyor  burda.
	 int total = b + sh;
	 System.out.println(total);
	 
	 
	 //**************************************************
	 
	 double d = 10.5;
	 int i = 4;
	 //int j = d * i; // int yazdiginda eror verir.
	 double j = d * i;
	 System.out.println(j);
	 
	 //****************************************************************
	 
	 double d2 = 3.4;
	 double d3 = d - d2;
	System.out.println(d3);
	 
	 
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
