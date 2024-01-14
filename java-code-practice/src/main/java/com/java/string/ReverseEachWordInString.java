package com.java.string;

import java.util.Scanner;

public class ReverseEachWordInString {
    static String reverse(String str) {
        String reverseString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i) ;

        }
        return reverseString;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stubs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        for (String data : arr) {
            System.out.print(reverse(data)+" ");
        }
        scanner.close();

    }
}
