package com.java.SingleArray;

import java.util.Scanner;

public class FindUniqueElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Data in array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("displaying Data in array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Displaying Unique Data in array:\n");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();

    }
}
