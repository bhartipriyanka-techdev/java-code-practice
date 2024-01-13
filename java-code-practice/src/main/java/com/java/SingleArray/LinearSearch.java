package com.java.SingleArray;
//{23,54,67,89,99,89}
//key ->89
//if key value is available in an array then print the position of key value
//if key value not available in an array then print -1

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of an array :");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter Data in an array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("-----------Displaying Data if Array--------------");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.print("Enter key for searching : ");
        int key = scanner.nextInt();

        int position = -1, count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (key == arr[i]) {
                count++;
                System.out.println("Position of Searching key is : " + i);
                break;

            }
        }
        if (count == 0) {
            System.out.println(key + "  " + "Element is not available in an array : " + position);

        }

        scanner.close();

    }

}
