package com.java.SingleArray;

import java.util.Scanner;

public class MixOfSmallAndBigDigitInAsendingOrder {
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
        int k = 0;
        int tmp[] = new int[arr.length];
        int startPoint = arr[0], endPoint = arr.length-1;
        while (startPoint <= endPoint) {
            if (startPoint == endPoint) {
                tmp[k] = arr[startPoint];
                break;
            } else {
                tmp[k] = arr[startPoint];
                k++;
                tmp[k] = arr[endPoint];
                k++;
                startPoint++;
                endPoint--;
            }
        }
        System.out.println();
        System.out.println("======================");
        for (int data : tmp) {
            System.out.print(data + " ");
        }

        scanner.close();

    }

}
