package java.com.program.method;

import java.util.*;

public class returnWithexpression {
	static int sum(int number1, int number2) {

		return number1 + number2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of 1st number : ");
		int number1 = sc.nextInt();
		System.out.print("Enter value of 2nd number : ");
		int number2 = sc.nextInt();
		System.out.println("Addition of two number : " + sum(number1, number2));

		sc.close();

	}

}
