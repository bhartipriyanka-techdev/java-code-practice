package com.java.SingleArray;

import java.util.Scanner;

public class ArrayStringSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String :");
        String str = scanner.next();

        char[] arrCh = str.toCharArray();

        for (int i = 0; i <= arrCh.length - 1; i++) {
            for (int j = i+1; j <= arrCh.length - 1; j++) {
                if (arrCh[i] > arrCh[j]) {
                    char tmp = arrCh[i];
                    arrCh[i] = arrCh[j];
                    arrCh[j] = tmp;

                }
            }
        }
        for(int i =0; i<= arrCh.length-1 ; i++) {
            System.out.print(arrCh[i]+" ");
        }
        scanner.close();

    }
}
