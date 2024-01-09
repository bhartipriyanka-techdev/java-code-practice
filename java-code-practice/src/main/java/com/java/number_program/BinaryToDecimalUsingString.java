package com.java.number_program;

import java.util.Scanner;

public class BinaryToDecimalUsingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Number in string Format :");
        String str = scanner.next();
        int sum = 0, power = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            sum = sum + (str.charAt(i) * power);
            power = power * 2;
        }
        System.out.print("Binary Value is :" + sum);
        scanner.close();
    }
}
