package day14_methods_PartsandLabs;

public class Task66_DistanceTraveled {

	public static void main(String[] args) {

		
//		//Tash 66
//		//The distance a vehicle travels can be calculated as follows:
//		distance = speed * time
//				Write a method named distance that accepts a vahicle's speed and time
//				as arguments, and return the distance the vehicle has traveled.
	            
		         double distanceTraveled = distance(40,5);
		         System.out.println(distanceTraveled);
	
	}
	
	   public static double distance(double speed, int time) {
	    	double distanceTraveled = speed * time;
		    return distanceTraveled;
		
	}

}
