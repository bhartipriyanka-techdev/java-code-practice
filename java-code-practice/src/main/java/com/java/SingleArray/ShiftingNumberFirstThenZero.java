package com.java.SingleArray;
//Array =>{4,0,9,2,0,12,6,7,0}

import java.util.Scanner;

//OUTPUT =>{4,9,2,12,6,7,0,0,0,0}
public class ShiftingNumberFirstThenZero {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter size of an array : ");
            int size = scanner.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter Data in array \n");
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("displaying Data in array \n");
            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            int k = 0;
            int tmp[] = new int[arr.length];
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] != 0) {
                    tmp[k] = arr[i];
                    k++;
                }

            }
            System.out.println();
            System.out.println("=========================");
            for (int data : tmp) {
                System.out.print(data +" ");
            }
            scanner.close();

        }

    }
