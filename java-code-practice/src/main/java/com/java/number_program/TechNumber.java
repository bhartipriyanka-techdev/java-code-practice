package com.java.number_program;

import java.util.Scanner;

//Tech no is always in even digit

//example :- 2025 -> first divided
//20 and 25
//now add like 20+25 = 25
//now find square of 25 is 2025
// At last compare resulted value to initial number if match then tech no
public class TechNumber {
    static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            count++;
            number = number / 10;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        int hlf = countDigit(number);
        if (number % 2 == 0) {
            int power = (int) (Math.pow(10, (hlf / 2)));
            System.out.println((number / power) + (number % power));
        } else {
            System.out.println("Non Tech Number");
        }
        scanner.close();
    }
}
