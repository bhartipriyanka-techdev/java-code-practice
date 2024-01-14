package com.java.string;

import java.util.Scanner;

// String1 => eat , String2 => ate =====> This is Anagram
//String1 =>king , String2 => kinz ======> This is not a Anagram
public class CheckAnagramOrNot {
    static String CheckAnagram(String str) {
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
        return new String(arrCh);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st String : ");
        String str1 = scanner.next();

        System.out.print("Enter 1st String : ");
        String str2 = scanner.next();
        //if(sort(str1).equals(sort(str2))) {

        if (CheckAnagram(str1).equals(CheckAnagram(str2))) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("Not Anagram String");
        }

        scanner.close();

    }
}
