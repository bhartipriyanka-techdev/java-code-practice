package com.java.string;

import java.util.Scanner;

public class FindLargestWord {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int max = arr[0].length();
        String ans = arr[0];
        for (String data : arr) {
            if (max < data.length()) {
                max = data.length();
                ans = data;
            }
        }
        System.out.println(ans);

        scanner.close();

    }
}
