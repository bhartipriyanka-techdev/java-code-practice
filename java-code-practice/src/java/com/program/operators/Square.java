package java.com.program.operators;

import java.util.*;

public class Square {

	public static void main(String[] args) {

		// Here input number from user using Scanner class

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int number = sc.nextInt();

		// Here calculating Square of number

		int square = number * number;

		// Printing result

		System.out.println("Square of numbers = " + square);
		sc.close();

	}

}
