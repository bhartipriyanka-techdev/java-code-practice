package com.java.searching;

import java.util.Scanner;

public class SelectionSort {
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

        for(int i = 0; i <= arr.length-1; i++){
            int min = i;
            for(int j = i+1 ;j <= arr.length - 1; j++ ){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        System.out.println("\nDISPLAYING AFTER   SORTING");
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }
}
