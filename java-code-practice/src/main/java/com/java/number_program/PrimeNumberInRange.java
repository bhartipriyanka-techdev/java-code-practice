package com.java.number_program;

import java.util.Scanner;

public class PrimeNumberInRange {
    static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Starting Point : ");
        int startPoint = scanner.nextInt();

        System.out.print("Enter Ending Point : ");
        int endPoint = scanner.nextInt();
        System.out.println("Prime Numbers are");
        int count = 0;
        for (int i = startPoint; i <= endPoint; i++) {
            if (isPrime(i) == true) {

                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total prime ni is : " + count);
        scanner.close();

    }

}
