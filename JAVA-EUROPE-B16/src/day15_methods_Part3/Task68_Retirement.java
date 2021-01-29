package day15_methods_Part3;

public class Task68_Retirement {

	public static void main(String[] args) {

		
//                Task68
//                Write two methods:
//                	1.calculateAge(yearBirth); and returns the age
//                	2.YearsUntilRetirement(name,year); and 
//                	display in the console following:
//                		"Mike retires in  36 years"
// 		         
//                		Example:yearsUntilRetirement("Mike", 1990);
//                	
		
		yearsUntilRetirement("Mike", 1994);
		
	}
            
	       public static int calculateAge(int yearBirth) {
	    	   return 2020-yearBirth;
	    	   
	    	   
	       }
	       
	       
	       public static void yearsUntilRetirement(String name, int year) {
	    	   int retiremenAge = 65-calculateAge(year);
	    	   System.out.println(name + " retires in " + retiremenAge + " years");
	       }
}
