package week5;

public class MethodCallInDifferentClass {

	public static void main(String[] args) {

		//How do I reuse the static methods I created in other class
		System.out.println("Program Started");
		
		//you can call static methods you created using
		//ClassName.methodNames( pass arguments if needed)
		
		MethodPractice.sayHello();
		//task : call the rest of the methods her to test it out
		
		
		MethodPractice.sayHelloTo("Akbar");
		
		MethodPractice.sayHelloWithFullName("Mehmet","Buyukertas");
		
		System.out.println("Program Ended");
		
	}

}
