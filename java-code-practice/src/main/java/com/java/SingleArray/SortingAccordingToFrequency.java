package com.java.SingleArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAccordingToFrequency {
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
            int count = 1;
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


        int uniqueCount = 0;
        int[] uniqueArr = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != foundElement) {
                uniqueArr[uniqueCount++] = arr1[i];
            }
        }


        Arrays.sort(uniqueArr, 0, uniqueCount);

        System.out.println("\nSorted by Occurrence \n");
        for(int i = 0 ; i<=uniqueCount-1 ; i++) {

            System.out.println(uniqueArr[i]);
        }

        scanner.close();
    }
}
