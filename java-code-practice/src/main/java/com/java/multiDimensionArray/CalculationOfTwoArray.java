package com.java.multiDimensionArray;

import java.util.Scanner;

public class CalculationOfTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For 1st Array

        System.out.println("Enter  Row size of an  array : ");
        int row = scanner.nextInt();

        System.out.println("Enter  Column size of an array : ");
        int clmn = scanner.nextInt();

        int arr1[][] = new int[row][clmn];

        System.out.println("Enter Data in array \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        // For 2nd Array

        int arr2[][] = new int[row][clmn];
        System.out.println("Enter Data in array \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {

                arr2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Displaying  Data of an 1st  array \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Displaying  Data of an 2nd  array \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {

                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int addMatrix[][] = new int[row][clmn];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                addMatrix[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        System.out.println("\n =================ADDITION OF TWO MATRIX============");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {

                System.out.print(addMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n =================SUBSTRACTION OF TWO MATRIX============");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                addMatrix[i][j] = arr1[i][j] - arr2[i][j];

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {

                System.out.print(addMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n =================MULTIPLICATION OF TWO MATRIX============");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                addMatrix[i][j] = arr1[i][j] * arr2[i][j];

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {

                System.out.print(addMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}
