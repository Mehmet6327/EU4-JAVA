package day23_stringManipulationLab_randomClasss;

public class Question13 {

	public static void main(String[] args) {

//		Question13
//		Given a string, return a string whre for every char in the original,
//				there are two chars.
//				
//		doubleChar("The")-->>"TThhee"
//			
//		doubleChar("AAbb")-->>"AAAAbbbb"
//
//		doubleChar("Hi-There")-->>"HHii--TThheerree"
//		
		
		String str = "Hi-there"; 
		String newString="";
		for(int i=0;i<str.length();i++) {
		newString = newString +	str.substring(i,i+1).concat(str.substring(i,i+1));
			
		}
		 System.out.println(newString);
		
	}

}
