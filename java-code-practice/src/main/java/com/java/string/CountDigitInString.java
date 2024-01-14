package com.java.string;

import java.util.Scanner;

public class CountDigitInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string with numeric data :");
        String str = scanner.next();
        int sum = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum = sum + (ch - 48);
            }
        }
        System.out.println("Total sum of digit is : " + sum);
        scanner.close();
    }
}
