package com.java.string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = scanner.next();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome String");
        }
        scanner.close();

    }
}
