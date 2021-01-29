package AssessmentTest2;

public class Question12 {

	public static void main(String[] args) {
		//What will be the output of this code?
				int i=0, j=0;
				boolean t=true,r;
				
				r=(t && 0 <(i+=1));
				r=(t && 0 <(i+=2));
				r=(t || 0 <(j+=1));
				r=(t || 0 <(j+=2));
				
				System.out.println(i + " " + j);
				
				
	}

}
