package day37_Inheritance;

public class School {

	public static void main(String[] args) {

		
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Mehmet";
		person.age = 27;
		person.gender = 'M';
		
		
		student.name = "Ozzzy";
		student.age = 30;
		student.gender = 'M';
		
		
		student.studentID = 1000;
		
		person.eat("Kebab");
		student.eat("Pizza");
		
        //person.Code("Java");
		
				
				
		
		
		
		
		
		
	}

}
