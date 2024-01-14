package com.java.string;

// input -> aabbbccddaabb

import java.util.Scanner;

// output ->a2b3c2a2b2
public class CountString {
    public static String countStringChar(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String countString = "";
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                countString += currentChar + Integer.toString(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        countString += currentChar + Integer.toString(count);

        return countString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter reapeted String : ");
        String str = scanner.next();
        String compressedString = countStringChar(str);
        System.out.println(compressedString);
        scanner.close();
    }
}
