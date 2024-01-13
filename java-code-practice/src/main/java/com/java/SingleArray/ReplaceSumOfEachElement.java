package com.java.SingleArray;

import java.util.Scanner;

public class ReplaceSumOfEachElement {
    static int sumOfelement(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter Data in an array \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("-----------Displaying Data of Array--------------");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("-----------Replacing Data in Array--------------");

        for (int i = 0; i <= arr.length - 1; i++) {
            int tmp = sumOfelement(arr[i]);
            arr[i] = tmp;
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
