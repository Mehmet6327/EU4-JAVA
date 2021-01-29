package week10;

public class StringPractice3 {

	public static void main(String[] args) {

		
		/*
		Remove duplicated characters
		"aabcca"

		"abc"
		*/
		
		
		String str = "aaaabbbbcccdddeeeffffgggghhhhhhiiiijjjjkkkkk";
		//"aabcca";

String result = "";  // "abc"

				// [a, a, b, c, c, a]	
for(String each  :   str.split("")  ) {

if( ! result.contains(each) ) {
	result += each;
}

}


System.out.println(result);
		





		
		
		
		
		
	}

}
