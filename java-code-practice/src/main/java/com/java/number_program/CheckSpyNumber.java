package com.java.number_program;

import java.util.Scanner;

public class CheckSpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number :");
        int number = scanner.nextInt();
        int sum = 0, product = 1, digit = 0;
        while (number != 0) {
            digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;

        }
        if (sum == product) {
            System.out.println("Entered Number is Spy number");
        } else {
            System.out.println("Entered Number is not Spy number");

        }
        scanner.close();

    }
}
