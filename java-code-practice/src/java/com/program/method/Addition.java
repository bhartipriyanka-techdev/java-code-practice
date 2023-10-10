package java.com.program.method;

import java.util.*;

public class Addition {

	// Here method Declaration and also
	// Method definition

	static void Add(int number1, int number2) {
		int sum = number1 + number2;
		System.out.println("Sum of two number : " + sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value of number1 :");
		int number1 = sc.nextInt();

		System.out.print("Enter value of number2 :");
		int number2 = sc.nextInt();

		// Here calling the method

		Add(number1, number2);

		sc.close();

	}

}
