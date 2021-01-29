package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {

		
		
		//ask user how many question in the exam
		//ask user how many questions missed
		//give user letterGrade(A,b,d)
		
		
		Scanner scan = new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.println("How many questions are on the final exam?");
		questions =  scan.nextInt();
		
		System.out.println("How many questions did the student miss?");
		missed = scan.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		
		System.out.println("The grade for the exam is " + exam.getGrade());
		
		
		
		
		
	}

}
