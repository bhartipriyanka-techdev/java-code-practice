package com.java.number_program;

import java.util.Scanner;

public class CheckArmstrongNumber {
    // Method for count Digit
    static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            count++;
            number = number / 10;

        }
        return count;
    }

    // Method for Find Power
    static int findPower(int base, int exp) {
        int power = 1;
        for (int i = 1; i <= exp; i++) {
            power = power * base;

        }
        return power;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int number1 = number;
        int sum = 0, rem = 0;
        int count = countDigit(number);
        while (number != 0) {
            rem = number % 10;
            sum = sum + findPower(rem, count);
            number = number / 10;
        }
        if (sum == number1) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");

        }
        scanner.close();

    }

}
