package com.java.string;

import java.util.Scanner;

public class CharacterOfFactorOfLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any String : ");
        String str = scanner.next();
        scanner.close();
        int length = str.length();
        for (int i = 0; i <= length; i++) {
            //char ch = str.charAt(i);
            if (length % i == 0) {
                System.out.print(str.charAt(i - 1));
            }
        }

    }
}
