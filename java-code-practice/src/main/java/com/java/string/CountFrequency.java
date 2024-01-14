package com.java.string;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String :");
        String str = scanner.next();
        char[] arr = str.toCharArray();
        char tmp[] = str.toCharArray();
        for (int i = 0; i <= str.length() - 1; i++) {
            int count = 0;
            for (int j = i + 1; j <= str.length() - 1; j++) {
                if (arr[i] == tmp[j]) {
                    count++;
                    arr[j] = '\0';
                }
            }
            // if(count == 1)
            //(count >1) => for duplicate
            if (count >0)
                System.out.println(arr[i] + " " + count);
        }
        scanner.close();

    }
}
