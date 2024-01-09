package com.java.number_program;

import java.util.Scanner;

public class CheckPalindromNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any decimal number :");
        int number = scanner.nextInt();
        int number1 = number;
        int rem = 0, reverse = 0;
        while (number != 0) {
            rem = number % 10;
            reverse = reverse *10 +rem;
            number = number / 10;
        }
        if (reverse == number1) {
            System.out.println("Entered number is Palindrom");
        } else {
            System.out.println("Entered number is not Palindrom");

        }
        scanner.close();

    }
}
