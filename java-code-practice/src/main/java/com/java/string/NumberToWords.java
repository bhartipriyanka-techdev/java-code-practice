package com.java.string;

import java.util.Scanner;

public class NumberToWords {
    public static String convertToWords(int number) {
        String[] digitWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String result = "";

        while (number > 0) {
            int digit = number % 10;
            result = digitWords[digit] + result;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int number = scanner.nextInt();
        System.out.println(convertToWords(number));
        scanner.close();

    }
}
