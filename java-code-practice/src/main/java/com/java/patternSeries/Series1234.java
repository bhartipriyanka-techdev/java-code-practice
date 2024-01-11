package com.java.patternSeries;

import java.util.Scanner;

//1
//2 3
//4 5 6
//7 8 9 10
public class Series1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range : ");
        int range = scanner.nextInt();
        int k=1;
        for (int i = 1; i <= range; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
