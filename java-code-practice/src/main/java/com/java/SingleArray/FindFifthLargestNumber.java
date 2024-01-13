package com.java.SingleArray;
//Largest
//1st Largest => arr[arr.length -1];
//2nd Largest => arr[arr.length -2];
//3rd Largest => arr[arr.length -3];


//Smallest
// 1St smallest => arr[0]
// 2nd smallest => arr[1]
// 3rd smallest => arr[2]

import java.util.Scanner;

public class FindFifthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of an array : ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter data in an array \n");
        for(int i = 0 ; i<=arr.length-1 ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n=======Displaying Data in an Array==========\n");
        for(int i =0 ; i<= arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }


        scanner.close();

    }
}
