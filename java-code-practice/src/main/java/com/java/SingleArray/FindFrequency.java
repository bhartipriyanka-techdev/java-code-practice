package com.java.SingleArray;

import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of an array :");
        int size = scanner.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter Data in an Array \n");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("\n Displaying Data in an Array \n");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        int arr2[] = new int[arr1.length];
        int foundElement = -1;

        for (int i = 0; i < arr1.length; i++) {
            int count = 1; // Start count at 1 for the current element
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j] && arr2[j] != foundElement) {
                    count++;
                    arr2[j] = foundElement;
                }
            }
            if (arr2[i] != foundElement) {
                arr2[i] = count;
            }
        }

        System.out.println("\nCount Frequency of Data in an Array \n");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != foundElement)
                System.out.println(arr1[i] + " occurs " + arr2[i] + " times");
        }
        scanner.close();
    }

}
