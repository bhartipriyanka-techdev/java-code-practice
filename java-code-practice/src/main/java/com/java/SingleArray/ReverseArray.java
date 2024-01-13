package com.java.SingleArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of an array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter data in an Array\n");
        for (int i = 0; i <= arr.length-1 ; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println("Before Reverse Displaying Data ");
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print(arr[i] + " ");
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }
        System.out.println();
        System.out.println("After Reverse Displaying Data ");
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();

    }

}
