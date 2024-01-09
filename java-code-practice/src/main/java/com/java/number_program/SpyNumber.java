package com.java.number_program;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int sum = 0, product = 1;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println(" Not Spy Number");

        }
        scanner.close();

    }
}
