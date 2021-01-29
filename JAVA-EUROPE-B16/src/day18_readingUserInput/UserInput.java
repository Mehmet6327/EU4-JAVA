package day18_readingUserInput;

import java.util.Scanner;
import java.util.Scanner.*;

public class UserInput {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a byte value");
		byte b1 = sc.nextByte();
		System.out.println("Byte value is: " + b1);
		
		System.out.print("Enter a short value:");
		short s1 = sc.nextShort();
		System.out.println(s1);
		
		System.out.println("Enter a int value:");
		int i1 = sc.nextInt();
		System.out.println("Int value is" + i1);
		
		System.out.println("Enter a long value:");
		long l1 = sc.nextLong();
		System.out.println("Long value is" + l1);
		
		System.out.println("Enter a double value:");
		double d1 = sc.nextDouble();
		System.out.println("Double value is" + d1);
		
		System.out.println("Enter a boolean value:");
		boolean bool1 = sc.nextBoolean();
		System.out.println("Boolean value is" + bool1);
		
		// ve soyle devam ederiz 
		
		System.out.print("Enter another byte value:");
		byte b2 = sc.nextByte();
		System.out.println(b2);
		
		
	}

}
