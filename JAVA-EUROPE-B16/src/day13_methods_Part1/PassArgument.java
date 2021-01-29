package day13_methods_Part1;

public class PassArgument {

	public static void main(String[] args) {
		
		
		int x = 25;
		displayValue(10);
		
		displayValue(x);
		//direk x in degerini yazar asaguya 
		
		displayValue(x*4);
		//x degerini 4 ile carp o da 25*4=100
		

	}
	   public static void displayValue(int num) {
		   System.out.println("The value is " + num);
		   // bunun cevabu 10
		   
		   System.out.println("The value is " + num * 2);
		   //bunun cevabi 10*2=20 eder 
	   }
	   public static void displayValue() {
		   System.out.println("5");
		   //bu yazmaz asagiya yukarida cagirmadigin icin 
	   }

	   
	   public static void login() {
		   //1.)open browser
		   //2.)put username 
		   //3.)put password
		   
	   }
}
