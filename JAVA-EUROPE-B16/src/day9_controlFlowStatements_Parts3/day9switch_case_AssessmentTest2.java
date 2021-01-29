package day9_controlFlowStatements_Parts3;

public class day9switch_case_AssessmentTest2 {

	public static void main(String[] args) {
		
		// 1.) What will be the output this code? 
		int one =1;
		String two ="2";
		System.out.println(two+1+one);
		System.out.println(one+1+two);
		
				
	///*********************************************************************************	
		
		// 2.)What will be the output of this code?
		
		String string1 = "Java Exercices";
		String string2 ="do more " + string1;
		String string3 = string2;
		System.out.println("To able to be successful, we need to " + string3);
		
		
		// 3.)What will be output of this code?
		
	   System.out.println(3 * (4+4*4) / 2 - 6);
		
	   
	   // 4.) What will be output of this code?
	    
	   int grade =55;
	   
	   if(grade>40) {
		   System.out.println("congrat");
	   if(grade<60||grade==60) {
			   System.out.println("You passed");
	     }
		
	   }else {
		   System.out.println("You failed");
		   
	   }
		
		
		// the answer is congrat you passed
	   
	   
	   
	   // 5.)What will be output of this code?
	   
	   int x = 4;
	   int y = x * 4 - x++;
	   
	   if(y<10) {
		   System.out.println("Too Low");
		}else if(y>10 && y<=15) {
			System.out.println("Just Right");
		}else {
			System.out.println("Too high");
			
		}
	   
	
	   
	   // 6.)What will be the output of this code?
	   
	   int x1 =50, x2=75;
	   boolean b=x1>=x2;
	   
	   if(b=true) {
		   System.out.println("Succes");
	    }else {
	    	System.out.println("Failure");
	    }
	   
	   
	   
	   // 7.) What will be the output of this code?
	   
	   if(true) {
	   if (false) {
			   System.out.println("a");
	   }else {
			   System.out.println("b");
		   }
	   }
	   
	   
	  // 8.) What will be the output of this code?
	   
	   int temperature = 50;
	   int upperLimit  = 70;
	   int lowerLimit  = 30;
	   
	   if (temperature>=upperLimit) {
		   System.out.println("soundAlarm");
		   System.out.println("turnHeaaterOff");
	   }else if(temperature<lowerLimit) {
		   System.out.println("soundAlarm");
		   System.out.println("turnHeaterOn");
	   }else if (temperature==(upperLimit-lowerLimit) / 2 ) {
		   System.out.println("doingFine");
	   }else {
		   System.out.println("noCauseToWorry");
	   }
	   
	   
	   // 9.)What will be the output of this code?
	   
	   int i,c;
	   double d,f;
	  
	   i=4;
	   f=4.3;
	   d=1.8;
	   c=0;
	   
	   if(i!=c) {
		   c++;
		   if((f+d)==(c+=2)) {
			   System.out.println(c);
		   }
	   }
	   System.out.println(c);
	   
	   
	   
	   // 10.) What will be the output of this code?
	   
	boolean flag =false;
	
	if(false) {
		flag=!flag;
		System.out.println(flag);
		
	}
	   
	   ///The answer is; no error, but it will not print anything
	   
	   
	   
	   // 11.) Which of the following expressions evaluate to true?
	            //(select the two correct answers)
	
	      // (!true)
	      // (false||true)
	      // (4<=4)
	      // (true&false)
	   
	   // the answer are  (false||true) and (4<=4)
	   
	   
	   
	 // 12.) What will be the output of this code?
	   
	   int I=0, j=0;
	   boolean t=true,r;
	   
	   r=(t && 0<(I+=1));
	   
	   r=(t && 0<(I+=2));
	   
	   r=(t || 0<(j+=1));
	   
	   r=(t || 0<(j+=2));
	   
	   System.out.println(I + " " + j );
	   
	   
	   // 13.) What will be the output of this code?
	   
	   int a=7, m=10;
	   ++m;
	   a = a-- + m--;
	   System.out.println(a + " " + m );
	   
	   // the answeer will be that 18 10
	   
	   // 14.) What will be the output of this code?
	   
	   int temp     = 65;
	   int roomTemp = 72;
	   int carTemp  = 75;
	   
	   System.out.println(temp>=65 && ( (roomTemp== (temp+=2)) && (carTemp!=temp)));
	   
	   // 15.) What will be the output of this code?
	   
	   int n = 1 + 2 + 3 * 4;
	   int z = 2 * 3 + 4;
	   int total = n+z;
	   System.out.println(total);
	   
	   
	   // 16.) What will be the output of this code?
	   
	  boolean b1=false;
	  boolean b2=false;
	  
	  if((b2=b1)==false) {
		  System.out.println("true");
	  }else {
		  System.out.println("false");
	  }
	   
	   
		  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
