package com.java.number_program;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number :");
        int number = scanner.nextInt();
        int digit = 0, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }
        System.out.println("Sum of digit is : " + sum);
        scanner.close();

    }
}
