package AssessmentTest2;

public class Question8 {

	public static void main(String[] args) {
		//What will be the output of this code?	
		
				int temperature=50;
				int upperLimit=70;
				int lowerLimit=30;
				
				if(temperature>=upperLimit) {
					System.out.println("soundAlarm");
					System.out.println("turnHeaterOff");
				}else if(temperature<lowerLimit){
						System.out.println("soundAlarm");
						System.out.println("turnHeaterOff");
				}else if(temperature==(upperLimit-lowerLimit)/2) {
					System.out.println("doingFine");
				}else {
					System.out.println("noCauseToWorry");
					
				
				}
				
				
				

	}

}
