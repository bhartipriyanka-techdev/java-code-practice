package com.java.SingleArray;

import java.util.Scanner;

public class MergeTwoArray {
    static int[] merge(int arr1[], int arr2[]) {
        int size = arr1.length + arr2.length;

        int arr3[] = new int[size];

        // Copying Data of 1st array
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Copying Data of 2nd array
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the 1st array: ");
        int size1 = scanner.nextInt();

        int arr1[] = new int[size1];

        System.out.print("Enter data in the 1st array\n");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of the 2nd array: ");
        int size2 = scanner.nextInt();

        int arr2[] = new int[size2];
        System.out.print("Enter data in the 2nd array\n");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("-----------Displaying Data of the 1st Array--------------");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("-----------Displaying Data of the 2nd Array--------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        int mergeArray[] = merge(arr1, arr2);

        System.out.println("\n-----------Displaying Merged Array--------------");
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }

        scanner.close();
    }
}
