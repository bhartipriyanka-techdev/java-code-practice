package com.java.string;

import java.util.Scanner;

public class FindMaximumFrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = scanner.next();
        int count;
        int[] arr = new int[str.length()];

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch1 = str.charAt(i);
            count = 1;
            for (int j = i + 1; j <= str.length() - 1; j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }
            }
            arr[i] = count;
        }

        int countFreq = arr[0];
        char reptChar = str.charAt(0);

        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > countFreq) {
                countFreq = arr[i];
                reptChar = str.charAt(i);
            }
        }

        System.out.println("Repetitive Character is : " + reptChar);

        scanner.close();
    }
}
