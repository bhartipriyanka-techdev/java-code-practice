package com.java.SingleArray;

import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Data in array \n");
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("========Before Sorting========= \n");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }

        // sorting logic

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i + 1; j <= arr.length-1 ; j++) {

                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        System.out.println("\n========= After sorting==============\n");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();

    }

}
