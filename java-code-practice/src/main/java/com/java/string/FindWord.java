package com.java.string;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String :");
        String str = scanner.next();
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {

            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {

                count++;
            }
        }
        System.out.println("Count of cat String is : " + count);
        scanner.close();

    }
}
