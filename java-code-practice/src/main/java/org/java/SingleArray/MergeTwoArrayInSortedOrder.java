package org.java.SingleArray;
import java.util.Scanner;
//array1 => {23,34,77,85}
//array2 => {12 28 29 56 88 99}
//OUTPut =>{12 23 23 29 34 56 77 77 85 85}
public class MergeTwoArrayInSortedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of 1st Array :");
        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter data in 1st array in sorted order:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter Size of 2nd Array :");
        int size2 = scanner.nextInt();
        int arr2[] = new int[size2];

        System.out.println("Enter data in 2nd array in sorted order:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println("-------------1st Array---------------");
        for (int data : arr1) {
            System.out.print(data + " ");
        }
        System.out.println("\n-------------2nd Array---------------");
        for (int data : arr2) {
            System.out.print(data + " ");
        }
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements from arr1 (if any)
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // Copy the remaining elements from arr2 (if any)
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("\n-----------Merged Array--------------");
        for (int data : arr3) {
            System.out.print(data + " ");
        }
    }
}
