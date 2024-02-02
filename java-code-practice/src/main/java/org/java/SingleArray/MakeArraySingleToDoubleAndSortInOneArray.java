package org.java.SingleArray;
//arr =>{5,8,2,9,4,6,9,3,5,10,1,3}
//startIndex =>4
//EndIndex =>9
//arr1 =>{4,6,9}
//arr2 =>{3,5,10}
//sort in one array (OUTPUT) =>{5,8,2,9,3,4,6,9,10,1,3}

import java.util.Scanner;

public class MakeArraySingleToDoubleAndSortInOneArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Data In An Array \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("--------------Displaying Data In An Array------------- \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n-------------------------------------------------------\n");
        System.out.print("Enter Starting Index :");
        int startIndex = scanner.nextInt();

        System.out.print("Enter Last Index :");
        int lastIndex = scanner.nextInt();

        int length = lastIndex - startIndex + 1;
        int mid = (startIndex + lastIndex) / 2;

        int arr1[] = new int[length / 2];
        int arr2[] = new int[length / 2];

        int k = 0;
        for (int i = startIndex; i <= mid; i++) {
            arr1[k++] = arr[i];
        }

        k = 0;
        for (int i = mid + 1; i <= lastIndex; i++) {
            arr2[k++] = arr[i];
        }

        System.out.println("-----------Left Array-----------------");
        for (int data : arr1) {
            System.out.print(data + " ");
        }

        System.out.println("\n-----------Right Array-----------------");
        for (int data : arr2) {
            System.out.print(data + " ");
        }

        // Merge and sort arr1 and arr2 into arr
        int i = startIndex;
        int j = 0;
        int l = 0;

        while (j < arr1.length && l < arr2.length) {
            if (arr1[j] < arr2[l]) {
                arr[i++] = arr1[j++];
            } else {
                arr[i++] = arr2[l++];
            }
        }

        while (j < arr1.length) {
            arr[i++] = arr1[j++];
        }

        while (l < arr2.length) {
            arr[i++] = arr2[l++];
        }

        System.out.println("\n-----------Merged and Sorted Array-----------------\n");
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }
}
