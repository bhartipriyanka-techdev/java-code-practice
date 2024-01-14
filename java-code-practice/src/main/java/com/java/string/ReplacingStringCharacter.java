package com.java.string;

import java.util.Scanner;

public class ReplacingStringCharacter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any String : ");
        String str = scanner.next();
        System.out.print("Enter search Character :");
        char searchCh = scanner.next().charAt(0);
        System.out.print("Enter replace Character :");
        char replcCh = scanner.next().charAt(0);
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (searchCh == ch) {
                System.out.print(replcCh);
            } else {
                System.out.print(ch);
            }
        }
        scanner.close();
    }
}
