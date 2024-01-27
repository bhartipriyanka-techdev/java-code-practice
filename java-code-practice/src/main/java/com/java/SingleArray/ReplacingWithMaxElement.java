package com.java.SingleArray;

import java.util.Scanner;
// Input ={12 55 66 99 45 16 23 18}
//OutPut = {99 99 99 -1 -1 23 -1 -1}
public class ReplacingWithMaxElement {
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
        int max = arr.length - 1 ;
        for(int i = arr.length- 1 ; i>= 0; i--){
            if(arr[i]>= max){
               max = arr[i];
               arr[i] = -1;
            }
            else{
                arr[i] = max;
            }
        }
        System.out.println("DISPLAYING AFTER REPLACING");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }


        }
}
