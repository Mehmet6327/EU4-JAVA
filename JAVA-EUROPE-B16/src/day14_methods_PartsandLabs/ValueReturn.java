package day14_methods_PartsandLabs;

public class ValueReturn {

	public static void main(String[] args) {

      
		System.out.println(sum(2,3));
       
        int x= sum(2,3);
       
        // ve sonra baska bi islem daha yapariz 
        
       System.out.println(x*5);
       
       System.out.println(x);
		
		
	}
	
          public static int sum(int num1,int num2) {
        	  
        	  int result;
        	  result = num1 + num2;
        	  
        	  return result;
          }
}
