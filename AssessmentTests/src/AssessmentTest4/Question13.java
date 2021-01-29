package AssessmentTest4;

public class Question13 {

	public static void main(String[] args) {

		
		String str = "JavaScript";
		System.out.println(getMsg(str));
		
		

	}
	public static String getMsg(String x) {
		String msg ="Input value must be ";
		msg = msg.concat("smaller than x");
		msg.replace("X", x);
		String rest = " and largher than 0";
		msg.concat(rest);
		
		return msg;
		
	}

}
