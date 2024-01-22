package com.java.searching;

import java.util.Scanner;

public class LinearSearch {
    static  int search(int arr[], int searchData){
        for(int i = 0; i <= arr.length-1 ; i++){
            if(arr[i] == searchData){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= {233,45,67,89,99};
        System.out.print("Enter searching data :");
        int searchData = scanner.nextInt();
            if(search(arr,searchData) == -1){
                System.out.println("Data  Not found :"+searchData);
        }
            else {
                System.out.println("Data found : "+searchData);

            }
    }
}
