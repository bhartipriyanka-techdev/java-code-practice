package com.java.number_program;

import java.util.Scanner;

public class SumOfEvenOddDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int sumEven = 0, sumOdd = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumEven = sumEven + digit;
            } else {
                sumOdd = sumOdd + digit;
            }
            number = number / 10;
        }
        System.out.println("Sum of Even digit is : " + sumEven);
        System.out.println("Sum of Odd digit is : " + sumOdd);

        scanner.close();

    }
}
