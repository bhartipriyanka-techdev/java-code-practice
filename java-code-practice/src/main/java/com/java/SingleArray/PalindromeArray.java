package com.java.SingleArray;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        int startPoint = arr[0], endPoint = arr.length - 1, count = 0;

        System.out.println("Enter Data in an Array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("----------Displaying Data--------");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
        while (startPoint <= endPoint) {
            if (arr[startPoint] == arr[endPoint]) {
                startPoint++;
                endPoint--;
                count++;
            }

        }
        System.out.println();
        if (count == 0) {
            System.out.println("Array is Not Palindrom");
        } else {
            System.out.println("Array is  Palindrom");

        }
        scanner.close();

    }

}
