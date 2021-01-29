package day23_stringManipulationLab_randomClasss;

public class Question11 {

	public static void main(String[] args) {

//    Question 11
//    
//    Return the number of times that the string "hi" appears anywhere in 
//    the given string.
//    
//    countHi("abc hi ho")-->>1
//    
//    countHi("ABChi hi")--->>2
//    
//    countHi("hihi")------->>2
    
		
		String str = "abc hi hohi";  
		int counter = 0;
		for(int i=0;i<str.length()-1; i++) {
			if(str.substring(i, i+2).equals("hi")){
				counter++;
			}
		}
		
		System.out.println(counter);
		
		
	}

}
