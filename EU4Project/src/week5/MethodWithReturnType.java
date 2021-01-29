package week5;

public class MethodWithReturnType {

	public static void main(String[] args) {

		
		String message = getMyMotto();
		System.out.println("my favorite motto is " + message);
		       
//		double f = 54;
//		double c =(f-32) * 5 / 9;
//		System.out.println(c);
	
		double tempInSpain= farenheitToCelcius(80.9);
		System.out.println("54.9 Frenheit is US is " + tempInSpain + " celcius in EU");
		
		System.out.println(       farenheitToCelcius(81)      );
	}
	        
	
	
	      //return keyword has 2 usage :
	     // return a value out of a method that return a value 
    	//exit the method early (ANY METHOD INCLUDING  void method )
	
	
	     public static double farenheitToCelcius(double f) {
	    	 
	    	 double c =(f-32) * 5/9;
	    	 return c ;
	    	 //System.out.println("); NO WE CAN NOT BECAUSE IT WILL BE UNREACHABLE CODE 
	     }
	  	
	        //tempreture converter F-->> C 
	        
	    
	
	
	
	
	
	
	
	
	         public static  String getMyMotto() {
	        	 
	        	 
	        	 return "Happy wife happy life";
	        	 
	         }
  
	         
	         
	         
	         
	         
	         
}
