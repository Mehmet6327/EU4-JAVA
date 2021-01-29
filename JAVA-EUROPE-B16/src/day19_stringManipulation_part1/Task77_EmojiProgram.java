package day19_stringManipulation_part1;

import javax.xml.stream.events.Characters;

public class Task77_EmojiProgram {

	public static void main(String[] args) {

//		Task77
//		Create a emoji program:
//    1-Check if emoji has 2 Characters.class if it is not, print "invalid emoji"
//    2-Valid emojis:
//    	  Starting with:=> :)Smile,:(Sad,:/Upset,:pPlayful,Otherwise invalid
//    	  Starting with:=> ;)Wink, ;0Surprised, Otherwise invalid
		
		
		
           String emoji = ":)";      
		
		//check if it does not equal to 2 chars
		
		if(emoji.length() != 2) {
			System.out.println("Invalid Emoji");
			return; //stop execution
		}
		
		//if code reaches this point, then emoji is 2 chars
		//get first and second chars and assign to variables
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first==':') {
			if(second==')') {
				System.out.println("Smile");
			}else if(second=='(') {
				System.out.println("Sad");
			}else if(second=='/') {
				System.out.println("Upset");
			}else {
				System.out.println("Unknown emoji");
			}
			
		}else if(first==';') {
			if(second==')') {
				System.out.println("Wink");
			}else if(second=='0') {
				System.out.println("Suprised");
			}else {
				System.out.println("Unknown emoji");
			}
		}else {
			System.out.println("Invalid");   //   ))
		}
		

		
		
	}

}
