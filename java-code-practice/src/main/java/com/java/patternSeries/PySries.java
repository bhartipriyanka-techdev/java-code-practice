package com.java.patternSeries;

import java.util.Scanner;

public class PySries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row size :  ");
        int row = scanner.nextInt()	;
        for(int i = 1 ; i<=row ; i++) {
            for(int j = 1 ;j<=row ;j++) {
                if((i+j)>(row+1)) {
                    System.out.print("* ");

                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
