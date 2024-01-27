package com.java.SingleArray;

import java.util.Arrays;
import java.util.Scanner;

public class FindSpecificDataInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of an array :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Data in an array");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(" Data in an array");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        System.out.print("Enter Target Value :");
        int target = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println("------------------------------\n");
        int startPoint = 0 , endPoint = arr.length-1;
        while(startPoint < endPoint){
            if(arr[startPoint] + arr[endPoint] == target){
                System.out.println(arr[startPoint] +" "+arr[endPoint]);
                startPoint++;
                endPoint--;
            }
            else if(arr[startPoint] + arr[endPoint] > target){
                endPoint--;
            }
            else{
                startPoint++;
            }
        }

    }
}

