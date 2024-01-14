package com.java.string;

import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String with extra Space :");
        String str = scanner.nextLine();
        String str1 = "";
        for(int i = 0; i  <= str.length()-1 ; i++) {

            if(str.charAt(i) == ' ' && str.charAt(i+1) == ' ') {

                continue;
            }
            else {
                str1 = str1+str.charAt(i);
            }

        }
        System.out.println(str1);

        scanner.close();

    }
}
