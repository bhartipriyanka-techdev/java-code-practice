package com.java.SingleArray;

import java.util.Scanner;
// Input ={12 55 66 99 45 16 23 18}
//OutPut = {99 99 99 -1 -1 23 -1 -

    public class CountOccurrence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter size of an array :");
            int size = scanner.nextInt();
            int arr[] = new int[size];

            System.out.println("ENTER DATA IN AN ARRAY");
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("DISPLAYING BEFORE REPLACING");
            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("Enter key value :");
            int key = scanner.nextInt();
            System.out.print("Enter how many want to show repeat key :");
            int rep = scanner.nextInt();
            int max =0 ;

        }
    }

