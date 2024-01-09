package com.java.number_program;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= number; i++) {
            if (number + 1 == i * i) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("Sunny number");
        } else {
            System.out.println("Not Sunny number");
        }

        scanner.close();

    }

}
