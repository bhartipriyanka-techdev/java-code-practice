package com.java.SingleArray;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        int sum = 0;
        System.out.print("Enter Data in an array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("-----------Displaying Data if Array--------------");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Sum of Element is: " + sum);
        scanner.close();

    }
}
