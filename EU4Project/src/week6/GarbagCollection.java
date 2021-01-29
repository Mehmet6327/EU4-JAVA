package week6;

public class GarbagCollection {

	public static void main(String[] args) {

		
		//process of cleaning up usued objects from the heap memory
		
		Computer c1 = new Computer();
		         c1 = null;
		
	    Computer c2 = new Computer();
	    c1 =c2;
	    c2= c1;
		         
		System.out.println("The end ");
		
		
		
		
		
	}

}
