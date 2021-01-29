package day14_methods_PartsandLabs;

public class Lab1_StringTimes {

	public static void main(String[] args) {
        //Question-1
	//Write a method that accepts a string a non-negative number, 
	//and prints a larger string that is number copies of the original String
	
//	stringTimes("Hi",2); = > HIHI 
//    stringTimes("Hi",2); = > HIHI	
//	stringTimes("Hi",2); = > HIHI
	
	
	    stringTimes("Hi",2);
			
		}
	
	   public static void stringTimes(String string, int number) {
		   String str = "";
		   for(int i=0;i<number;i++){
			   str = str + string;
			   
		   }
		   System.out.println(str);
	   }

}
