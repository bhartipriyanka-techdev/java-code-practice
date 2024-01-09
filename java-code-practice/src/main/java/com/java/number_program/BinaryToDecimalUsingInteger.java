package com.java.number_program;

import java.util.Scanner;

public class BinaryToDecimalUsingInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        int binaryNumber = scanner.nextInt();
        int sum = 0, power = 1;
        while (binaryNumber > 0) {
            int rem = binaryNumber % 10;
            sum = sum + (rem * power);
            power = power * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.print(sum);
        scanner.close();
    }
}
