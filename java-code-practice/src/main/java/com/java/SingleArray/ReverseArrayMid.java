package com.java.SingleArray;

import java.util.Scanner;

public class ReverseArrayMid {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size:");
        int size = sc.nextInt();
        System.out.println("Enter your elements in array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int startPoint = (size / 2) - 1, endPoint = size / 2;
        int arr1[] = new int[size];
        for (int i = startPoint, j = 0; i >= 0; i--, j++) {
            arr1[j] = arr[i];
        }
        for (int i = size - 1, j = endPoint; i >= endPoint; i--, j++) {
            arr1[j] = arr[i];
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
