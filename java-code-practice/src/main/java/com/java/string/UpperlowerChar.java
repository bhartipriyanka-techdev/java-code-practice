package com.java.string;

import java.util.Scanner;

public class UpperlowerChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String with numeric or special character : ");
        String str = scanner.next();
        String str1 = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);

            } else {
                if (ch >= 'a' && ch <= 'a') {
                    ch = (char)(ch - 32);

                }
                str1 = str1+ch;
            }

        }
        System.out.println(str1);
        scanner.close();

    }
}
