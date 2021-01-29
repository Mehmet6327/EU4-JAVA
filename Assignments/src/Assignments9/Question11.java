package Assignments9;

public class Question11 {

	public static void main(String[] args) {

		
 /*		Question-11

		We have a message variable already declared and assigned value in this format

		Sender:<Mike Smith>. From Number:[202-123-3456]. 
		Message:{I love programming and problem solving}

		Declare variables: sender, phoneNumber, messageBody

		By using String methods: 
		retrieve related information from SMS message string and assign it to those 3 variables and 
		print each variable in a separate line

		Sample Output:

		Sender: Mike Smith
		Phone Number: 202-123-3456
		Message body: I love programming and problem solving
		
	*/	
		
String str = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		
		System.out.println("Sender: " + Sender(str));
		System.out.println("Phone Number: " + PhoneNumber(str));
		System.out.println("Message Body: " + MessageBody(str));
		

	}
	
	public static String Sender(String name) {
		
		String a = name.substring(name.indexOf("<")+1 ,name.indexOf(">"));
		
		return a;
		
	}
	
	public static String PhoneNumber(String number) {
		
		String b = number.substring(number.indexOf("[")+1 ,number.indexOf("]"));
		
		return b;
		
	}
	
	public static String MessageBody(String message) {
		
		String c = message.substring(message.indexOf("{")+1 ,message.indexOf("}"));
		
		return c;
	
	
		
		
	}

}
