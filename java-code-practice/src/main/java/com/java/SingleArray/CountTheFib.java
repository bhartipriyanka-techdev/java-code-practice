package com.java.SingleArray;

import java.util.Scanner;

public class CountTheFib {
    static boolean isFibnacci(int range, int number) {
        int f1 = 0, f2 = 1, f3 = 0, count = 0;
        while (range >= 1) {
            // System.out.println(f1);
            if (number == f1) {
                count++;
                //System.out.println("fibnacci number : " +f1);
                return true;


            }

            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            range--;
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of an Array : ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter data in array \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Displaying data in array \n");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter range : ");
        int range = scanner.nextInt();
        System.out.println();
        System.out.println("Enter Target : ");
        int target = scanner.nextInt();

        int sum = 0, count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (isFibnacci(range, arr[i])) {
                if (sum <= target) {
                    sum = sum + arr[i];
                    count++;
                }
                else {
                    System.out.println("Count Value is : "+count);

                    break;
                }

            }
        }
        if(sum < target)
        {
            System.out.println("No Fibnacci number available in this array to add");
        }
        else {
            System.out.println(-1);
        }

        scanner.close();

    }
}
