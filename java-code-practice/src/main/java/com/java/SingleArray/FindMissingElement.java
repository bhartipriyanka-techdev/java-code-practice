package com.java.SingleArray;

import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter starting point : ");
        int startPoint = scanner.nextInt();

        System.out.print("Enter Ending point : ");
        int endPoint = scanner.nextInt();
        int arr[] = new int[endPoint];

        System.out.println("Enter Data in an Array \n");
        for (int i = startPoint; i <= endPoint; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("========Displaying Data in an array================");
        for (int i = startPoint; i <= endPoint; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("===========Missing Data================");
        for (int i = startPoint; i <= arr.length - 1; i++) {
            boolean isMissingData = true;

            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    isMissingData = false;
                    break;
                }
            }
            if (isMissingData) {
                System.out.print(i + " ");
            }
        }
        scanner.close();

    }

}
