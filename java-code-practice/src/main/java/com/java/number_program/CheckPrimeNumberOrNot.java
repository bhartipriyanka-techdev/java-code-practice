package com.java.number_program;

import java.util.Scanner;

public class CheckPrimeNumberOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any to check prime no or not : ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Entered number is prime");
        } else {
            System.out.println("Entered number is  not prime");

        }
        scanner.close();

    }
}
