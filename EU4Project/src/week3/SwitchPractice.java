package week3;

public class SwitchPractice {

	public static void main(String[] args) {
		
		int seasonCode = 1 ; // 1,2,3,4
		// 1 : Spring  2: Summer 3 : Fall 4 : Winter 
		
		
		String season = "Summer" ;
		 switch(season) {
		 	case "Spring" : 
		 		System.out.println("picnic!!");
		 		break; 
		 	case "Summer" : 
		 		System.out.println("Swimming!!");
		 		break; 
		 	case "Fall" : 
		 		System.out.println("Hiking!!");
		 		break; 
		 	case "Winter" : 
		 		System.out.println("Snowboarding!!");
		 		break; 
		 	default : 
		 		System.out.println("KEEP CODING!!!!");
		 }
		
		
		
		
		
		
		
		
		
		//OR 
		
		
		
		/*if(seasonCode==1){
			System.out.println("Spring");
		}else if(seasonCode==2) {
			System.out.println("Summer");
		}else if(seasonCode==3) {
			System.out.println("Fall");
		}else if(seasonCode==4) {
			System.out.println("Winter");
		}else {
			System.out.println("INVALID ENTRY!!!!!");
		}

		*/
		
	}

}
