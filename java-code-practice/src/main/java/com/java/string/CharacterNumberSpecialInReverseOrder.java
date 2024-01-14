package com.java.string;

import java.util.Scanner;

public class CharacterNumberSpecialInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any String : ");
        String str = scanner.next();
        String alphaSum = "", numericSum = "", specialcharSum = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphaSum = ch + alphaSum;
            } else if (ch >= '0' && ch <= '9') {
                numericSum = ch + numericSum;
            } else {
                specialcharSum = ch + specialcharSum;
            }
        }
        System.out.print(alphaSum + numericSum + specialcharSum);
        scanner.close();
    }
}
