package day9_controlFlowStatements_Parts3;

public class day9switch_case_AssessmentTestcontinue {

	public static void main(String[] args) {
		
		
		  // 17.) What will be the output of this code?  
		   
		   
		  int x1=50, x2=75;
		  boolean b=x1>=x2;
		  
		  if(b=true) {
			  System.out.println("succes");
		  }else {
			  System.out.println("failure");
		  }

		
		
		  // 18.) What will be the output of this code?  
		
		int num=1234;
		
		if(num<100 && num>=1) {
			System.out.println("Its a two digit number");
		}else if(num<1000 && num>=100) {
			System.out.println("its a three digit number");
		}else if(num<10000 && num>=1000) {
			System.out.println("its a four digit number");
		}else if(num<100000 && num>=10000) {
			System.out.println("its a five digit number");
		}else {
			System.out.println("number is not bwetwwen 1 & 99999");
		}
		
		
		
		
		
		 // 19.) What will be the output of this code?  
		
		
		
		int var1=12;
		int var2=21;
		
		if(var1!=var2) {
			System.out.println(" var1 is not equal to var2");
		if(var1>var2) {
			System.out.println("var1 is greater than var2");
		}else {
			System.out.println("var2 is greater than var1");
		}
		}else {
			System.out.println("var1 is equal to var2");
		}
		
		
		 // 20.) What will be the output of this code?  
		
	int monthNumber =11;
	
	switch(monthNumber) {
	case 12:
	case 1:
	case 2:
		System.out.println("snow in the winter");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("green grass in the spring");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("sunshine in the summer");
		break;
	case 9:
	case 10:
	case 11:
		switch(monthNumber) {
		case 10:
			System.out.println("halloween");
		break;
		case 11:
			System.out.println("thanksgiving]");
			break;
		}
		System.out.println("yellow leaves in the fall");
		break;
		default:
			System.out.println(monthNumber + " is not a valid month");
	}
	
	
	
	
	// 21.) What will be the output of this code?  
		
		
		char c='c';
		
		switch(c) {
		case 'a':
			System.out.println("apple");
		case 'b':
			System.out.println("bat");
			break;
		case 'c':
			System.out.println("cat");
			default:
				System.out.println("none");
		}
		
		
		
		// 22.) What will be the output of this code?  
		
		int x = (2+4*9/3)%5;
		switch(x) {
		case 0:
			System.out.println("hello");
		default:
			System.out.println("world");
		case 1: 
			System.out.println("good bye");
		case 2:
			System.out.println("bye");
		}
		
		
		// 23.) What will be the output of this code?  
		int i=5, f=6,d=3,e=1;
		
		if(i!=f) {
			e++;
			
		}
		if ((f+d)==(e+=2)) {
			e--;
        }
		
		System.out.println(e);
		
		// 24.) What will be the output of this code?  
		
		boolean b1=false;
		boolean b2=false;
		
		if(b2!=(b1=!b2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		// 25.) 
		
		//in multi-brach if statement we can give as many "else-if " statements as we want
		
		
		// of course that answer will be true ahaahahahahahaha
		
		
		
		// 26.) when we declare if statemetn, it is mandatory to give the else block?
		
		// of course that answer will be false 
		
		
		
		
		// 27.) What will be the output of this code?  
		
		
		boolean X = true;
		boolean Y = !X==false;
		boolean Z = Y;
		
		if(X) {
			System.out.println("Hello Everyone");
			
		} if (Y) {
			System.out.println("Today is great day");
			
		}if (Z) {
			System.out.println("We have picnic on Saturday");
		}
		
		
		
		
		// 28.) What will be the output of this code?  
		
		char grade = 'A';
		boolean Passed = grade == 'A' || grade =='B';
		boolean Passed2= grade == 'C' || grade =='D';
		
		if(Passed || Passed) {
			System.out.println("You've passed the exam");
		}
		
		else {
	     System.out.println("You failed");
       }
		
		
		
		
		// 29.) What should be the condition in below code to able to print 123?
		
//		switch(condition) {
//		case 1:
//			System.out.println("1");
//			break;
//		case 2: 
//			System.out.println("2");
//			break;
//		case 3:
//			System.out.println("3");
//			break;
		}
		
		//the answer is none of the above........
		
		
		// 30.) Which of the following statements are coorect?(Choose all that appyl)
		
	    //	if(flag) {
		///	if(flag) {
		//		System.out.println("True False");
		//	}else {
		// System.out.println("True True");
   	     //	}
        //    }else {
	 //     System.out.println("False False");
        //}		
		
		// the answer that if flag true, it will print "True False"
		
		
     }


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
