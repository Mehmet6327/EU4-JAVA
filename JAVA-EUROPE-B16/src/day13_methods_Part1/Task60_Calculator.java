
package day13_methods_Part1;

public class Task60_Calculator {

	public static void main(String[] args) {

		//Write a method that accepts 3 parameters
//		1.)number
//        2.)number
//        3.)Operator(-,+,*,/)
//     
//    Sample output:
//    	calculator(6,3,"+") -->9
//    	calculator(6,3,"-") -->3
//    	calculator(6,3,"*") -->18
//    	calculator(6,3,"/") -->2
//    
    
    
    
		calculator(6,3,"+"); 
    	calculator(6,3,"-"); 
     	calculator(6,3,"*"); 
    	calculator(6,3,"/"); 
    
		
	}
	
	     public static void calculator(int num1, int num2, String operator) {
	    	 
	    	 switch(operator) {
	    	 case "+":
	    		 System.out.println(num1+num2);
	    		 break;
	    	 case "-":
	    		 System.out.println(num1-num2);
	    		 break;
	    	 case "*":
	    		 System.out.println(num1*num2);
	    		 break;
	    	 case "/":
	    		 System.out.println(num1/num2);
	    		 break;
	    		
	    		 
	    	 }
	     }
	

}
