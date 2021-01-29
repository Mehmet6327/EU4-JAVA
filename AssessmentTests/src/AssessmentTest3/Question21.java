package AssessmentTest3;

public class Question21 {

	public static void main(String[] args) {
	//What will be the output of this code?
		
		int c=0;
		boolean flag=true;
		for(int i=0;i<8;i++) {
			while(flag) {
				c++;
				if(i>c || c>3) {
					flag=false;
				}
			}
		}
		
		System.out.println(c);
		
		//The answer is 4
	}

}
