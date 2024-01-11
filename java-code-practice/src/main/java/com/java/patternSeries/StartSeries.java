package com.java.patternSeries;

import java.util.Scanner;

//*
//* *
//* * *
//* * * *
//* * * * *
public class StartSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range : ");
        int range = scanner.nextInt();
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
