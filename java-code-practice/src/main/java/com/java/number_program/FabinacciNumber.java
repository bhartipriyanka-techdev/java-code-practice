package com.java.number_program;

import java.util.Scanner;

public class FabinacciNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int f1 = 0, f2 = 1, f3 = 0;
        while (number >=1) {
            System.out.println(f1);
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            number--;
        }
        scanner.close();
    }
}
