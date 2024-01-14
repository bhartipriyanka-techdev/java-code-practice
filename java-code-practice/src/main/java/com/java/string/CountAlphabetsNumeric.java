package com.java.string;

import java.util.Scanner;

public class CountAlphabetsNumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.next();
        int alphabetsCount = 0, numericCount = 0, specialCount = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphabetsCount++;
            } else if (ch >= '0' && ch <= '9') {
                numericCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Count of Alphabets is: " + alphabetsCount);
        System.out.println("Count of Numeric is: " + numericCount);
        System.out.println("Count of Special Symbols is: " + specialCount);


        scanner.close();

    }

}
