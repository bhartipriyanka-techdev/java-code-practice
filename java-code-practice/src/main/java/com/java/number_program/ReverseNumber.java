package com.java.number_program;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

		System.out.print("Enter any decimal number :");
    int number = scanner.nextInt();

    int rem = 0, reverse = 0;
		while (number != 0) {
        rem = number % 10;
        reverse = reverse * 10 + rem;
        number = number / 10;
    }
		System.out.println("reverse Number is : " + reverse);
		scanner.close();

}
}
