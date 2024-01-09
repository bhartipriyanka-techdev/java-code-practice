package com.java.number_program;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int count = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit == 0) {
                count++;
                break;
            }
            number = number / 10;
        }
        if (count == 1) {
            System.out.println("Duck Number");
        } else {
            System.out.println(" Not Duck Number");

        }
        scanner.close();

    }

}
