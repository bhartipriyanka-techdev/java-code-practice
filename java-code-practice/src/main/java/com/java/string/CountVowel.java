package com.java.string;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.next();
        String s = str.toLowerCase();

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Total no of vowel is :"+count);
        scanner.close();

    }
}
