package com.java.searching;

import javax.swing.*;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array :");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("ENTER DATA IN AN ARRAY");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("DISPLAYING BEFORE SORTING");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        // Corrected bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nDISPLAYING AFTER BUBBLE SORTING");
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }
}
