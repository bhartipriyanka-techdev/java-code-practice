package com.java.string;

import java.util.Scanner;

public class RearrangeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String with numeric or special character : ");
        String str = scanner.next();
        String alphaSum = "", numericSum = "", specialSum = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphaSum = alphaSum + ch;
            } else if (ch >= '0' && ch <= '9') {
                numericSum = numericSum + ch;
            } else {
                specialSum = specialSum + ch;
            }
        }
        System.out.println(alphaSum + numericSum + specialSum);
        scanner.close();

    }
}
