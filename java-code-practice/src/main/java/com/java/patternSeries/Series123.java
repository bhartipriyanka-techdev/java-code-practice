package com.java.patternSeries;

import java.util.Scanner;

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class Series123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range : ");
        int range = scanner.nextInt();
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
