package com.java.string;

import java.util.Scanner;

public class StringTraverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.next();
        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }
        scanner.close();

    }

}
