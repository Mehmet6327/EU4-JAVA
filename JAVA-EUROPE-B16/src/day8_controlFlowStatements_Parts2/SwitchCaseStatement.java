package day8_controlFlowStatements_Parts2;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		String weather="mehmet";
		switch(weather) {
		// code olarak sunny,hot,windy,snow yazdigmizda kod olarak asagiya yazilir.
		// yanlis bi sey yazdigimizda ise deafult altta yazilir ornekte oldugu gibi
		//mehmet yazdimm deafult olarak asagiya yazildi
		
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any oyhrt weather");
		
		
		}
		
		
		

	}

}
