package com.java.string;

import java.util.Scanner;

public class SumOfNumberInString {
    private static int sumNumbersInString(String str) {
        int sum = 0;
        int currentNumber = 0;
        boolean inNumber = false;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(c);
                inNumber = true;
            } else {
                if (inNumber) {
                    sum =sum+ currentNumber;
                    currentNumber = 0;
                    inNumber = false;
                }
            }
        }

        // Check for the last number in the string
        if (inNumber) {
            sum += currentNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = scanner.nextLine();

        int result = sumNumbersInString(str);
        System.out.println("Sum of numbers in the string: " + result);
        scanner.close();

    }

}
