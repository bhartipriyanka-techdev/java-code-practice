package com.java.SingleArray;

import java.util.Scanner;

public class ReverseHalfArray {
    static void reverseArray(int arr[], int size, int group) {
        for (int i = 0; i < size; i=i+group) {
            int startPoint = i;
            int endPoint = (i + group - 1 <= size - 1) ? i + group - 1 : size - 1;

            int tmp;
            while (startPoint < endPoint) {
                tmp = arr[startPoint];
                arr[startPoint] = arr[endPoint];
                arr[endPoint] = tmp;
                startPoint++;
                endPoint--;
            }
        }

        System.out.println();
        System.out.println("========Reverse Array======== \n");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter data in an array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Displaying data in an array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        int group = (arr.length) / 2;
        // System.out.println("length is "+group);

        reverseArray(arr, size, group);

        scanner.close();
    }
}
