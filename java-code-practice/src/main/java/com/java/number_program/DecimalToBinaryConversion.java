package com.java.number_program;

import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any decimal number :");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println(0);
        }

        //Here binaryValue is an empty String
        String binaryValue = "";

        while (number > 0) {

            binaryValue = number % 2 + binaryValue;
            number = number / 2;
        }

        System.out.println(binaryValue);

        scanner.close();
    }
}
