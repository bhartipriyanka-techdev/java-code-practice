package java.com.program.method;

import java.util.*;

public class evenOdd {
	
	//Here method declaration and
	// method definition
	
	static void check(int number) {
		if (number % 2 == 0) {
			System.out.println("number is even : " + number);
		} else {
			System.out.println("number is odd : " + number);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number to check even or not : ");
		int number = sc.nextInt();

		// Calling the method

		check(number);
		sc.close();

	}

}
