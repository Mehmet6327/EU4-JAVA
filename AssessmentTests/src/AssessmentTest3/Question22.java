package AssessmentTest3;

public class Question22 {

	public static void main(String[] args) {
 //What will be the output of this code?
		
		label1: for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i+j-1>10) {
					break label1;
				}
			}
			System.out.println("hello");
		}
		
		//it will print hello 3 times 
		
		
	}

}
