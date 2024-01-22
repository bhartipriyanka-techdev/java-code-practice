package com.java.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {45, 67, 89, 99, 100, 102, 103};
        Arrays.sort(arr);

        System.out.print("Enter searching data: ");
        int searchData = scanner.nextInt();

        int startPoint = 0, endPoint = arr.length - 1, pos = -1;

        while (startPoint <= endPoint) {
            int midPoint = startPoint + (endPoint - startPoint) / 2;

            if (arr[midPoint] == searchData) {
                pos = midPoint;
                System.out.println("Data "+ searchData+" is Found at index "+ pos);
                break;
            } else if (arr[midPoint] < searchData) {
                startPoint = midPoint + 1;
            } else {
                endPoint = midPoint - 1;
            }
        }

        if (pos == -1) {
            System.out.println("No Key Found");
        }
    }
}
