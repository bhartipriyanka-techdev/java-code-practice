package com.java.number_program;

import java.util.Scanner;

//n ->9
//9^2 =81
//8+1 =9
//n==result
public class checkNumberEqualSumOfSquarDigit {
    static int sumOfDigit(int number) {
        int digit = 0, sum = 0;
        while (number != 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number :");
        int number = scanner.nextInt();
        int number1 = number;
        int squar = 0;
        squar = number * number;
        int sum = sumOfDigit(squar);
        if (number1 == sum) {
            System.out.println("It's equal");
        } else {
            System.out.println("It's  not Equal");
        }
        scanner.close();

    }

}
