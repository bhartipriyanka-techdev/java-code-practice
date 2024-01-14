package com.java.string;

import java.util.Scanner;

public class CheckPalindromeString {
    static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        int startPoint = 0;
        int endPoint = str.length() - 1;

        while (startPoint < endPoint) {

            if (str.charAt(startPoint) != str.charAt(endPoint)) {
                return false;
            }

            startPoint++;
            endPoint--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.next();
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
