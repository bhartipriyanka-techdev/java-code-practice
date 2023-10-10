package java.com.program.method;

import java.util.Scanner;

public class PositiveNegativeNumber {

	// Here method declaration and
	// method definition

	static void check(int number) {
		if (number >= 0) {
			System.out.println("number is positive : " + number);
		} else {
			System.out.println("number is negative : " + number);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number to check positive or negative : ");
		int number = sc.nextInt();

		// Calling the method

		check(number);
		sc.close();

	}

}
