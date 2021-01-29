package week5;

public class MethodPractice {

	public static void main(String[] args) {

		
		
		
		//Method : reusable block of code with a name 
		//optionally with parameters and return type
		
		
		sayHello();
		sayHelloTo("Omer");
		sayHelloWithFullName("Mehmet","Buyukertas");
		
	}
	
	//method parameters only can be used inside method
	
	public static void sayHelloWithFullName(String firstName, String lastName) {
		System.out.println("Hello my friend " + firstName + "  " + lastName);
	}
	
	
	
	
	  public static void sayHelloTo(String name) {
		  System.out.println("Saying hello to " + name);
	  }
	
	   public static void sayHello() {
		   
		   
		 System.out.println("Hello from Cybertek");
	     System.out.println("Welcome to Cybertek");
			
		   
	   }

}

























