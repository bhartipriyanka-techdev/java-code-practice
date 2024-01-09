package com.java.number_program;

import java.util.Scanner;

public class PerfectSquarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number == i * i) {
                count++;
                break;
            }
        }

        if (count == 1) {
            System.out.println("Perfect square number");
        } else {
            System.out.println("Not Perfect square number");

        }

        scanner.close();
    }
}
