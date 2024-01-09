package com.java.number_program;

import java.util.Scanner;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st String: ");
        String str1 = scanner.next();

        System.out.print("Enter 2nd String: ");
        String str2 = scanner.next();

        // Convert the strings to integers and sum them
        int result = convertAndSumStrings(str1, str2);

        // Print the result
        System.out.println("Output is: " + result);

        scanner.close();
    }

    private static int convertAndSumStrings(String str1, String str2) {
        int num1 = convertStringToInt(str1);
        int num2 = convertStringToInt(str2);

        return num1 + num2;
    }

    private static int convertStringToInt(String str) {
        int result = 0;

        for (char digit : str.toCharArray()) {
            result = result * 10 + (digit - '0');
        }

        return result;
    }
}
