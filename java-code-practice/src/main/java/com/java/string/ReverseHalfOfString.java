package com.java.string;

import java.util.Scanner;

public class ReverseHalfOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String  :");
        String str = scanner.next();
        String str1 = "";
        int length = str.length() / 2;
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (i <= length-1) {
                str1 = ch + str1;

            } else
                str1 = str1 + ch;


        }
        System.out.println(str1);

        scanner.close();
    }
}
